package Runner;	

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\welcome\\eclipse-workspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\taggedhooks.feature", //the path of the feature files
		glue={"stepDefinitions"}, // the path of the step definition files
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}, //to generate different kinds of reporting
		monochrome = true, //displays the console o/p in a proper readable format in console
		strict=true, //It will check if any step is not defined in step definition file
		dryRun=false //dryRun=true -- It checks the mapping between feature file and step def file
		//tags= {"~@SmokeTest","~@RegressionTest","~@End2End"} //either smoke or regression
		)

//OR:
//tags= {"@SmokeTest,@RegressionTest"} //execute all test cases tagged as @SmokeTest OR @RegressionTest

//AND:
//tags= {"@SmokeTest","@RegressionTest"} //execute all test cases tagged as @SmokeTest AND @RegressionTest

//NOT:
//tags= {"~@SmokeTest","~@RegressionTest","~@End2End"}


 

public class TestRunner {

	

}
