package HomeWorkAIT.lesson23.O2;

public class VideoPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("Video play ▶");
    }

    @Override
    public void pause() {
        System.out.println("Video on pause ⏯");

    }

    @Override
    public void stop() {
        System.out.println("Video stop ⏹");

    }

    @Override
    public void rewind() {
        System.out.println("Video rewind ⏪");

    }
}
