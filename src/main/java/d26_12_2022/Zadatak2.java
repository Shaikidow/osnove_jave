package d26_12_2022;

public class Zadatak2 {

    public static void main(String[] args) {

//      Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
//      Metoda od parametara prima ime i prezime (2 parametra) i vraca jedan string tako sto spoji ime i prezime.
//      METODA NISTA NE STAMPA.
//      Primer poziva: Ako se metoda pozove za ime=”Milan” i prezime=”Jovanovic”, metoda vraca “Milan Jovanovic”.

        String ime = "Dimitrije";
        String prezime = "Mandić";

//      PROVERA

        if (punoIme(ime, prezime).equals("Dimitrije Mandić")) {
            System.out.print(punoIme(ime, prezime));
        }

//      /PROVERA

    }

    public static String punoIme(String ime, String prezime) {
        return ime + " " + prezime;
    }

}
