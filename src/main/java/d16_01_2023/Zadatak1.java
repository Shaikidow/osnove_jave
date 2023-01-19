package d16_01_2023;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

//      1.Zadatak
//      Kreirati klasu Osoba koja ima:
//      ime i prezime
//      jmbg
//      godinu rodjenja
//      default-ni konstruktor
//      konstruktor sa parametrima
//      gettere i settere
//      metodu stampaj koja stampa u formatu:
//      (ime i prezime), (jmbg), (godina rodjenja)
//
//      Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//      broj (broj koji igrac nosi)
//      poziciju koju igra (odbrambeni, napadac, … )
//      kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//      default-ni konstruktor
//      konstruktor sa parametrima
//      gettere i settere za broj, kapiten i poziciju
//      metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//      Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//      godine iskustva
//      tip trenera (kondicioni, za igru, pomocni, personalni)
//      metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//      U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//      (Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera,
//      na kraju programa ispisati sve igrace i trenere.
//      Podatke za igrace i trenere unosi korisnik sa tastature.

        Scanner s = new Scanner(System.in);

//      Kucam ime i prezime bez razmaka samo zbog s.next(), stavio bih dva odvojena parametra inače.

        System.out.println("\nZa igrača unesite 1) ime i prezime, 2) JMBG, 3) godinu rođenja, " +
                "4) broj dresa, 5) poziciju u timu, 6) da li je kapiten: ");
        Igrac i1 = new Igrac(s.next(), s.next(), s.nextInt(), s.nextInt(), s.next(), s.nextBoolean());

        System.out.println("\nZa igrača unesite 1) ime i prezime, 2) JMBG, 3) godinu rođenja, " +
                "4) broj dresa, 5) poziciju u timu, 6) da li je kapiten: ");
        Igrac i2 = new Igrac(s.next(), s.next(), s.nextInt(), s.nextInt(), s.next(), s.nextBoolean());

        Trener t1 = new Trener();
        System.out.print("\nZa trenera unesite\nime i prezime: ");
        t1.setImeIPrezime(s.next());
        System.out.print("JMBG: ");
        t1.setJmbg(s.next());
        System.out.print("godinu rođenja: ");
        t1.setGodinaRodjenja(s.nextInt());
        System.out.print("tip trenera: ");
        t1.setTip(s.next());
        System.out.print("broj godina iskustva: ");
        t1.setGodineIskustva(s.nextInt());

        Trener t2 = new Trener();
        System.out.print("\nZa trenera unesite\nime i prezime: ");
        t2.setImeIPrezime(s.next());
        System.out.print("JMBG: ");
        t2.setJmbg(s.next());
        System.out.print("godinu rođenja: ");
        t2.setGodinaRodjenja(s.nextInt());
        System.out.print("tip trenera: ");
        t2.setTip(s.next());
        System.out.print("broj godina iskustva: ");
        t2.setGodineIskustva(s.nextInt());

        i1.stampaj();
        i2.stampaj();
        t1.stampaj();
        t2.stampaj();

    }
}
