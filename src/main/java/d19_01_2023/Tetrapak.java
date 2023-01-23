package d19_01_2023;

public class Tetrapak extends Ambalaza {

    private boolean mozeReciklaza;
    private double osnovnaCena;

    public boolean isMozeReciklaza() {
        return mozeReciklaza;
    }
    public void setMozeReciklaza(boolean mozeReciklaza) {
        this.mozeReciklaza = mozeReciklaza;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }
    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak() {

    }
    public Tetrapak(String barKod, String nazivArtikla, double neto, double bruto, boolean mozeReciklaza, double osnovnaCena) {
        super(barKod, nazivArtikla, neto, bruto);
        this.mozeReciklaza = mozeReciklaza;
        this.osnovnaCena = osnovnaCena;
    }



    @Override
    public double cenaArtikla() {
        if (this.mozeReciklaza) {
            return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        }
        return this.osnovnaCena;
    }

    @Override
    public void stampaj() {
        System.out.println("\nNaziv: " + this.nazivArtikla + ", bar kod: " + this.barKod);
        System.out.println("Neto težina: " + this.neto + ", bruto težina: " + this.bruto);
        System.out.print("Reciklabilno: ");
        if (this.mozeReciklaza) {
            System.out.println("da");
        } else {
            System.out.println("ne");
        }
        System.out.println("Osnovna cena: " + this.osnovnaCena);
        System.out.println("Cena artikla: " + this.cenaArtikla());
    }
}
