package HomeWorkAIT.lesson23.O2;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("Music play ▶");
    }

    @Override
    public void pause() {
        System.out.println("Music on pause ⏯");

    }

    @Override
    public void stop() {
        System.out.println("Music stop ⏹");

    }

    @Override
    public void rewind() {
        System.out.println("Music rewind ⏪");

    }
}
