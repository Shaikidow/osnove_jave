package d10_01_2023;

public class Zadatak1 {

    public static void main(String[] args) {

//      Kreirati klasu Autor koja ima
//      -ime i prezime
//      -konstruktore koje mislite da su vam potrebni
//      -gettere i settere za atribute
//      -metodu print koja stampa u formatu:
//      (ime autora) (prezime autora)
//
//      Kreirati klasu Knjiga koja ima:
//      -ISBN
//      -naziv
//      -godina izdanja
//      -autor
//      -konstruktore koje mislite da su vam potrebni
//      -gettere i settere za atribute
//      -metodu print koja stampa u formatu (izbegavati dupliranje koda):
//      (ISBN)
//      (naziv) - (godina izdanja)
//      autor: (ime autora) (prezime autora)
//
//      U glavnom programu napraviti vise autora sa vise knjiga.

        Autor a1 = new Autor("Agatha", "Christie");
        Autor a2 = new Autor("Karl", "Jung");

        Knjiga k1 = new Knjiga("123-45-6789-123-4", "Zavesa", 1975, a1);
        Knjiga k2 = new Knjiga("123-12-1212-123-2", "Aion", 1951, a2);
        Knjiga k3 = new Knjiga("987-65-4321-987-6", "Nemesis", 1971, a1);
        Knjiga k4 = new Knjiga("987-98-9898-987-8", "Snovi", 1974, a2);

//      PROVERA

        k2.stampaj(); // ako funkcioniše štampanje za ovo, funkcionisaće i štampanje za autora
        k3.stampaj();
        k4.stampaj();
        k1.stampaj();

//      /PROVERA

    }
}
