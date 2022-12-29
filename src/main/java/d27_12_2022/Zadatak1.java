package d27_12_2022;

public class Zadatak1 {

    public static void main(String[] args) {

//      Napisati klasu Proizvod koja ima atribute
//      naziv proizvoda (String)
//      cenu proizvoda (double)
//      težinu proizvoda u gramima. (double)
//      i metode:
//      stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//      konvertuj - metoda konvertuje tezinu u kilograme i tone.
//      Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo,
//      a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//
//      Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//      Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//      U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

        Proizvod jogurt = new Proizvod();
        Proizvod kafa = new Proizvod();

        jogurt.naziv = "Moja Kravica";
        jogurt.cena = 200; // dinara
        jogurt.tezina = 1500; // grama

        kafa.naziv = "Bellarom Crema";
        kafa.cena = 400; // dinara
        kafa.tezina = 500; // grama

//      PROVERA

        kafa.stampaj();
        jogurt.stampaj();

        System.out.println("Težina proizvoda " + kafa.naziv + " je " + kafa.konvertuj("kg") + " kilograma.");
        System.out.println("Težina proizvoda " + jogurt.naziv + " je " + jogurt.konvertuj("t") + " tona.");

//      /PROVERA

    }
}
