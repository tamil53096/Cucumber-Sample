package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/datatablewithoutheader.feature", glue = "stepdefinition" ,
					plugin = "html:report/Webreport" )

public class datatablewithoutheader {
	
	

}
