package ru.AndJava2020.Ex81;

import java.awt.*;

public abstract class Shape {
    protected int centerX;
    protected int centerY;

    public Shape() {
    }

    public  void generateXY(int x, int y){
        centerX=x;
        centerY=y;
    }

    public abstract void draw(Graphics2D p);
}
