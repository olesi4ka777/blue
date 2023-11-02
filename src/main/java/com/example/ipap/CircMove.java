package com.example.multicircle;

import javafx.scene.shape.Circle;

public class CircMove extends Thread{
    Circle circle;
    int dist;
    int kolvo;

    public CircMove(javafx.scene.shape.Circle circle, int dist, int kolvo) {
        this.circle = circle;
        this.dist = dist;
        this.kolvo = kolvo;
    }
    @Override
    public void run() {
        try {
            for (int i=0; i<kolvo; i++) {
                sleep(500);
                circle.setCenterX(circle.getCenterX() + dist);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}