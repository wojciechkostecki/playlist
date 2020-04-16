import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Playlist {

    public int playlistLength(Song... songs ){
        int playingTime = 0;
        for (Song song : songs) {
            playingTime += song.getDuration();
        }
        return playingTime;
    }

    public void printPlaylistDuration(int durationSong){
        Date d = new Date(durationSong * 1000L);
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        String time = df.format(d);
        System.out.println(time);
    }
}
