package d14_12_2022;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

//      Napisati program koji ima informacije koje ucitava sa tastature:
//      Ime
//      Prezime
//      godinu rodjenja
//      I stampa informacije u formatu:
//      [ime] [prezime] - [starost] god
//
//      Primer izvrsenja:
//      Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
//      Milan Jovanovic - 26 god

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = s.next();

        System.out.println("Unesite prezime: ");
        String prezime = s.next();

        System.out.println("Unesite godinu rođenja: ");
        int godinaRodjenja = s.nextInt();

        int brojGodina = 2022 - godinaRodjenja;
        // Prilagodio sam primer tako da bude adekvatan za ovu godinu! (DM, 15.12.2022)

        System.out.print(ime + " " + prezime + " - " + brojGodina + " god.");

    }
}
