package d14_12_2022;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

//      Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
//      Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.
//
//      T1 i T2 su pozicije login forme. M je pozicija na koju je kliknuto.
//
//      Primer izvrsenja 1:
//      Unesite x za T1: 10
//      Unesite y za T1: 100
//      Unesite x za T2: 100
//      Unesite y za T2: 0
//      Unesite x za M: 50
//      Unesite y za M: 50
//      Kliknuto je unutar forme
//
//      Primer izvrsenja 2:
//      Unesite x za T1: 10
//      Unesite y za T1: 100
//      Unesite x za T2: 100
//      Unesite y za T2: 0
//      Unestie x za M: 120
//      Unesite y za M: 50
//      Nije kliknuto unutar forme

        Scanner s = new Scanner(System.in);

        int xT1;
        int yT1;

        int xT2;
        int yT2;

        int xM;
        int yM;

        System.out.print("Unesite x za T1: ");
        xT1 = s.nextInt();
        System.out.print("Unesite y za T1: ");
        yT1 = s.nextInt();
        System.out.print("Unesite x za T2: ");
        xT2 = s.nextInt();
        System.out.print("Unesite y za T2: ");
        yT2 = s.nextInt();
        System.out.print("Unesite x za M: ");
        xM = s.nextInt();
        System.out.print("Unesite y za M: ");
        yM = s.nextInt();

        if ((xM >= xT1) && (xM <= xT2) && (yM >= yT1) && (yM <= yT2)) {
            System.out.print("Kliknuto je unutar forme");
        } else {
            System.out.print("Nije kliknuto unutar forme");
        }

    }
}
