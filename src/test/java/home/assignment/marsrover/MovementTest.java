package home.assignment.marsrover;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import home.assignment.marsrover.model.Rover;

public class MovementTest {

	private Rover rover;

	@Given("^Current position is (\\d+),(\\d+) and facing \"([^\"]*)\"$")
	public void current_position_is_and_facing(int xAxis, int yAxis, String facing) throws Throwable {
		rover = new Rover();
		rover.setxAxis(xAxis);
		rover.setyAxis(yAxis);
		rover.setFacing(facing);
	}

	@When("^I complete \"([^\"]*)\" command$")
	public void i_complete_command(String command) throws Throwable {
		rover.operate(command);
	}

	@Then("^Mars rover positions should be (\\d+),(\\d+) and still facing \"([^\"]*)\"$")
	public void mars_rover_positions_should_be_and_still_facing(int xAxis, int yAxis, String facing) throws Throwable {
		assertThat(rover.getxAxis(), equalTo(xAxis));
		assertThat(rover.getyAxis(), equalTo(yAxis));
		assertThat(rover.getFacing(), equalTo(facing));
	}

	@Then("^Mars rover positions should still be (\\d+),(\\d+) and still facing \"([^\"]*)\"$")
	public void mars_rover_positions_should_still_be_and_still_facing(int arg1, int arg2, String arg3)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I complete \"([^\"]*)\" commant$")
	public void i_complete_commant(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
