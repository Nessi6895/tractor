package ru.sbt.test.refactoring;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isInTheField(Field field){
        if (getX() > field.getLength()) return false;
        if (getY() > field.getWidth()) return false;
        return true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}