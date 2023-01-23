package d19_01_2023;

public abstract class Ambalaza {

    protected String barKod;
    protected String nazivArtikla;
    protected double neto;
    protected double bruto;

    public Ambalaza() {

    }
    public Ambalaza(String barKod, String nazivArtikla, double neto, double bruto) {
        this.barKod = barKod;
        this.nazivArtikla = nazivArtikla;
        this.neto = neto;
        this.bruto = bruto;
    }

    public String getBarKod() {
        return barKod;
    }
    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }
    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public double getNeto() {
        return neto;
    }
    public void setNeto(double neto) {
        this.neto = neto;
    }

    public double getBruto() {
        return bruto;
    }
    public void setBruto(double bruto) {
        this.bruto = bruto;
    }

    public double tezinaPakovanja() {
        return this.bruto - this.neto;
    }

    public abstract double cenaArtikla();

    public abstract void stampaj();
}
