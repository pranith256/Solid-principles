package OCP;

abstract class WeeklyTop1 {

    public abstract void weeklyTopSongs();
}

class BollywoodTopList extends WeeklyTop1 {
    public void weeklyTopSongs() {
        System.out.println("These are topsongs in bollywood");

    }
}

class TollywoodTopList extends WeeklyTop1 {
    public void weeklyTopSongs() {
        System.out.println("These are topsongs in tollywood");

    }
}

public class WeekTopSongs
{
    public static void main(String args[])
    {
         BollywoodTopList bt = new BollywoodTopList();
         TollywoodTopList tt = new TollywoodTopList();
        bt.weeklyTopSongs();
        tt.weeklyTopSongs();

    }
}





