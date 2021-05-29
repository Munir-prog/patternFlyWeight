package com.mprog;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Field extends JFrame {
    private final ArrayList<Ear> ears = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        EarType type = EarFactory.getEarType(name, color, otherTreeData);
        Ear ear = new Ear(x, y, type);
        ears.add(ear);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Ear ear : ears) {
            ear.draw(graphics);
        }
    }
}
