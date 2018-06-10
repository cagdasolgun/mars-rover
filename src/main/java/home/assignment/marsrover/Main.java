package home.assignment.marsrover;

import java.io.IOException;
import java.util.List;

import home.assignment.marsrover.operator.ControlCenter;

public class Main {

	public static void main(String[] args) throws IOException {

		ControlCenter controlCenter = new ControlCenter();
		List<String> instructions = Utils.readInstructions();

		System.out.println(instructions);

	}

}
