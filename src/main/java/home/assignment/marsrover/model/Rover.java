package home.assignment.marsrover.model;

import home.assignment.marsrover.commands.Move;
import home.assignment.marsrover.commands.TurnLeft;
import home.assignment.marsrover.commands.TurnRight;
import javafx.util.Pair;

public class Rover {

	private int xAxis;
	private int yAxis;
	private String facing;
	private final Plateu plateu;
	private Pair myRIPpoint;

	public final Move move;
	public final TurnLeft turnLeft;
	public final TurnRight turnRight;

	public Rover(int xAxis, int yAxis, String facing, Plateu plateu) {
		move = new Move(this);
		turnLeft = new TurnLeft(this);
		turnRight = new TurnRight(this);

		this.plateu = plateu;
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

    public Pair getMyRIPpoint() {
        return myRIPpoint;
    }

    public void setMyRIPpoint(Pair myRIPpoint) {
        this.myRIPpoint = myRIPpoint;
    }
}
