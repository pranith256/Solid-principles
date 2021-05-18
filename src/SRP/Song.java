package SRP;

import com.sun.jdi.connect.Connector;

class Music1 {

    public void playMusic()
    {
        System.out.println("playing the song");
    }
}

 class SearchMusic
{
    public void searchSong()
    {
        System.out.println("Searching for the song ");
    }
}

public class Song {
    public static void main(String args[]) {
        Music1 m = new Music1();
        m.playMusic();
        SearchMusic s = new SearchMusic();
        s.searchSong();
    }
}

