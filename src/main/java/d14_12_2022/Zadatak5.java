package d14_12_2022;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

//      Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature
//      (operator je string i moze imati vrednosti +, - , *, /),
//      racuna  i ispisuje na ekranu odgovarajuci
//      zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.
//
//      Primer 1:                                            Primer 2:
//      Unesite a: 6                                         Unesite a: 6
//      Unesite b: 3                                         Unesite b: 3
//      Unesite operator: +                                  Unesite operator: /
//      Rezultat: 9                                          Rezultat: 2

        Scanner s = new Scanner(System.in);

        int a;
        int b;
        String operator;

        System.out.print("Unesite a: ");
        a = s.nextInt();

        System.out.print("Unesite b: ");
        b = s.nextInt();

        System.out.print("Unesite operator: ");
        operator = s.next();

        System.out.print("Rezultat: ");

        if (operator.equals("+")) {
            System.out.print(a + b);
        } else if (operator.equals("-")) {
            System.out.print(a - b);
        } else if (operator.equals("*")) {
            System.out.print(a * b);
        } else if (operator.equals("/")) {
            System.out.print(a / b);
        }

    }
}
