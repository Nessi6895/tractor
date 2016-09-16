package ru.sbt.test.refactoring;

public class Tractor {

	private Position position;
	private Field field;
	Orientation orientation;

	public Tractor() {
		this(new Position(0,0), new Field(5,5), Orientation.NORTH);
	}

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
		if (!position.isInTheField(field)) {
			throw new TractorInDitchException("Out of field");
		}
	}

    public void turnClockwise() {
		orientation = orientation.turn();
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
