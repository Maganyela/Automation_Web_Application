package utility;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.util.logging.Logger;

public class Hooks {
    private final Logger logger = Logger.getLogger(Hooks.class.getName());
    private ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private ThreadLocal<Scenario> currentScenario = new ThreadLocal<>();
    private DriverFactory driverFactory = new DriverFactory();


    /**
     * Before excuting the init_driver function from driverfactory
     * has to launch the browser first and open the urls
     *
     * @param scenario
     */
    @Before
    public void setup(Scenario scenario) {
        currentScenario.set(scenario);
        driver.set(driverFactory.init_driver());
    }

    /**
     * After every action happenning on the excuting it take
     * the screenshot for test that runs on the same browser
     */
    @AfterStep
    public void teardown() {
        Scenario scenario = currentScenario.get();
        if (scenario != null) {
            // Capture screenshot if the scenario has the @regression tag
            if (scenario.getSourceTagNames().contains("@regression")) {

                byte[] screenshot = attachScreenshot(driver.get());
                scenario.attach(screenshot, "image/png", "Screenshot");
                logger.info("Screenshot attached to Allure report.");

            }
        }
    }
    /**
     * The function that take the screenshots
     */

    @Attachment(value = "Screenshot", type = "image/png")
    public static byte[] attachScreenshot (WebDriver driver){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
