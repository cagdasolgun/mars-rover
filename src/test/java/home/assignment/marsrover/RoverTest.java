package home.assignment.marsrover;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import home.assignment.marsrover.model.Rover;
import home.assignment.marsrover.operator.ControlCenter;

public class RoverTest {

	protected Rover rover;
	protected final ControlCenter controlCenter = new ControlCenter();

	@Given("^Current position is (\\d+),(\\d+) and facing \"([^\"]*)\"$")
	public void current_position_is_and_facing(int xAxis, int yAxis, String facing) throws Throwable {
		//rover = new Rover(xAxis,yAxis,facing,7,7);
	}

	@When("^I execute Move command$")
	public void i_execute_Move_command() throws Throwable {
		controlCenter.setCommand(rover.move);
		controlCenter.excute(rover);
	}

	@When("^I execute Left command$")
	public void i_execute_Left_command() throws Throwable {
		controlCenter.setCommand(rover.turnLeft);
		controlCenter.excute(rover);
	}

	@When("^I execute Right command$")
	public void i_execute_Right_commant() throws Throwable {
		controlCenter.setCommand(rover.turnRight);
		controlCenter.excute(rover);
	}

	@Then("^Mars rover positions should be (\\d+),(\\d+) and facing \"([^\"]*)\"$")
	public void mars_rover_positions_should_be_and_facing(int xAxis, int yAxis, String facing) throws Throwable {
		assertThat(rover.getxAxis(), equalTo(xAxis));
		assertThat(rover.getyAxis(), equalTo(yAxis));
		assertThat(rover.getFacing(), equalTo(facing));
	}

}
