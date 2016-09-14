package ru.sbt.test.refactoring;

public class Tractor {

	private Position position;
	private Field field;
	Orientation orientation;

	public Tractor(Position position, Field field, Orientation orientation) {
		this.position = position;
		this.field = field;
		this.orientation = orientation;
	}

	public void move(String command) {
        if (command == "F") {
			moveForwards();
		} else if (command == "T") {
			turnClockwise();
		}
	}

    public void moveForwards() {
		pos
		if (position[0] > field[0] || position[1] > field[1]) {
			throw new TractorInDitchException();
		}
	}

    public void turnClockwise() {
		if (orientation == Orientation.NORTH) {
			orientation = Orientation.EAST;
		} else if (orientation == Orientation.EAST) {
			orientation = Orientation.SOUTH;
		} else if (orientation == Orientation.SOUTH) {
			orientation = Orientation.WEST;
		} else if (orientation == Orientation.WEST) {
			orientation = Orientation.NORTH;
		}
	}

	public int getPositionX() {
		return position[0];
	}

	public int getPositionY() {
		return position[1];
	}

	public Orientation getOrientation() {
		return orientation;
	}

}
