package d26_12_2022;

import java.util.Scanner;

public class Zadatak8 {

    public static void main(String[] args) {

//      (Za vezbanje)
//      Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//      U glavnom programu iskoristi funkciju i ispisati odgovarajucu poruku.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite A: ");
        int a = s.nextInt();

        System.out.print("Unesite B: ");
        int b = s.nextInt();

        System.out.print("Unesite C: ");
        int c = s.nextInt();

        System.out.print("Između brojeva " + a + ", " + b + " i " + c + ", najmanji je broj " + min3(a, b, c) + ".");

    }

    public static int min3(int a, int b, int c) { // znam i za funkciju Math.min za dva broja, ali hoću sve postupno sad
        if (a < b) {
            if (a < c) {
                return a;
            }
        }
        if (b < c) {
            return b;
        }
        return c;
    }

}
