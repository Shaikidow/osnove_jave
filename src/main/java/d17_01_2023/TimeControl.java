package d17_01_2023;

public class TimeControl extends Control {

    private boolean moveForward;

    public  TimeControl() {

    }
    public TimeControl(boolean moveForward) {
        this.moveForward = moveForward;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {

        if (this.moveForward) {
            videoPlayer.setTime(videoPlayer.getTime() + 15);
            if (videoPlayer.getTime() > videoPlayer.getDuration()) {
                videoPlayer.setTime(videoPlayer.getDuration());
            }

        } else {
            videoPlayer.setTime(videoPlayer.getTime() - 15);
            if (videoPlayer.getTime() < 0) {
                videoPlayer.setTime(0);
            }
        }
    }
}
