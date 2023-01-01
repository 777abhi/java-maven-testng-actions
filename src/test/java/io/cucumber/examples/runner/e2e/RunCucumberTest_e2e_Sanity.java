package io.cucumber.examples.runner.e2e;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    plugin = { "html:target/results.html", "message:target/results.ndjson" },
    features = {"src/test/resources/features" },
	glue = {"io.cucumber.examples.calculator"}, 
    tags = "@sanity")
public class RunCucumberTest_e2e_Sanity extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
