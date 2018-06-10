package home.assignment.marsrover.commands;

import home.assignment.marsrover.model.Rover;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Move implements Command {

	private static final Logger logger = LogManager.getLogger(Move.class);

	private final Rover rover;

	public Move(Rover rover) {
		this.rover = rover;
	}

	@Override
	public void operate() {
		logger.info("Move command is being operated on rover located in {},{}", rover.getxAxis(), rover.getyAxis());

		String f = this.rover.getFacing();
		if (f.equals("N")) {
			this.rover.setyAxis(this.rover.getyAxis() - 1);
		} else if (f.equals("S")) {
			this.rover.setyAxis(this.rover.getyAxis() + 1);
		} else if (f.equals("E")) {
			this.rover.setxAxis(this.rover.getxAxis() + 1);
		} else if (f.equals("W")) {
			this.rover.setxAxis(this.rover.getxAxis() - 1);
		}
		logger.info("Final position of rover is {},{}", rover.getxAxis(), rover.getyAxis());

	}

}
