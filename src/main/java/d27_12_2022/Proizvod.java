package d27_12_2022;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj() {
        System.out.println(this.naziv + ", " + this.cena + " dinara, " + this.tezina + " grama");
    }

    public double konvertuj(String mernaJedinica) {
        if (mernaJedinica.equals("kg")) {
            return this.tezina / 1000;
        }
        if (mernaJedinica.equals("t")) {
            return this.tezina / 1000000;
        }
        return -1;
    }

}
