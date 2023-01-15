package d13_01_2023;

public class Zadatak1 {

    public static void main(String[] args) {

//      Napisati klasu Student koja ima
//      broj indeksa
//      ime i prezime
//      tip studija (osnovne, master, doktorske)
//      niz ispita
//      konstruktore koje mislite da ce vam trebati
//      gettere i settere za indeks, ime i prezime, tip studija
//      getter za niz ispita
//      metodu dodaj ispit u niz ispita
//      metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//      metodu stampaj koja stampa u formatu:
//      (broj indeksa) - (ime i prezime) - (tip studija)
//      Predmeti:
//      (naziv predmeta) - (profesor) - (ocena)
//      (naziv predmeta) - (profesor) - (ocena)
//      (naziv predmeta) - (profesor) - (ocena)
//      Prosecna ocena: (prosecna ocena)
//
//      Napisati klasu Ispit koja ima
//      naziv predmeta
//      ocenu (u rasponu od 5 do 10)
//      Ime i prezime profesora koji predaje predmet
//      konstruktore koje mislite da ce vam trebati
//      gettere i settere za sve atribute
//      metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//      metodu koja stampa ispit u formatu:
//      (naziv predmeta) - (profesor) - (ocena)

        Student s1 = new Student("749", "Dimitrije Mandić", "master");

        Ispit i1 = new Ispit("Popravljanje ranijih domaćih", 10, "Šivon Šajkidov");
        Ispit i2 = new Ispit("Računanje proseka iz prve", 9, "Itko Čizma Kampovski");
        Ispit i3 = new Ispit("Pravilo trojke", 10, "Tristan Trotter");
        Ispit i4 = new Ispit("Nebitnost", 5, "Balantajns Dej");

        s1.dodajIspit(i1);
        s1.dodajIspit(i2);
        s1.dodajIspit(i3);
        s1.dodajIspit(i4);

        s1.stampaj();

    }
}
