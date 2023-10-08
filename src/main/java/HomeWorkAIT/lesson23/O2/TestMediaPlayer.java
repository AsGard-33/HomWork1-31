package HomeWorkAIT.lesson23.O2;

public class TestMediaPlayer {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();

        audioPlayer.rewind();
        audioPlayer.stop();
        audioPlayer.play();
        audioPlayer.pause();

        videoPlayer.rewind();
        videoPlayer.stop();
        videoPlayer.play();
        videoPlayer.pause();
    }
}
