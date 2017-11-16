package com.cucumber.SF.com_Project;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SF_com_Project_Step
{

	WebDriver ffdriver = new FirefoxDriver();

	@Test
	@Before
	public void beforescenarios()
	{
		// set system property for geckodriver for firefox
		System.setProperty("webdriver.gecko.driver", "c:/bin/geckodriver/geckodriver.exe");
		System.out.println("TEST STARTED!");
	}

	@After
	public void afterscenarios()
	{
		ffdriver.quit();
		System.out.println("TEST COMPLETED!");
	}

	@Given("^I launch statefarm.com application$")
	public void I_launch_statefarm_com_application()
	{
		org.openqa.selenium.Dimension dimension = new org.openqa.selenium.Dimension(1530, 810);
		ffdriver.manage().window().setSize(dimension);
		ffdriver.get("https://www.statefarm.com/");
		System.out.println("I launch statefarm.com application");
	}

	@When("^I click on Agents button$")
	public void I_click_on_Agents_button()
	{
		WebElement agentbutton = ffdriver.findElement(By.id("tab4"));
		agentbutton.click();
		System.out.println("I click on Agents button");
	}

	@And("^enter a zip code$")
	public void enter_a_zip_code()
	{
		WebElement zipinput = ffdriver.findElement(By.id("qam-agent-zip-code-input"));
		zipinput.clear();
		zipinput.sendKeys("61704");
		System.out.println("enter a zip code");
	}

	@And("^click on Find an Agent$")
	public void click_on_Find_an_Agent()
	{
		WebElement findagentbutton = ffdriver.findElement(By.id("qam-agent-find-agent-button"));
		findagentbutton.click();
		System.out.println("click on Find an Agent");
	}

	@Then("^I am provided a list of agents$")
	public void I_am_provided_a_list_of_agents()
	{
		System.out.println("I am provided a list of agents");
	}

	@Given("^a list of Agents for a zip code$")
	public void a_list_of_Agents_for_a_zip_code()
	{

	}

	@When("^I enter \"([a-zA-Z]{1,})\"$")
	public void I_enter_firstname(String fname)
	{
		WebElement firstname = ffdriver.findElement(By.id("firstName"));
		firstname.sendKeys(fname);
	}

	@And("^enter \"([a-zA-Z]{1,})\"$")
	public void enter_lastname(String lname)
	{
		WebElement lastname = ffdriver.findElement(By.id("lastName"));
		lastname.sendKeys(lname);
	}

	@And("^click on search$")
	public void click_on_search()
	{
		WebElement searchbutton = ffdriver.findElement(By.id("search"));
		searchbutton.click();
	}

	@Then("^I am provided the agent details if available$")
	public void I_am_provided_the_agent_details_if_available()
	{

	}


}
