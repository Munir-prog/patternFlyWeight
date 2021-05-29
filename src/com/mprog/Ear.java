package com.mprog;

import java.awt.*;

public class Ear/*Колос*/ {
    private int x;
    private int y;
    private EarType type;

    public Ear(int x, int y, EarType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
