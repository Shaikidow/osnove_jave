package d26_12_2022;

import java.util.Scanner;

public class Zadatak7 {

    public static void main(String[] args) {

//      (Za vezbanje)
//      Napisati funkciju koja pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//      Primer izvrsenja:
//
//      izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//      izbroji(-5, 1) ima za rezultat 5. Kako? -5 -4 -3 -2 -1 0 1
//
//      Napomena: Resiti bez koriscenja petlji.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite M: ");
        int m = s.nextInt();

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        System.out.print("izbroji(" + m + ", " + n + ") ima za rezultat " + izbroji(m, n) + ".");

    }

    public static int izbroji(int m, int n) {
        if (m != n) {
            return Math.abs(m - n) - 1; // ovu funkciju koristim samo jer znamo da znam kako da nađem abs i bez toga...
                                        // mada bi na testu verovatno trebalo da demonstriram to znanje korak po korak?
        }
        return 0;
    }

}
