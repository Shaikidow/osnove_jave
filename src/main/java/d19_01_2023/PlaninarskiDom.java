package d19_01_2023;

import java.util.ArrayList;

public class PlaninarskiDom {

    private String naziv;
    private int godinaOsnivanja;
    private ArrayList<Planinar> clanovi;

    public PlaninarskiDom() {
        this.clanovi = new ArrayList<Planinar>();
    }
    public PlaninarskiDom(String naziv, int godinaOsnivanja) {
        this.naziv = naziv;
        this.godinaOsnivanja = godinaOsnivanja;
        this.clanovi = new ArrayList<Planinar>();
    }

    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }
    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public ArrayList<Planinar> getClanovi() {
        return clanovi;
    }
    public void setClanovi(ArrayList<Planinar> clanovi) {
        this.clanovi = clanovi;
    }

    public void uclaniPlaninara(Planinar planinar) {
        this.clanovi.add(planinar);
    }

    public int uspesniPlaninari(Planina planina) {
        int ukupanBroj = 0;
        for (int i = 0; i < clanovi.size(); i++) {
            if (this.clanovi.get(i).uspesanUspon(planina)) {
                ++ukupanBroj;
            }
        }
        return ukupanBroj;
    }

    public void izbaciClana(int id) {
        for (int i = 0; i < this.clanovi.size(); i++) {
            if (this.clanovi.get(i).getId() == id) {
                this.clanovi.remove(i);
            }
        }
    }

    public void stampaj() {
        System.out.println("\n" + this.naziv + " (od " + this.godinaOsnivanja + ".)\n");
        System.out.println("Članovi:");
        for (int i = 0; i < clanovi.size(); i++) {
            clanovi.get(i).stampaj();
        }
        System.out.println("\nMesečni prihod: " + this.mesecniPrihod() + " RSD");
    }

    public double mesecniPrihod() {
        double ukupanPrihod = 0;
        for (int i = 0; i < clanovi.size(); i++) {
            ukupanPrihod += clanovi.get(i).clanarina();
        }
        return ukupanPrihod;
    }
}
