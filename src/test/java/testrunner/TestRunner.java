package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


    @CucumberOptions(
            plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
            monochrome = true,
            glue = {"utility", "stepdefinition"},
            features = {"src/test/java/regression/Regression.feature"},
            tags = "@regression"
    )
public class TestRunner extends AbstractTestNGCucumberTests {


        @Override
        @DataProvider(parallel = false)
        public Object[][] scenarios() {
            return super.scenarios();
        }
    }
