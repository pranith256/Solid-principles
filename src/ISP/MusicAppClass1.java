package ISP;

interface MusicPlay {
    public void playMusic();
}
interface MusicPause {
    public void pauseMusic();
}

class PlaySong implements MusicPlay
{
    public void playMusic() {
        System.out.println("playing song");
    }

}

class PauseSong implements MusicPause
{
    public void pauseMusic() {

        System.out.println("song paused");

    }
}

class MusicAppClass1
{
    public static void main(String args[])
    {
        PlaySong ps=new PlaySong();
        PauseSong pas=new PauseSong();
        ps.playMusic();
        pas.pauseMusic();
    }
}