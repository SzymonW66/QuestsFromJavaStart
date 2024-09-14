package Chapter40.ex2;

import java.util.List;
import java.util.stream.Collectors;

public class MusicCollection {
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );

        //method 1
        totalLengthByGenere(songs, Song.Genre.POP);
        totalLengthByGenere(songs, Song.Genre.ROCK);
        totalLengthByGenere(songs, Song.Genre.METAL);
        totalLengthByGenere(songs, Song.Genre.METAL);

        //method 2
        countSongsByArtist(songs, "Metallica");
        countSongsByArtist(songs, "Alicia Keys");
        countSongsByArtist(songs, "Imagine Dragons");
        countSongsByArtist(songs, "Iron Maiden");

        //method 3

        songsWithGenerFiltere(songs, Song.Genre.POP);

    }

    static int totalLengthByGenere(List<Song> songs, Song.Genre gener) {
        return songs.stream()
                .filter(song -> song.getGenre() == gener)
                .mapToInt(Song::getLength)
                .sum();
    }

    static long countSongsByArtist(List<Song> songs, String artist) {
        return songs.stream()
                .filter(song -> artist.equals(song.getArtist()))
                .count();
    }

    static List<Song> songsWithGenerFiltere(List<Song> songs, Song.Genre genreToRemove) {
        return songs.stream()
                .filter(song -> song.getGenre() != genreToRemove)
                .distinct()
                .collect(Collectors.toList());
    }


}
