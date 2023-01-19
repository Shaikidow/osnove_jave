package d17_01_2023;

public class QualityOptimizerControl extends Control {

    private double internetSpeed; // realnije je da bude kb/s

    public double getInternetSpeed() {
        return internetSpeed;
    }
    public void setInternetSpeed(double internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    public QualityOptimizerControl() {

    }
    public QualityOptimizerControl(double internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {

        if (this.internetSpeed * 10.1 > 0 && this.internetSpeed * 10.1 <= 144) {
            videoPlayer.setQuality(144);
        } else if (this.internetSpeed * 10.1 > 144 && this.internetSpeed * 10.1 <= 240) {
            videoPlayer.setQuality(240);
        } else if (this.internetSpeed * 10.1 > 240 && this.internetSpeed * 10.1 <= 360) {
            videoPlayer.setQuality(360);
        } else if (this.internetSpeed * 10.1 > 360 && this.internetSpeed * 10.1 <= 480) {
            videoPlayer.setQuality(480);
        } else if (this.internetSpeed * 10.1 > 480 && this.internetSpeed * 10.1 <= 720) {
            videoPlayer.setQuality(720);
        } else if (this.internetSpeed * 10.1 > 720) {
            videoPlayer.setQuality(1080);
        }
    }
}
