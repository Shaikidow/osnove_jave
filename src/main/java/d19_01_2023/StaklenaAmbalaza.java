package d19_01_2023;

public class StaklenaAmbalaza extends Ambalaza {

    private double cenaKaucije; // za flašu
    private boolean daLiKaucija;
    private double osnovnaCena;

    public double getCenaKaucije() {
        return cenaKaucije;
    }
    public void setCenaKaucije(double cenaKaucije) {
        this.cenaKaucije = cenaKaucije;
    }

    public boolean isDaLiKaucija() {
        return daLiKaucija;
    }
    public void setDaLiKaucija(boolean daLiKaucija) {
        this.daLiKaucija = daLiKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }
    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza() {

    }

    public StaklenaAmbalaza(String barKod, String nazivArtikla, double neto, double bruto, double cenaKaucije, boolean daLiKaucija, double osnovnaCena) {
        super(barKod, nazivArtikla, neto, bruto);
        this.cenaKaucije = cenaKaucije;
        this.daLiKaucija = daLiKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (this.daLiKaucija) {
            return this.osnovnaCena * 1.2 + this.cenaKaucije;
        }
        return this.osnovnaCena * 1.2;
    }

    @Override
    public void stampaj() {
        System.out.println("\nNaziv: " + this.nazivArtikla + ", bar kod: " + this.barKod);
        System.out.println("Neto težina: " + this.neto + ", bruto težina: " + this.bruto);
        System.out.print("Kaucija: ");
        if (this.daLiKaucija) {
            System.out.println("da (" + this.cenaKaucije + ")");
        } else {
            System.out.println("ne");
        }
        System.out.println("Osnovna cena: " + this.osnovnaCena);
        System.out.println("Cena artikla: " + this.cenaArtikla());
    }
}
