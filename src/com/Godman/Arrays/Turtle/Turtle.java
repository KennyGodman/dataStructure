package com.Godman.Arrays.Turtle;

public class Turtle {
    private Pen turtlePen;

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    private int xCoordinate;
    private int yCoordinate;
    public Pen getTurtlePen() {
        return turtlePen;
    }

    public void setTurtlePen(Pen turtlePen) {
        this.turtlePen = turtlePen;
    }

    public Turtle(){
        turtlePen = new Pen();
    }
    public  Turtle (Pen pen){
        turtlePen = pen;

    }

    public void moveForward(int numberOfSteps) {
        xCoordinate = numberOfSteps - 1;

    }
}
