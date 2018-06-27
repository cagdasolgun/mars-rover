package home.assignment.marsrover.model;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Plateu {

    private int xAxis;
    private int yAxis;
    private List<Pair<String ,Pair<Integer,Integer>>> ripPoints;


    public Plateu(int xPlateu, int yPlateu) {
        this.setxAxis(xPlateu);
        this.setyAxis(yPlateu);
        ripPoints = new ArrayList<Pair<String ,Pair<Integer,Integer>>>();
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

    public List<Pair<String ,Pair<Integer,Integer>>> getRipPoints() {
        return ripPoints;
    }


    public boolean canIMove(Rover rover) {
        boolean canI = true;
        for (Pair<String ,Pair<Integer,Integer>> point : this.getRipPoints()) {
            if (point.getKey() == rover.getFacing() && point.getValue().getKey() == rover.getxAxis() && point.getValue().getValue() == rover.getyAxis()) {
                canI = false;
            }
        }

        return canI;
    }
}
