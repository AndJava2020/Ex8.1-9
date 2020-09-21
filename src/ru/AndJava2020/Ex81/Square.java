package ru.AndJava2020.Ex81;

import java.awt.*;

public class Square extends Rectangle {

    public Square(double width, double centerX, double centerY) {
        super(width, width, centerX,centerY);
    }

    @Override
    public void draw(Graphics2D p) {
        super.draw(p);
        p.drawRect(centerX,centerY,(int)width,(int)width);
    }


}
