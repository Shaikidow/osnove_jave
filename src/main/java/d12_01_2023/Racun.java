package d12_01_2023;

public class Racun {

    private String broj;
    private String korisnik;
    private double stanje;

    public String getBroj() {
        return broj;
    }
    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getKorisnik() {
        return korisnik;
    }
    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }

    public double getStanje() {
        return stanje;
    }

    public Racun() {

    }

    public Racun(String korisnik, String broj, double stanje) {
        this.korisnik = korisnik;
        this.broj = broj;
        this.stanje = stanje;
    }

    public void izmeniStanje(double iznos) {
        if (iznos < (this.stanje * -1)) {
            this.stanje = 0;
        } else {
            this.stanje += iznos; // iznos može da bude pozitivan ili negativan!
        }
    }

    public void stampaj() {
        System.out.println("\n" + this.korisnik + " - " + this.broj);
        System.out.println("Stanje na računu je " + this.stanje + " RSD.");
    }

}
