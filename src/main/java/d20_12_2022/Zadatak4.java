package d20_12_2022;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

//      Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//      Formula koja se koristi u primeru je: (2 * ( 1 + 3)) =
//
//      Primer izvrsenja 1:
//      Unos: (
//      Unos: 2
//      Unos: *
//      Unos: (
//      Unos: 1
//      Unos: +
//      Unos: 3
//      Unos: )
//      Unos: )
//      Unos: =
//      Zagrade su uparene
//      (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
//
//      Primer izvrsenja 2:
//      Unos: (
//      Unos: 2
//      Unos: *
//      Unos: (
//      Unos: 1
//      Unos: +
//      Unos: 3
//      Unos: )
//      Unos: =
//      Zagrade nisu uparene
//      (Objasnjenje: fali poslednja zagrada iz formule)

        Scanner s = new Scanner(System.in);

        String unos = "0";
        int levaZagrada = 0;
        int desnaZagrada = 0;

        while (!unos.equals("=")) {

            System.out.print("Unos: ");
            unos = s.next();

            if (unos.equals("(")) {
                ++levaZagrada;
            } else if (unos.equals(")")) {
                ++desnaZagrada;
            }

        }

        if (levaZagrada == desnaZagrada) {
            System.out.print("Zagrade su uparene");
        } else {
            System.out.print("Zagrade nisu uparene");
        }

    }
}
