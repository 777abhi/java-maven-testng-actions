package io.cucumber.examples.runner.s1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    plugin = { "html:target/results.html", "message:target/results.ndjson" }
    features = {"src/test/resources/features" },
    glue = {"io.cucumber.examples.calculator"}, 
    tags = "@s1_newfeature")
public class RunCucumberTest_s1_newFeature extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
