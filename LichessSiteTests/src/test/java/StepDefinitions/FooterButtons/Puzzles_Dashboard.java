package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArenaPage;
import pages.HomePage;
import pages.SignupPage;

public class Puzzles_Dashboard {
	WebDriver driver;
	HomePage home;
	ArenaPage arena;
	SignupPage register;
	private DriverInstance DriverInstance;

	public Puzzles_Dashboard(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
		driver = DriverInstance.getDriver();
	}

	@When("user hovers over Puzzles and clicks on Puzzle dashboard")
	public void user_hovers_over_puzzles_and_clicks_on_puzzle_dashboard() throws InterruptedException {
		home = new HomePage(driver);
		home.hover_Puzzles_Dashboard();
	}

	@Then("user is navigated to the register page")
	public void user_is_navigated_to_the_register_page() throws InterruptedException {
		register = new SignupPage(driver);
	}

	@And("register form is displayed")
	public void register_form_is_displayed() {
		register.registerformIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
