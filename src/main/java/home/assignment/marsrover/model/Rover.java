package home.assignment.marsrover.model;

import home.assignment.marsrover.commands.Move;
import home.assignment.marsrover.commands.TurnLeft;
import home.assignment.marsrover.commands.TurnRight;

public class Rover {

	private int xAxis;
	private int yAxis;
	private String facing;
	private final Plateu plateu;

	public final Move move;
	public final TurnLeft turnLeft;
	public final TurnRight turnRight;

	public Rover(int xAxis, int yAxis, String facing, int xPlateu, int yPlateu) {
		move = new Move(this);
		turnLeft = new TurnLeft(this);
		turnRight = new TurnRight(this);

		plateu = new Plateu(xPlateu, yPlateu);
		this.setFacing(facing);
		this.setxAxis(xAxis);
		this.setyAxis(yAxis);
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

	public Plateu getPlateu() {
		return plateu;
	}

}
