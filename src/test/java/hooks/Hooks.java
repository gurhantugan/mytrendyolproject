package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigurationReader;

import utilities.Driver;

public class Hooks {



    @Before
    public void navigateToRegistration(){

        Driver.getDriver().get(ConfigurationReader.getProperty("trendyolUrl"));

    }


    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");

        }

       Driver.closeDriver();
    }
}