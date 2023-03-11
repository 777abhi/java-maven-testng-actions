package io.cucumber.examples.calculator;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.testng.Assert.assertEquals;

public class RpnCalculatorStepDefinitions {

    private RpnCalculator calc;

    @BeforeAll
    public static void beforeAll() {
        // Runs before all scenarios
    }

    @AfterAll
    public static void afterAll() {
        // Runs after all scenarios
    }

    @Before("not @foo")
    public void before(Scenario scenario) {
        scenario.log("Runs before each scenarios *not* tagged with @foo");
    }

    @After
    public void after(Scenario scenario) {
        scenario.log("Runs after each scenarios");
    }

    @Given("a calculator I just turned on")
    public void a_calculator_I_just_turned_on() {
        calc = new RpnCalculator();
    }

    @When("I add {int} and {int}")
    public void adding(int arg1, int arg2) throws IOException {


    // Create desired capabilities for Chrome browser
    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            
    // Specify remote URL for Selenium server
    URL url = new URL(System.getProperty("webdriver.chrome.url"));

    // Create a RemoteWebDriver instance with the specified capabilities and URL
    WebDriver driver = new RemoteWebDriver(url, capabilities);

    // Navigate to a web page and perform tests
    driver.get("http://www.example.com/");

    // Assert that the page title contains the expected string
    String expectedTitle = "Example Domain";
    String actualTitle = driver.getTitle();
    Assert.assertTrue(actualTitle.contains(expectedTitle), "Page title does not contain expected string: " + expectedTitle);
    
    // Take a screenshot if the assertion fails
        // Create the target directory if it does not already exist
        Path targetDir = Paths.get("target/screenshots");
        if (!Files.exists(targetDir)) {
            Files.createDirectories(targetDir);
        }
        
        // Take the screenshot and save it to the target directory
        File screenshotFile = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(screenshotFile.toPath(), targetDir.resolve("failure.png"));

    // ...

    // Close the browser and end the Selenium session
    driver.quit();

        calc.push(arg1);
        calc.push(arg2);
        calc.push("+");
    }

    @Given("^I press (.+)$")
    public void I_press(String what) {
        calc.push(what);
    }

    @Then("the result is {int}")
    public void the_result_is(double expected) {
        assertEquals(expected, calc.value());
    }

    @Given("the previous entries:")
    public void thePreviousEntries(List<Entry> entries) {
        for (Entry entry : entries) {
            calc.push(entry.first);
            calc.push(entry.second);
            calc.push(entry.operation);
        }
    }

    @DataTableType
    public Entry entry(Map<String, String> entry) {
        return new Entry(
            Integer.valueOf(entry.get("first")),
            Integer.valueOf(entry.get("second")),
            entry.get("operation"));
    }

    static final class Entry {

        private final Integer first;
        private final Integer second;
        private final String operation;

        Entry(Integer first, Integer second, String operation) {
            this.first = first;
            this.second = second;
            this.operation = operation;
        }

    }

}
