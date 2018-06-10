package home.assignment.marsrover.model;

public class Rover {

	private int xAxis;
	private int yAxis;
	private String facing;

	public Rover() {

	}
	
	public void operate(String command) {
		
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
