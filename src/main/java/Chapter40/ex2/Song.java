package Chapter40.ex2;

import java.util.Objects;

public class Song {
    private String title;
    private int length;
    private String artist;
    private Genre genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Song(String title, int length, String artist, Genre genre) {
        this.title = title;
        this.length = length;
        this.artist = artist;
        this.genre = genre;
    }

    public enum Genre{
        METAL,
        POP,
        ROCK,
        DANCE
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song song)) return false;
        return length == song.length && Objects.equals(title, song.title) && Objects.equals(artist, song.artist) && genre == song.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, length, artist, genre);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre=" + genre +
                '}';
    }
}
