package io.cucumber.examples.calculator;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(plugin = { "html:target/results.html", "message:target/results.ndjson" }, tags = "@regression")
public class RunCucumberTestSanity extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
