package d13_01_2023;

import java.util.ArrayList;

public class Kombinacija {

    private String id;
    private ArrayList<Integer> brojevi; // prima 7 brojeva od 1 do 39

    public Kombinacija(String id, int n1, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.id = id;
        this.brojevi = new ArrayList<Integer>();
        this.brojevi.add(n1);
        this.brojevi.add(n2);
        this.brojevi.add(n3);
        this.brojevi.add(n4);
        this.brojevi.add(n5);
        this.brojevi.add(n6);
        this.brojevi.add(n7);
    }

    public String getId() {
        return id;
    }

    public int getBroj(int pozicija) { // od 0 do 6 za brojeve od i1 do i7
        return this.brojevi.get(pozicija);
    }

    public boolean daLiJeIstaKombinacija(Kombinacija k) {
        int istiBrojevi = 0;
        for (int i = 0; i < this.brojevi.size(); i++) {
            if (this.getBroj(i) == k.getBroj(i)) {
                ++istiBrojevi;
            }
        }
        return istiBrojevi == this.brojevi.size();
    }
//      Zašto je bitno da proveravamo tačan *redosled* izvučenih brojeva, zašto samo istu poziciju prema istoj poziciji?
//      Umesto toga možemo da koristimo .contains() funkciju, a to sam već radio u malo starijem zadatku koji je sličan.


    public void stampaj() {
        System.out.println("\nID: " + this.id);
        System.out.print("Brojevi: ");
        for (int i = 0; i < this.brojevi.size(); i++) {
            if (i == this.brojevi.size() - 1) {
                System.out.print(this.brojevi.get(i) + "\n");
            } else {
                System.out.print(this.brojevi.get(i) + ", ");
            }
        }
    }

}
