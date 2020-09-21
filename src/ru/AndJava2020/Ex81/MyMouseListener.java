package ru.AndJava2020.Ex81;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {
    Window m;
    MyMouseListener(Window m){
        this.m=m;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        m.paint(m.getGraphics());
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
