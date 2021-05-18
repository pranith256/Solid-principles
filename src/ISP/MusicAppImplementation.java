package ISP;

interface MusicOptions {
    public void playMusic();
    public void pauseMusic();
}

class PlaySong1 implements MusicOptions
{
    public void playMusic() {
         System.out.println("playing song");
    }

    /*violating the principle*/
    public void pauseMusic() {

        System.out.println("song paused");

    }
}

class PauseSong1 implements MusicOptions
{
    /*violating the principle*/
    public void playMusic() {
        System.out.println("playing song");
    }

    public void pauseMusic() {

        System.out.println("song paused");

    }
}
