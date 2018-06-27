package home.assignment.marsrover.commands;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import home.assignment.marsrover.model.Rover;

public class TurnLeft implements Command {

    private static final Logger logger = LogManager.getLogger(TurnLeft.class);

    private final Rover rover;

    public TurnLeft(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void operate() {

        logger.info("Turn left command is being operated on rover located in {},{}", rover.getxAxis(), rover.getyAxis());

        String f = this.rover.getFacing();

        if (f.equals("N")) {
            this.rover.setFacing("W");
        } else if (f.equals("S")) {
            this.rover.setFacing("E");
        } else if (f.equals("E")) {
            this.rover.setFacing("N");
        } else if (f.equals("W")) {
            this.rover.setFacing("S");
        }

        logger.info("Final position of rover is {},{} and facing {}", rover.getxAxis(), rover.getyAxis(), rover.getFacing());


    }

}
