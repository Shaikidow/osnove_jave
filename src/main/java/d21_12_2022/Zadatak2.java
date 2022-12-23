package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

//      Napisati program koji ucitava N brojeva i smesta ih u niz.
//      Zatim, iz niza, broji koliko je parnih brojeva uneto.
//      Brojeve unosi korisnik.
//
//      Unesite N: 5
//      Unesite broj: 1
//      Unesite broj: 3
//      Unesite broj: 4
//      Unesite broj: 7
//      Unesite broj: 8
//      U nizu ima 2 parna broja.

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            brojevi.add(broj);
            // naravno, program može da evaluira parnost broja već unutar ove petlje, ali zadatak traži nešto drugačije!
        }

        int parni = 0;

        for (int i = 0; i < brojevi.size(); i++) { // naravno, u ovom slučaju je moglo da piše i n umesto brojevi.size()
            if (brojevi.get(i) % 2 == 0) {
                ++parni;
            }
        }

        System.out.print("U nizu ima " + parni + " parnih brojeva.");

    }
}
