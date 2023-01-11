package d10_01_2023;

public class Proizvod1 {

    private String naziv;
    private Kupac musterija;
    private int cenaIzrade;


    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kupac getMusterija() {
        return musterija;
    }
    public void setMusterija(Kupac musterija) {
        this.musterija = musterija;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }
    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }


    public Proizvod1() {

    }
    public Proizvod1(String naziv, Kupac musterija, int cenaIzrade) {
        this.naziv = naziv;
        this.musterija = musterija;
        this.cenaIzrade = cenaIzrade;
    }


    public double cena() {
        return cenaIzrade * 1.9 * (100 - this.musterija.getKartica().getPopust()) / 100;
    }

    public void stampaj() {
        System.out.println(this.naziv + " - " + this.cena() + " RSD");
        this.getMusterija().stampaj();
    }
}
