package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

//      Napisati program koji ucitava niz A duzine N i broj X.
//      Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//
//      Primer izvrsenja:
//
//      Unesite N: 5
//      Unesite broj: 1
//      Unesite broj: 3
//      Unesite broj: 7
//      Unesite broj: 3
//      Unesite broj: 9
//      Unesite X: 3
//
//      Rezultat: Elementi niza A koji su jednaki broju X imaju indekse:
//      1, 3

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> xNizIndeksa = new ArrayList<Integer>(); //neophodno za uredno štampanje i neštampanje zareza!

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            a.add(broj);
        }

        System.out.print("Unesite X: ");
        int x = s.nextInt();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == x) {
                xNizIndeksa.add(i);
            }
        }

        System.out.println("\nRezultat: Elementi niza koji su jednaki broju X imaju indekse:");

        for (int i = 0; i < xNizIndeksa.size(); i++) {
            if (i == xNizIndeksa.size() - 1) {
                System.out.print(xNizIndeksa.get(i));
            } else {
                System.out.print(xNizIndeksa.get(i) + ", ");
            }

        }

    }
}
