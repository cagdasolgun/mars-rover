package home.assignment.marsrover.commands;

import home.assignment.marsrover.model.Plateu;
import home.assignment.marsrover.model.Rover;
import javafx.util.Pair;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Move implements Command {

    private static final Logger logger = LogManager.getLogger(Move.class);

    private final Rover rover;

    public Move(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void operate() {

        logger.info("Move command is being operated on rover located in {},{}", rover.getxAxis(), rover.getyAxis());

        String f = this.rover.getFacing();
        int finalPosition;
        Plateu plateu = rover.getPlateu();

        if (f.equals("N")) {
            finalPosition = this.rover.getyAxis() + 1;
            if (plateu.canIMove(this.rover)) {
                if (plateu.getyAxis() >= finalPosition) {
                    this.rover.setyAxis(finalPosition);
                } else {
                    this.rover.setMyRIPpoint(new Pair<>(rover.getxAxis(), this.rover.getyAxis()));
                    plateu.getRipPoints().add(new Pair<>(rover.getFacing(),new Pair<>(rover.getxAxis(), this.rover.getyAxis())));
                }
            }


        } else if (f.equals("S")) {
            finalPosition = this.rover.getyAxis() - 1;
            if (plateu.canIMove(this.rover)) {
                if (plateu.getyAxis() >= finalPosition) {
                    this.rover.setyAxis(finalPosition);
                } else {
                    this.rover.setMyRIPpoint(new Pair<>(rover.getxAxis(), this.rover.getyAxis()));
                    plateu.getRipPoints().add(new Pair<>(rover.getFacing(),new Pair<>(rover.getxAxis(), this.rover.getyAxis())));
                }
            }


        } else if (f.equals("E")) {
            finalPosition = this.rover.getxAxis() + 1;
            if (plateu.canIMove(this.rover)) {
                if (plateu.getxAxis() >= finalPosition) {
                    this.rover.setxAxis(finalPosition);
                } else {
                    this.rover.setMyRIPpoint(new Pair<>(rover.getxAxis(), this.rover.getyAxis()));
                    plateu.getRipPoints().add(new Pair<>(rover.getFacing(),new Pair<>(rover.getxAxis(), this.rover.getyAxis())));
                }
            }


        } else if (f.equals("W")) {
            finalPosition = this.rover.getxAxis() - 1;
            if (plateu.canIMove(this.rover)) {
                if (plateu.getxAxis() >= finalPosition) {
                    this.rover.setxAxis(finalPosition);
                } else {
                    this.rover.setMyRIPpoint(new Pair<>(rover.getxAxis(), this.rover.getyAxis()));
                    plateu.getRipPoints().add(new Pair<>(rover.getFacing(),new Pair<>(rover.getxAxis(), this.rover.getyAxis())));
                }
            }
        }

        if (roverIsDead(rover)) {
            logger.info("Final position of rover is {},{} and facing {} and RIP", rover.getxAxis(), rover.getyAxis(), rover.getFacing());
        } else {
            logger.info("Final position of rover is {},{} and facing {}", rover.getxAxis(), rover.getyAxis(), rover.getFacing());
        }


    }

}
