package d19_01_2023;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza> ambalaze;

    public Korpa() {
        ambalaze = new ArrayList<Ambalaza>();
    }

    public void dodajAmbalazu(Ambalaza ambalaza) {
        ambalaze.add(ambalaza);
    }

    public void izbaciAmbalazu(String barKod) {
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if (this.ambalaze.get(i).getBarKod().equals(barKod)) {
                this.ambalaze.remove(i);
            }
        }
    }

    private double cenaSvihAmbalaza(double popust) {
        double ukupnaCena = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            ukupnaCena += this.ambalaze.get(i).cenaArtikla();
        }
        return ukupnaCena - popust;
    }

    public double ukupnaCena(SuperKartica superKartica) {
        return this.cenaSvihAmbalaza(superKartica.getPopust());
    }

}
