package home.assignment.marsrover.operator;

import home.assignment.marsrover.commands.Command;

public class ControlCenter {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void excute() {
		command.operate();
	}

}
