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
		int finalPosition;
		if (f.equals("N")) {
			finalPosition = this.rover.getyAxis() + 1;
			if (rover.getPlateu().getyAxis() >= finalPosition)
				this.rover.setyAxis(finalPosition);
		} else if (f.equals("S")) {
			finalPosition = this.rover.getyAxis() - 1;
			if (rover.getPlateu().getyAxis() >= finalPosition)
				this.rover.setyAxis(finalPosition);
		} else if (f.equals("E")) {
			finalPosition = this.rover.getxAxis() + 1;
			if (rover.getPlateu().getxAxis() >= finalPosition)
				this.rover.setxAxis(finalPosition);
		} else if (f.equals("W")) {
			finalPosition = this.rover.getxAxis() - 1;
			if (rover.getPlateu().getxAxis() >= finalPosition)
				this.rover.setxAxis(finalPosition);
		}
		logger.info("Final position of rover is {},{} and facing {}", rover.getxAxis(), rover.getyAxis(),rover.getFacing());

	}

}
