package home.assignment.marsrover.commands;

import home.assignment.marsrover.model.Rover;

public class Move implements Command {

	private final Rover rover;

	public Move(Rover rover) {
		this.rover = rover;
	}

	@Override
	public void operate() {

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

	}

}
