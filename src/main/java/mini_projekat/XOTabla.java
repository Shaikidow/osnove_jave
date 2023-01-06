package mini_projekat;

import java.util.ArrayList;

public class XOTabla {

    private ArrayList<String> polje = new ArrayList<String>(); // mnogo lakše nego da ispisujem devet zasebnih atributa!
    private String imeX;
    private String imeO;
    private String naPotezu;

    public String getPolje(int index) {
        return this.polje.get(index - 1);
    }

    public String getImeX() {
        return imeX;
    }
    public void setImeX(String imeX) {
        this.imeX = imeX;
    }

    public String getImeO() {
        return imeO;
    }
    public void setImeO(String imeO) {
        this.imeO = imeO;
    }

    public String getNaPotezu() {
        return naPotezu;
    }

    public void pokreniIgru() {
        for (int i = 0; i < 9; i++) {
            this.polje.add(" ");
        }
        naPotezu = "X";
    }

    public void stampaj() {
        System.out.println();
        System.out.println(" " + getPolje(1) + " | " + getPolje(2) + " | " + getPolje(3) + " ");
        System.out.println(" " + getPolje(4) + " | " + getPolje(5) + " | " + getPolje(6) + " ");
        System.out.println(" " + getPolje(7) + " | " + getPolje(8) + " | " + getPolje(9) + " ");
        System.out.println();
        System.out.println("Igrač X: " + this.imeX);
        System.out.println("Igrač O: " + this.imeO);
        System.out.println();
    }

    public boolean poljePrazno(int index) {
        return this.polje.get(index - 1).equals(" ");
    }

    public void zameniIgraca() {
        if (this.naPotezu.equals("X")) {
            this.naPotezu = "O";
        } else if (this.naPotezu.equals("O")) {
            this.naPotezu = "X";
        }
    }

    public void odigrajPotez(int index) {
        this.polje.set((index - 1), this.naPotezu);
    }

    public boolean popunjenaTabla() {
        for (int i = 0; i < this.polje.size(); i++) {
            if (this.polje.get(i).equals(" ")) {
                return false;
            }
        }
        return true;
    }

    public boolean pobednikX() {
        for (int i = 0; i < this.polje.size(); i += 3) { // validni su i svi brojevi od 7 do 9 umesto this.polje.size()!
            if (this.polje.get(i).equals("X")
                    && this.polje.get(i + 1).equals("X")
                    && this.polje.get(i + 2).equals("X")) {
                return true; // redovi
            }
        }
        for (int i = 0; i < 3; i++) { // 3 je dužina reda, ne vidim potrebu da izvlačim novu promenljivu samo radi toga!
            if (this.polje.get(i).equals("X")
                    && this.polje.get(i + 3).equals("X")
                    && this.polje.get(i + 6).equals("X")) {
                return true; // kolone
            }
        }
        if (this.polje.get(0).equals("X")
                && this.polje.get(4).equals("X")
                && this.polje.get(8).equals("X")) {
            return true; // dijagonala 1
        }
        if (this.polje.get(2).equals("X")
                && this.polje.get(4).equals("X")
                && this.polje.get(6).equals("X")) {
            return true; // dijagonala 2
        }
        return false;
    }

    public boolean pobednikO() {
        for (int i = 0; i < this.polje.size(); i += 3) { // validni su i svi brojevi od 7 do 9 umesto this.polje.size()!
            if (this.polje.get(i).equals("O")
                    && this.polje.get(i + 1).equals("O")
                    && this.polje.get(i + 2).equals("O")) {
                return true; // redovi
            }
        }
        for (int i = 0; i < 3; i++) { // 3 je dužina reda, ne vidim potrebu da izvlačim novu promenljivu samo radi toga!
            if (this.polje.get(i).equals("O")
                    && this.polje.get(i + 3).equals("O")
                    && this.polje.get(i + 6).equals("O")) {
                return true; // kolone
            }
        }
        if (this.polje.get(0).equals("O")
                && this.polje.get(4).equals("O")
                && this.polje.get(8).equals("O")) {
            return true; // dijagonala 1
        }
        if (this.polje.get(2).equals("O")
                && this.polje.get(4).equals("O")
                && this.polje.get(6).equals("O")) {
            return true; // dijagonala 2
        }
        return false;
    }

    public void proglasiPobednika() { // ovu funkciju sam dodao da bih odštampao završnu poziciju zajedno sa rezultatom!
        if (this.pobednikX()) {
            imeX += " (pobednik!)";
        } else if (this.pobednikO()) {
            imeO += " (pobednik!)";
        }
    }

    public String resetIme(String ime) { // ova funkcija vraća ime *bez* dodatka iz proglasiPobednika za "Bravo, [ime]!"
        return ime.substring(0, ime.length() - 12); // dakle, reset je samo u smislu da *vraća* stari string, ne realno!
    }

//      resetIme je potrebno samo radi završne poruke, a to znam da smo dobili da bismo iskoristili getere za oba imena!

}
