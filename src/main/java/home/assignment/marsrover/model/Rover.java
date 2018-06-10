package home.assignment.marsrover.model;

import home.assignment.marsrover.commands.Move;
import home.assignment.marsrover.commands.TurnLeft;
import home.assignment.marsrover.commands.TurnRight;

public class Rover {

	private int xAxis;
	private int yAxis;
	private String facing;
	
	public final Move move;
	public final TurnLeft turnLeft;
	public final TurnRight turnRight;

	public Rover() {
		move = new Move(this);
		turnLeft = new TurnLeft(this);
		turnRight = new TurnRight(this);
	}
	
	public String getFacing() {
		return facing;
	}

	public int getxAxis() {
		return xAxis;
	}

	public void setFacing(String facing) {
		this.facing = facing;
	}

	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}

	public int getyAxis() {
		return yAxis;
	}

	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}

}
