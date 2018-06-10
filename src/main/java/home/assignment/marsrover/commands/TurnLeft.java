package home.assignment.marsrover.commands;

import home.assignment.marsrover.model.Rover;

public class TurnLeft implements Command {

	private final Rover rover;

	public TurnLeft(Rover rover) {
		this.rover = rover;
	}

	@Override
	public void operate() {

		String f = this.rover.getFacing();

		if (f.equals("N")) {
			this.rover.setFacing("W");
		} else if (f.equals("S")) {
			this.rover.setFacing("E");
		} else if (f.equals("E")) {
			this.rover.setFacing("N");
		} else if (f.equals("W")) {
			this.rover.setFacing("S");
		}
	}

}
