public class Playlist {

    public int playlistLength(Song... songs ){
        int playingTime = 0;
        for (Song song : songs) {
            playingTime += song.getDuration();
        }
        return playingTime;
    }
}
