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
		position = orientation.move(position);
		if (field.isInTheField(position)) {
			throw new TractorInDitchException("Out of field");
		}
	}

    public void turnClockwise() {
		orientation.turn();
	}

	public int getPositionX() {
		return position.getX();
	}

	public int getPositionY() {
		return position.getY();
	}

	public Orientation getOrientation() {
		return orientation;
	}

}
