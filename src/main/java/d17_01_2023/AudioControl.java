package d17_01_2023;

public class AudioControl extends Control {

    private boolean increaseVolume;

    public boolean isIncreaseVolume() {
        return increaseVolume;
    }
    public void setIncreaseVolume(boolean increaseVolume) {
        this.increaseVolume = increaseVolume;
    }

    public AudioControl() {

    }
    public AudioControl(boolean increaseVolume) {
        this.increaseVolume = increaseVolume;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {

        if (this.increaseVolume) {
            videoPlayer.setVolume(videoPlayer.getVolume() + 1);
            if (videoPlayer.getVolume() > 100) {
                videoPlayer.setVolume(100);
            }

        } else {
            videoPlayer.setVolume(videoPlayer.getVolume() - 1);
            if (videoPlayer.getVolume() < 0) {
                videoPlayer.setVolume(0);
            }
        }
    }
}
