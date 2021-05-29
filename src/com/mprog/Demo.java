package com.mprog;

import java.awt.*;

public class Demo {
    static int CANVAS_SIZE = 5000;
    static int EARS_TO_DRAW = 1000000;
    static int EAR_TYPES = 2;

    public static void main(String[] args) {
        Field field = new Field();
        for (int i = 0; i < Math.floor(EARS_TO_DRAW / EAR_TYPES); i++) {
            field.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer field", Color.decode("#ffc800"), "Field texture");
            field.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn field", Color.ORANGE, "Autumn field texture");
        }
        field.setSize(CANVAS_SIZE, CANVAS_SIZE);
        field.setVisible(true);

        System.out.println(EARS_TO_DRAW + " Field drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Ear size (8 bytes) * " + EARS_TO_DRAW);
        System.out.println("+ EarTypes size (~30 bytes) * " + EAR_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((EARS_TO_DRAW * 8 + EAR_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((EARS_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}