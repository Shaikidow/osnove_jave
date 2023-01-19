package d16_01_2023;

public class Trener extends Osoba {

    private int godineIskustva;
    private String tip; // kondicioni, za igru, pomoćni, personalni

    public Trener() {
        super();
    }
    public Trener(String imeIPrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tip) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tip = tip;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }
    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public void stampaj() {
        System.out.println("\ntrener:");
        super.stampaj();
        System.out.println(this.tip + ", " + this.godineIskustva + " god. iskustva");
    }
}
