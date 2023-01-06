package mini_projekat;

import java.util.Scanner;

public class XOIgra {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        XOTabla iksOks = new XOTabla();

        System.out.print("Unesite ime igrača X: ");
        iksOks.setImeX(s.next());

        System.out.print("Unesite ime igrača O: ");
        iksOks.setImeO(s.next());

        iksOks.pokreniIgru();

        while (!iksOks.pobednikX() && !iksOks.pobednikO() && !iksOks.popunjenaTabla()) {

            iksOks.stampaj();
            System.out.println("Na potezu je igrač " + iksOks.getNaPotezu() + ".");
            System.out.print("Odigraj potez: ");
            int potez = s.nextInt();

            while (!iksOks.poljePrazno(potez)) {
                System.out.println("\nPotez nije validan.");
                System.out.print("Odigraj potez: ");
                potez = s.nextInt();
            }

            iksOks.odigrajPotez(potez);
            iksOks.zameniIgraca();

        }

        iksOks.proglasiPobednika(); // više o ovoj "nepropisanoj" metodi u komentarima na kraju tela klase XOTabla.java!
        iksOks.stampaj();

        if (iksOks.pobednikX()) {
            System.out.println("Čestitamo! Pobedio je igrač X.");
            System.out.print("Bravo, " + iksOks.resetIme(iksOks.getImeX()) + "!"); // a i o ovome više na kraju XOTabla!

        } else if (iksOks.pobednikO()) {
            System.out.println("Čestitamo! Pobedio je igrač O.");
            System.out.print("Bravo, " + iksOks.resetIme(iksOks.getImeO()) + "!"); // a i o ovome više na kraju XOTabla!

        } else {
            System.out.print("Igra je nerešena!");
        }

    }
}