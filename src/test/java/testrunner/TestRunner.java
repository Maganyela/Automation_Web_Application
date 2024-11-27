package testrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import utility.DriverFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


@CucumberOptions(
            plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
            monochrome = true,
            glue = {"utility", "stepdefinition"},
            features = {"src/test/java/regression/Regression.feature"},
            tags = "@regression"
    )

public class TestRunner extends AbstractTestNGCucumberTests {

        private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
        private Properties prop;

        public Properties init_prop() {
            prop = new Properties();
            try {
                FileInputStream ip = new FileInputStream("src/test/resources/cucumber.properties");
                prop.load(ip);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return prop;
        }


        @Override
        @DataProvider(parallel = false)
        public Object[][] scenarios() {
            return super.scenarios();
        }


        @BeforeClass
        @Parameters("browser") // Keep here to directly bind the annotation to the method
        public WebDriver init_driver(String browser) {
            // Check if driver is already initialized to avoid reopening the browser
            if (driver.get() == null) {
                System.out.println("Browser value is: " + browser);
                if (browser.equalsIgnoreCase("chrome")) {
                    WebDriverManager.chromedriver().setup();
                    driver.set(new ChromeDriver());
                } else if (browser.equalsIgnoreCase("edge")) {
                    WebDriverManager.edgedriver().setup();
                    driver.set(new EdgeDriver());
                } else {
                    System.out.println("Please pass the correct browser value: " + browser);

                }
                // Manage cookies and window settings
                getDriver().manage().deleteAllCookies();
                getDriver().manage().window().maximize();
            }
            return driver.get();
        }

        public static WebDriver getDriver() {
            return driver.get();
        }

    public static String getUrl(String key) {
        return new TestRunner().init_prop().getProperty(key);

    }
    }
