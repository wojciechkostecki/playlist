public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        Song song1 = new Song("BUBBLETEA", 284);
        Song song2 = new Song("Ground Zero", 178);
        Song song3 = new Song("Chcemy być wyżej", 186);
        Song song4 = new Song("Nie byłem nigdy", 179);

        playlist.printPlaylistDuration(playlist.playlistLength(song1,song2,song3, song4));
    }
}
