package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
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


    public WebDriver init_driver() {
        // Check if driver is already initialized to avoid reopening the browser
        if (driver.get() == null) {
            // Load properties
            Properties prop = init_prop();
            String browser = prop.getProperty("browser"); // Read browser from properties
            System.out.println("Browser value is: " + browser);
            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());
            } else if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver.set(new FirefoxDriver());
            } else if (browser.equalsIgnoreCase("safari")) {
                driver.set(new SafariDriver());
            } else {
                System.out.println("Please pass the correct browser value: " + browser);
            }
            getDriver().manage().deleteAllCookies();
            getDriver().manage().window().maximize();
        }
        return driver.get();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove(); // Clear the ThreadLocal instance
        }
    }

    public static String getUrl(String key) {
        return new DriverFactory().init_prop().getProperty(key);
    }
}

