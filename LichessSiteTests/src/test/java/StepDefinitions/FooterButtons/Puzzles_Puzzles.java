package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArenaPage;
import pages.HomePage;
import pages.PuzzlePage;

public class Puzzles_Puzzles {
	WebDriver driver;
	HomePage home;
	ArenaPage arena;
	PuzzlePage puzzle;
	private DriverInstance DriverInstance;

	public Puzzles_Puzzles(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
		driver = DriverInstance.getDriver();
	}
	
	@When("user clicks on Puzzles")
	public void user_clicks_on_puzzles() throws InterruptedException {
		home = new HomePage(driver);
		home.clickPuzzles();
		Thread.sleep(3000);
	}

	@When("user hovers over Puzzles and clicks on Puzzles")
	public void user_hovers_over_puzzles_and_clicks_on_puzzles() throws InterruptedException {
		home = new HomePage(driver);
		home.hover_Puzzles_Puzzles();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Puzzles page")
	public void user_is_navigated_to_the_puzzles_page() throws InterruptedException {
		puzzle = new PuzzlePage(driver);
	}

	@And("puzzle gameboard is displayed")
	public void puzzle_gameboard_is_displayed() {
		puzzle.puzzlegameboardIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
