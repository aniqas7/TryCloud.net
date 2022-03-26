package net.trycloud.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import net.trycloud.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void tearDown(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
        Driver.closeDriver();
    }

}