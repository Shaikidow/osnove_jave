package d19_12_2022;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

//      Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija.
//      Korisnik unosi N reakcija, a zatim se prikazuje evidencija.
//
//      Program podrzava sledece reakcije:
//      like
//      smile
//      heart
//
//      Primer izvrsenja:
//      Unesite N: 7
//      Reaguj: like
//      Reaguj: heart
//      Reaguj: smile
//      Reaguj: lol
//      Reaguj: smile
//      Reaguj: like
//      Reaguj: like
//      Summary: like 3 | smile 2 | heart 1
//
//      Napomena: Ako se unese reakcija koju program ne podrzava, ona ne utice na evidenciju.
//
//      POMOC: Svaka promenljiva nosi jednu informaciju,
//      to znaci evidenciju za like cuva promenljiva sa imenom npr. likeCounter,
//      evidenciju za smile cuva smileCounter, i za heart cuva promenljiva heartCounter

        Scanner s = new Scanner(System.in);

        int like = 0;
        int smile = 0;
        int heart = 0;

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Reagujte: ");
            String react = s.next();

            if (react.equals("like")) {
                ++like;
            } else if (react.equals("smile")) {
                ++smile;
            } else if (react.equals("heart")) {
                ++heart;
            }
        }

        System.out.print("Summary: like " + like + " | smile " + smile + " | heart " + heart);

    }
}
