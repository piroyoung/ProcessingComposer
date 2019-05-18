package io.piroyoung.music.app;

import io.piroyoung.music.sound.Note;
import io.piroyoung.music.sound.Pitch;
import processing.core.PApplet;
import processing.sound.SinOsc;


public class Application extends PApplet {
    private static final int FRAME_RATE = 30;
    private static final Note note = Note.of(0);
    SinOsc sine1;
    SinOsc sine2;


    public static void main(String[] args) {
        PApplet.main("io.piroyoung.music.app.Application");
    }

    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        background(0);
        frameRate(1);
        Note root = Note.of(0);
        Note third = root.getRelativeNote(Pitch.m3);
        sine1 = new SinOsc(this);
        sine2 = new SinOsc(this);
        sine1.freq((float) root.getFrequency());
        sine2.freq((float) third.getFrequency());
        sine1.play();
        sine2.play();

    }

    @Override
    public void draw() {

    }
}
