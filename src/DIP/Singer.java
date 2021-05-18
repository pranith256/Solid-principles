package DIP;

import SRP.Song;

public class Singer
{
    public void findSinger(Song s)
    {
        getSinger(s);
    }
    public void getSinger(Song s)
    {
        System.out.println("found the singer");
    }
}
