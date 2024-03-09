import java.util.HashMap;
import java.util.Set;
public class HashMapTest {
    public static  void main(String [] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        // Add known songs to the trackList
        trackList.put("Bohemian Rhapsody", "Is this the real life? Is this just fantasy?");
        trackList.put("Shape of You", "The club isn't the best place to find a lover...");
        trackList.put("Someone Like You", "Never mind, I'll find someone like you...");
        trackList.put("Dancing Queen", "You can dance, you can jive, having the time of your life...");

        // Retrieve lyrics based on song name
        String songName = "Shape of You";
        String lyrics = trackList.get(songName);
        System.out.println("Lyrics for " + songName + ": " + lyrics);

        // get the keys by using the keySet method
        Set<String> keys =  trackList.keySet();
        for(String key : keys) {
            System.out.println(key +" : "+trackList.get(key));
        }
    }
}
