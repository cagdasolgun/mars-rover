package home.assignment.marsrover.commands;

import home.assignment.marsrover.model.Rover;

public class TurnRight implements Command {

	private final Rover rover;

	public TurnRight(Rover rover) {
		this.rover = rover;
	}

	@Override
	public void operate() {
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

	}

}
