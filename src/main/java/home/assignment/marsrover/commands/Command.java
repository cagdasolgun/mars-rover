package home.assignment.marsrover.commands;

import home.assignment.marsrover.model.Rover;

public interface Command {
	void operate();
	default boolean roverIsDead(Rover rover){
		return rover.getMyRIPpoint() != null;
	}
}
