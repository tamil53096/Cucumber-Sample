package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/opengoogle.feature", glue = "stepdefinition")
public class runnerclass {

}
