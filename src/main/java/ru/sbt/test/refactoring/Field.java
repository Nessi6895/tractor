package ru.sbt.test.refactoring;

public class Field {
    private final int length;
    private final int width;

    public Field(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public boolean isInTheField(Position position) {
        if (position.getX() <= 0 || position.getX() > length) return false;
        if (position.getY() <= 0 || position.getY() > width) return false;
        return true;
    }
}
