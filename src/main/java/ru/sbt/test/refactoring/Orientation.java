package ru.sbt.test.refactoring;

public enum Orientation {

	NORTH {
		Orientation turn() {
			return EAST;
		}

		Position move(Position oldPosition) {
			return new Position(oldPosition.getX(), oldPosition.getY() + 1);
		}
	}, WEST {
		Orientation turn() {
			return NORTH;
		}

		Position move(Position oldPosition) {
			return new Position(oldPosition.getX() - 1, oldPosition.getY());
		}
	}, SOUTH {
		Orientation turn() {
			return WEST;
		}

		Position move(Position oldPosition) {
			return new Position(oldPosition.getX(), oldPosition.getY() - 1);
		}
	}, EAST {
		Orientation turn() {
			return SOUTH;
		}

		Position move(Position oldPosition) {
			return new Position(oldPosition.getX() + 1, oldPosition.getY());
		}
	};

	abstract Orientation turn();

	abstract Position move(Position oldPosition);

}
