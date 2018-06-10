package home.assignment.marsrover.model;

public class Plateu {
	
	private int xAxis;
	private int yAxis;

	public Plateu(int xPlateu, int yPlateu) {
		this.setxAxis(xPlateu);
		this.setyAxis(yPlateu);
	}

	public int getxAxis() {
		return xAxis;
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
