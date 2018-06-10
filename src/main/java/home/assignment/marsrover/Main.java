package home.assignment.marsrover;

import java.io.IOException;
import java.util.List;

import home.assignment.marsrover.model.Plateu;
import home.assignment.marsrover.model.Rover;
import home.assignment.marsrover.operator.ControlCenter;

public class Main {

	public static void main(String[] args) throws IOException {

		ControlCenter controlCenter = new ControlCenter();
		List<String> instructions = Utils.readInstructions();

		String[] plateuCoordinates = instructions.get(0).split(" ");

		for (int i = 1; i < instructions.size(); i = i + 2) {
			String[] commands = instructions.get(i + 1).split("");
			String[] roverInfo = instructions.get(i).split(" ");
			Rover rover = new Rover(Integer.parseInt(roverInfo[0]), Integer.parseInt(roverInfo[1]), roverInfo[2],
					Integer.parseInt(plateuCoordinates[0]), Integer.parseInt(plateuCoordinates[1]));

			for (String command : commands) {
				if(command.equals("M"))
					controlCenter.setCommand(rover.move);
				if(command.equals("L"))
					controlCenter.setCommand(rover.turnLeft);
				if(command.equals("R"))
					controlCenter.setCommand(rover.turnRight);
				
				controlCenter.excute();
				
				
			}
			
			System.out.println("----");

		}

	}

}
