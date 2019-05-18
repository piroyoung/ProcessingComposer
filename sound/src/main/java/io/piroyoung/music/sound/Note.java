package io.piroyoung.music.sound;

public class Note {
    static final double HALF_TONE_MULTIPLIER = Math.pow(2.0, 1.0 / 12.0);
    static final double A1 = 440.0d;
    private final int n;

    private Note(final int n) {
        this.n = n;
    }

    public static Note of(final int n) {
        return new Note(n);
    }

    public double getFrequency() {
        return A1 * Math.pow(HALF_TONE_MULTIPLIER, this.n);
    }

    public Note getRelativeNote(final int pitch) {
        return Note.of(this.n + pitch);
    }

    public Note getRelativeNote(final int pitch, final int octave) {
        return Note.of(this.n + pitch + 12 * octave);
    }

    public Note getOctaveNote(final int octave) {
        return Note.of(this.n + octave * 12);
    }
}
