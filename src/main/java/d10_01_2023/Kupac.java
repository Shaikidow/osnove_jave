package d10_01_2023;

public class Kupac {

    private String ime;
    private String prezime;
    private ClanskaKarta kartica;


    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ClanskaKarta getKartica() {
        return kartica;
    }


    public Kupac() {

    }
    public Kupac(String ime, String prezime, ClanskaKarta kartica) {
        this.ime = ime;
        this.prezime = prezime;
        this.kartica = kartica;
    }

    public void stampaj() {
        System.out.print(this.ime + " " + this.prezime + " - broj kartice " + kartica.getBroj());
    }

}
