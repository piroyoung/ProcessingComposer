package io.piroyoung.music.sound;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoteTest {
    private static final Note note = Note.of(0);

    @Test
    void getFrequency() {
        assertEquals(440.0d, note.getFrequency());
    }

    @Test
    void getRelativeNote() {
        assertEquals(880.0d, note.getRelativeNote(Pitch.P8).getFrequency(), 0.00001);
    }

    @Test
    void getOctaveNote() {
        assertEquals(220.0d, note.getOctaveNote(-1).getFrequency(), 0.00001);
    }
}