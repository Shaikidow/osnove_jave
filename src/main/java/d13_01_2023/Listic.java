package d13_01_2023;

import java.util.ArrayList;

public class Listic {

    private ArrayList<Kombinacija> kombinacije; // maksimalno 7

    public Listic() {
        this.kombinacije = new ArrayList<Kombinacija>();
    }

    public void dodajKombinaciju(Kombinacija kombinacija) {
        this.kombinacije.add(kombinacija);
    }

    public boolean dobitna(Kombinacija dobitnaKombinacija) {
        for (int i = 0; i < kombinacije.size(); i++) {
            if (dobitnaKombinacija.daLiJeIstaKombinacija(kombinacije.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void stampaj() {
        for (int i = 0; i < kombinacije.size(); i++) {
            kombinacije.get(i).stampaj();
        }
    }
}
