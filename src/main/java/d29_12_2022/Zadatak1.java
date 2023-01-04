package d29_12_2022;

public class Zadatak1 {

    public static void main(String[] args) {

//      Napisati klasu Proizvod koja ima atribute
//      naziv proizvoda (String)
//      cenu proizvoda (double)
//      težinu proizvoda u gramima. (double)
//      i metode:
//      stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//      povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//      Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//      vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//      a povratnu vrednost je cena proizvoda kada se uračuna popust.
//      Ova funkcija ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//      racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//      Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//      za tezinu do 100g, postarina iznosi 200din
//      za tezinu od 101g do 500g, postarina iznosi 400din
//      za tezinu preko 500g, postarina iznosi 1000din
//
//      U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

        Proizvod spilKarata = new Proizvod();
        Proizvod sahovskaTabla = new Proizvod();

        spilKarata.naziv = "Piatnik";
        spilKarata.cena = 2000.00;
        spilKarata.tezina = 250.00;

        sahovskaTabla.naziv = "Classic Staunton Set";
        sahovskaTabla.cena = 4500.00;
        sahovskaTabla.tezina = 700.00;

        spilKarata.povecajCenu(1000);
        sahovskaTabla.povecajCenu(500);

        spilKarata.stampaj();
        System.out.println("Cena ovog proizvoda sa popustom je " + spilKarata.vratiCenuSaPopustom(20)
                            + " dinara, a poštarina iznosi " + spilKarata.racunajPostarinu() + " dinara.");

        System.out.println();

        sahovskaTabla.stampaj();
        System.out.print("Cena ovog proizvoda sa popustom je " + sahovskaTabla.vratiCenuSaPopustom(60)
                            + " dinara, a poštarina iznosi " + sahovskaTabla.racunajPostarinu() + " dinara.");

    }
}
