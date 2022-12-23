package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

//      (Za vezbanje)
//      Napisati program koji ucitava niz a duzine N.
//      Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
//      a ostale elemente niza b ispuniti jedinicama.
//      (Niz b je iste duzine kao i niz a.)
//
//      Unesite N: 6
//      Unesite broj: 1
//      Unesite broj: 5
//      Unesite broj: 2
//      Unesite broj: 7
//      Unesite broj: 8
//      Unesite broj: -1
//
//      Niz a: 1, 5, 2, 7, 8, -1
//      Niz b: 1, 5, 2, 1, 1, 1

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) { // pravljenje niza a
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            a.add(broj);
        }

        for (int i = 0; i < a.size(); i++) { // pravljenje niza b
            if (i < 3) {
                b.add(a.get(i));
            } else {
                b.add(1);
            }
        }

        System.out.print("\nNiz a: "); // štampanje niza a

        for (int i = 0; i < a.size(); i++) {
            if (i == a.size() - 1) {
                System.out.print(a.get(i));
            } else {
                System.out.print(a.get(i) + ", ");
            }
        }

        System.out.print("\nNiz b: "); // štampanje niza b

        for (int i = 0; i < b.size(); i++) {
            if (i == b.size() - 1) {
                System.out.print(b.get(i));
            } else {
                System.out.print(b.get(i) + ", ");
            }
        }

    }
}
