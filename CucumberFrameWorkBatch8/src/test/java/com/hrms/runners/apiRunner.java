package com.hrms.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/",
                               glue= "com/hrms/api",
                               dryRun = false,// when set as true, will run over the feature steps and reveal unimplemented steps in  conspl
                                tags = {"@apiWorkflow"},// adding tags
                                monochrome = true,
                               strict = false,// when set as true, will fail the execution when undefined step is cons
                              plugin = {"pretty", //will print executed steps inside console
                                       "html:target/cucumber-default-reports",// generates default html report
                                      "rerun:target/FailedTests.txt",// generates a txt file with failed  tests only
                                     "json:target/cucumber.json"// generates json report
}
)
public class apiRunner {
}

