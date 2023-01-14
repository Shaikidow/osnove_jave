package d12_01_2023;

public class Ringla {

    private String tip; // "obična" ili "ekspres"
    private int jacina; // obična od 0 do 3, ekspres od 0 do 12
    private double jacinaGrejaca; // u kW

    public Ringla(String tip, double jacinaGrejaca) {
        this.tip = tip;
        this.jacinaGrejaca = jacinaGrejaca;
    }

    public int getJacina() {
        return jacina;
    }

    private int maxJacina() {
        if (this.tip.equals("obična")) {
            return 3;
        }
        return 12; // za ekspres
    }

    public void pojacajRinglu() {
        ++this.jacina;
        if (this.jacina > this.maxJacina()) {
            this.jacina = this.maxJacina();
        }
    }

    public void iskljuciRinglu() {
        this.jacina = 0;
    }

    public boolean jeUkljucena() {
        return this.jacina > 0;
    }

    public double potrosnja(int sati) {
        return this.maxJacina() * this.jacina * this.jacinaGrejaca * sati;
    }

    public void stampaj() {

        if (this.jeUkljucena()) {
            System.out.println("\nRingla je uključena.");
        } else {
            System.out.println("\nRingla je isključena.");
        }

        System.out.println("Tip ringle: " + this.tip);
        System.out.println("Jačina: " + this.jacina);
        System.out.println("Grejač: " + this.jacinaGrejaca + " kW");

    }

}
