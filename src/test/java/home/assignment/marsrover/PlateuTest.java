package home.assignment.marsrover;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import home.assignment.marsrover.model.Rover;
import home.assignment.marsrover.operator.ControlCenter;

public class PlateuTest {

	protected Rover rover;
	protected final ControlCenter controlCenter = new ControlCenter();

	@Given("^Current position is (\\d+),(\\d+) with facing \"([^\"]*)\" and plateu size is (\\d+),(\\d+)$")
	public void current_position_is_with_facing_and_plateu_size_is(int xAxis, int yAxis, String facing, int xPlateu, int yPlateu) throws Throwable {
		rover = new Rover(xAxis, yAxis, facing, xPlateu, yPlateu);
	}

	@When("^I execute MM command$")
	public void i_execute_MM_command() throws Throwable {
		controlCenter.setCommand(rover.move);
		controlCenter.excute();
		controlCenter.excute();
	}

	@Then("^Mars rover should stop at the edge$")
	public void mars_rover_should_stop_at_the_edge() throws Throwable {
		assertThat(rover.getyAxis(), equalTo(rover.getPlateu().getyAxis()));
	}

}
