package ru.sbt.test.refactoring;

public class Main {
    public static void main(String[] args) {
        Tractor tractor = new Tractor();
        tractor.move("F");
        tractor.move("T");
        System.out.println(tractor.getOrientation());
    }
}
