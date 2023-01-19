package d17_01_2023;

public class VideoPlayer {

    private int duration; // ukupno trajanje u sekundama
    private int time; // trenutna pozicija u sekundama (od početka)
    private int volume; // od 1 do 100
    private int quality; // 144, 240, 360, 480, 720, 1080

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getQuality() {
        return quality;
    }
    public void setQuality(int quality) {
        this.quality = quality;
    }

    public VideoPlayer() {

    }

    public VideoPlayer(int duration, int time, int volume, int quality) {
        this.duration = duration;
        this.time = time;
        this.volume = volume;
        this.quality = quality;
    }

    public void stampaj() {
        System.out.println("\nTrenutno vreme: " + this.time + "s");
        System.out.println("Jačina zvuka: " + this.volume);
        System.out.println("Kvalitet videa: " + this.quality + "p");
    }
}
