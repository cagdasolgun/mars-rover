package home.assignment.marsrover.commands;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import home.assignment.marsrover.model.Rover;

public class TurnRight implements Command {

	private static final Logger logger = LogManager.getLogger(TurnRight.class);

	private final Rover rover;

	public TurnRight(Rover rover) {
		this.rover = rover;
	}

	@Override
	public void operate() {

		logger.info("Turn right command is being operated on rover located in {},{}", rover.getxAxis(),
				rover.getyAxis());

		String f = this.rover.getFacing();

		if (f.equals("N")) {
			this.rover.setFacing("E");
		} else if (f.equals("S")) {
			this.rover.setFacing("W");
		} else if (f.equals("E")) {
			this.rover.setFacing("S");
		} else if (f.equals("W")) {
			this.rover.setFacing("N");
		}

		logger.info("Final position of rover is {},{}", rover.getxAxis(), rover.getyAxis());

	}

}
