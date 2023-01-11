package d10_01_2023;

public class Proizvod2 {

    private String sifra;
    private String naziv;
    private double cenaKg;

    public Proizvod2(String sifra, String naziv, double cenaKg) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaKg = cenaKg;
    }

    public String getSifra() {
        return sifra;
    }
    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCenaKg() { // ovo je navedeno posebno, ali je zapravo samo getter za cenaKg!
        return cenaKg;
    }
    public double getCenaLb() {
        return cenaKg / 2.2046;
    }

    public void stampaj() {
        System.out.println(this.sifra + " - " + this.naziv);
    }
}
