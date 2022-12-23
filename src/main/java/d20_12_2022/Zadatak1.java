package d20_12_2022;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

//      Napisati program koji ucitava brojeva od korisnika
//      i za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula.
//      Pomoc: Apsolutna vrednost je kada bilo koji broj pretvarate u pozitivan broj.
//      Npr: -2 u 2 ili -4 u 4, dok pozitivni ostaju pozitivni (npr: 9 ostaje 9).
//
//      Primer izvrsenja:
//
//      Unesite broj: 3
//      Apsolutna vrednost je 3
//      Unesite broj: -1
//      Apsolutna vrednost je 1
//      Unesite broj: 0
//      Kraj programa jer je uneta nula.

        Scanner s = new Scanner(System.in);

        int broj = 1;

        while (broj != 0) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
            if (broj < 0) {
                System.out.println("Apsolutna vrednost je " + (broj - 2 * broj));
            } else if (broj > 0) {
                System.out.println("Apsolutna vrednost je " + broj);
            }
        }

        System.out.print("Kraj programa jer je uneta nula.");

    }
}
