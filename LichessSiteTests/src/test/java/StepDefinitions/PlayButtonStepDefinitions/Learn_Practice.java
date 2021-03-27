package StepDefinitions.PlayButtonStepDefinitions;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArenaPage;
import pages.HomePage;
import pages.PracticePage;

public class Learn_Practice {
	WebDriver driver;
	HomePage home;
	ArenaPage arena;
	PracticePage practice;
	private DriverInstance DriverInstance;

	public Learn_Practice(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
	}
	
	@When("user clicks on Learn")
	public void user_clicks_on_learn() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.clickLearn();
		Thread.sleep(5000);
	}

	@When("user hovers over Learn and clicks on Practice")
	public void user_hovers_over_learn_and_clicks_on_practice() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Learn_Practice();
		Thread.sleep(5000);
	}

	@Then("user is navigated to the Practice page")
	public void user_is_navigated_to_the_practice_page() throws InterruptedException {
		driver = DriverInstance.getDriver();
		practice = new PracticePage(driver);
	}

	@And("practice form is displayed")
	public void practice_form_is_displayed() {
		driver = DriverInstance.getDriver();
		practice.practiceformIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
