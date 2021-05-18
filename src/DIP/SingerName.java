package DIP;

import SRP.Song;

interface ISinger
{
    public void findName(Song s);
}

class PSinger implements ISinger {

    public void findName(Song s) {
        System.out.println("found the singer");

    }
}

public class SingerName
{
    public static void findSinger(ISinger s)
    {
        s.findName((Song) s);
    }


}
