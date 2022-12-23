package d21_12_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

//      Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni)
//      i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//
//      Primer:
//
//      Unesite poziciju od 0 do 9: 3
//      Unesite novu vrednost: 11
//      Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        Random random = new Random();
        String prikazNiza = "";

        brojevi.add(random.nextInt(11));
        prikazNiza += brojevi.get(0); // mogao sam ovde direktno sout bez ln, ali sam hteo da probam da definišem string

        for (int i = 1; i <= 9; i++) {
            brojevi.add(random.nextInt(11));
            prikazNiza += ", " + brojevi.get(i); // prvi korak razdvajam samo zbog formatiranja zareza, inače je nebitno
        }

        System.out.println("Originalni niz:\n" + prikazNiza); // radi vidljivosti, nadam se da je dobrodošlo i na testu!

        System.out.print("\nUnesite poziciju od 0 do 9: ");
        int k = s.nextInt();

        System.out.print("Unesite novu vrednost: ");
        int novaVrednost = s.nextInt();

        brojevi.set(k, novaVrednost);

        System.out.print("\nNovi niz:\n" + brojevi.get(0));
        for (int i = 1; i <= 9; i++) {
            System.out.print(", " + brojevi.get(i));
        }

    }
}
