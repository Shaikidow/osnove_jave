package d16_01_2023;

import java.util.ArrayList;

public class Igrac extends Osoba {

    private int broj;
    private String pozicija; // odbrambeni, vezni, napadač
    private boolean jeKapiten;
    private ArrayList<Karton> kartoni;

    public Igrac() {
        super();
    }
    public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean jeKapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.jeKapiten = jeKapiten;
        this.kartoni = new ArrayList<Karton>();
    }

    public int getBroj() {
        return broj;
    }
    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }
    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isJeKapiten() {
        return jeKapiten;
    }
    public void setJeKapiten(boolean jeKapiten) {
        this.jeKapiten = jeKapiten;
    }

    public void dodajKarton(String tip) {
        if (tip.equals("žuti") || tip.equals("crveni")) {
            this.kartoni.add(new Karton(tip));
        }
    }

    public int brojZutih() {
        int br = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("žuti")) {
                ++br;
            }
        }
        return br;
    }

    public int brojCrvenih() {
        int br = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("crveni")) {
                ++br;
            }
        }
        return br;
    }

    @Override
    public void stampaj() {
        System.out.println("\nigrač:");
        super.stampaj();
        System.out.println(this.broj + ", " + this.pozicija + ", " + this.jeKapiten);
        System.out.println("žuti kartoni: " + this.brojZutih() + ", crveni kartoni: " + this.brojCrvenih());

//      Ovaj poslednji red je samo za 2. zadatak!

    }
}
