package ru.AndJava2020.Ex81;

import java.awt.*;

public class Circle extends Shape {
    protected double radius;

    public Circle(double radius, double centerX, double centerY) {

        super.generateXY((int)centerX,(int)centerY);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics2D p) {
        p.drawRoundRect(centerX,centerY,(int)radius*2,(int)radius*2,10000,10000);

    }


}
