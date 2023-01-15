package d13_01_2023;

public class Zadatak2 {

    public static void main(String[] args) {

//      (Za vezbanje)
//      Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama.
//      Znaci nije vam potrebna provera za opseg brojeva.
//
//      Za potrebe Lotto igre na srecu potrebno je
//      Kreirati klasu Kombinacija koja ima:
//      id kombinacije (String)
//      niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//      konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//      gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//      metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija.
//      Zaglavlje metode je:
//      public boolean daLiJeIstaKombinacija( Kombinacija k)
//      metoda vraca true ako su svi elementi na istim pozicijama isti
//      npr: this [0] == k [0], this [1] == k [1] ….
//      metodu za stampu koja stampa podatke u formatu
//      ID: id kombinacije
//      brojevi: 1, 3, 5, 14, 15, 21, 23
//
//      Kreirati klasu Listic koja ima:
//      niz kombinacija - maksimalno 7 kombinacija
//      metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//      metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru.
//      Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija.
//      Za proveru jednakosti kombinacija koristi se metoda daLiJeIstaKombinacija
//      Zaglavlje metode
//      public boolean dobitna(Kombinacija dobitnaKombinacija)
//      metodu koja stampa listic u formatu
//      ID: id kombinacije
//      brojevi: 1, 3, 5, 14, 15, 21, 23
//
//      ID: id kombinacije
//      brojevi: 1, 3, 5, 14, 15, 21, 23
//
//      …… i tako za sve kombinacije

        Listic l1 = new Listic();

        Kombinacija k1 = new Kombinacija("K1", 1, 17, 12, 24, 14, 7, 39);
        Kombinacija k2 = new Kombinacija("K2", 17, 12, 7, 1, 24, 39, 14);
        Kombinacija k3 = new Kombinacija("K3", 3, 8, 15, 22, 33, 34, 35);

        l1.dodajKombinaciju(k1);
        l1.dodajKombinaciju(k3);

        l1.stampaj();

        System.out.println("\nDa li je kombinacija k1 dobitna? " + l1.dobitna(k1));
        System.out.println("\nDa li je kombinacija k2 dobitna? " + l1.dobitna(k2));
        System.out.println("\nDa li je kombinacija k3 dobitna? " + l1.dobitna(k3));

    }
}
