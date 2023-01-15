package d12_01_2023;

import java.util.ArrayList;

public class Zadatak1 {

    public static void main(String[] args) {

//      Kreirati klasu ZeleniKarton koja ima:
//      ime i prezime studenta
//      broj indeksa
//      naziv predmeta
//      ime i prezime profesora
//      ocenu - od 5 do 10
//      gettere i settere
//      konstruktore
//      metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//      metodu stampaj koja stampa podatke u formatu:
//      (naziv predmeta) - (ocena)
//      Student: ime i prezime, broj indeksa
//      Profesor: ime i prezime
//
//      U glavnoj klasi:
//      kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//      (Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//      (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

        ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();

        ispiti.add(new ZeleniKarton("Balantajns Dej", "749",
                "Nepoznavanje IT gradiva", "Bil Gejc", 5));

        ispiti.add(new ZeleniKarton("Balantajns Dej", "749",
                "Primena vatrenog oružja u kodiranju", "Džesi Džejms", 9));

        ispiti.add(new ZeleniKarton("Balantajns Dej", "749",
                "Osnove proceduralnog komponovanja", "Šivon Šajkidov", 10));

        ispiti.add(new ZeleniKarton("Balantajns Dej", "749",
                "Predmet za popunjavanje norme", "Norman Ozborn", 6));

        ispiti.add(new ZeleniKarton("Balantajns Dej", "749",
                "Lengerologija", "Dimitrije Mandić", 10));

        ispiti.add(new ZeleniKarton("Balantajns Dej", "749",
                "Ostvarivanje prosečnih ocena", "Mid Marks", 8));

        ispiti.add(new ZeleniKarton("Balantajns Dej", "749",
                "Fristajling", "Heri Mek", 7));

        ispiti.add(new ZeleniKarton("Balantajns Dej", "749",
                "Teorija boja kartona", "Pjerluiđi Kolina", 10));

        ispiti.add(new ZeleniKarton("Balantajns Dej", "749",
                "Mačke u IT-ju", "Dragoljub Boranijašević", 10));

        ispiti.add(new ZeleniKarton("Dimitrije Mandić", "749",
                "Upisivanje pogrešnog imena u indeks", "Alonzo Mozli", 10));

        for (int i = 0; i < ispiti.size(); i++) {
            ispiti.get(i).stampaj();
        }

//      /OSNOVNI ZADATAK

        double zbirOcena = 0;

        for (int i = 0; i < ispiti.size(); i++) {
            zbirOcena += ispiti.get(i).getOcena();
        }

        double prosecnaOcena = zbirOcena / ispiti.size();

        System.out.println("\nProsečna ocena za sve ispite je: " + prosecnaOcena);

//      /VEŽBANJE 1

        zbirOcena = 0;
        int brojPolozenih = 0;

        for (int i = 0; i < ispiti.size(); i++) {
            if (ispiti.get(i).polozenIspit()) {
                zbirOcena += ispiti.get(i).getOcena();
                ++brojPolozenih;
            }
        }

        prosecnaOcena = zbirOcena / brojPolozenih;

        System.out.println("\nProsečna ocena za sve položene ispite je: " + prosecnaOcena);

//      /VEŽBANJE 2

    }
}
