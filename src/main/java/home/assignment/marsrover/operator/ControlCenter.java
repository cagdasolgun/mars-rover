package home.assignment.marsrover.operator;

import home.assignment.marsrover.commands.Command;
import home.assignment.marsrover.model.Rover;

public class ControlCenter {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void excute(Rover rover) {
		if(rover.getMyRIPpoint() == null)
			command.operate();
	}

}
