package com.cucumber.SF.com_Project;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = "src/test/resources", plugin =
{ "pretty", "html:target/cucumber-html-report" })

public class SF_com_Project_Test
{

}
