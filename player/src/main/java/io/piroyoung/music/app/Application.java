package io.piroyoung.music.app;

import processing.core.PApplet;
import io.piroyoung.music.sound.Note;

public class Application extends PApplet {
    private static final int FRAME_RATE = 30;
    private static final Note note = Note.of(0);


    public static void main(String[] args) {
        PApplet.main("music.app.Application");
    }

    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        background(0);
        frameRate(FRAME_RATE);
    }

    @Override
    public void draw() {

    }
}
