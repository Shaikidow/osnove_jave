package d29_12_2022;

public class Proizvod {

    public String naziv;
    public double cena; // u  dinarima
    public double tezina; // u gramima

    public void stampaj() {
        System.out.println(naziv + ", " + cena + "RSD, " + tezina + "g");
    }
    public void povecajCenu(double povecanje) {
        this.cena += povecanje;
    }
    public double vratiCenuSaPopustom(double popust) { // podrazumevamo da je opseg popusta između (uključujući) 0 i 100
        return this.cena * (100 - popust) / 100;
    }
    public double racunajPostarinu() {
        if (this.tezina <= 100) {
            return 200;
        }
        if (this.tezina > 100 && tezina <= 500) {
            return 400;
        }
        return 1000; // za više od 500 grama
    }

}
