package d19_01_2023;

public class Zadatak1 {

    public static void main(String[] args) {

//      Kreirati apstraktnu klasu Ambalaza koja ima:
//      barkod (primer: 328232-2823)
//      naziv artikla
//      neto tezinu
//      bruto tezinu
//      konstruktore (default-ni i sa parametrima)
//      gettere i settere
//      metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//      apstraktnu metodu koja vraca cenu artikla
//      apstraktnu metodu stampaj
//
//      Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//      atribut koji kaze da li se moze reciklirati
//      osnovna cena
//      gettere i setter za atribute
//      konstruktori koji su vam potrebni
//      racuna cenu tako da ispunjava uslova:
//      ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//      ako nije u cenu ulazi samo osnovna cena
//      metoda stampaj stampa sve podatke iz klase tetrapak.
//
//      Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//      kaucija za flasu
//      atribut koji kaze da li se za flasu placa kaucija
//      osnovna cena
//      gettere i setter za atribute
//      konstruktori koji su vam potrebni
//      racuna cenu
//      ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//      ako se ne placa, (osnovna cena) * 1.2
//      metoda stampaj stampa sve podatke iz klase staklena flasa.
//
//      Kreirati klasu SuperKartica koja ima:
//      broj kartice
//      ime i prezime vlasnika
//      popust (200, 500, … )
//      konstruktore (default-ni i sa parametrima)
//      gettere i settere
//      metodu stampaj koja stampa karticu u formatu:
//      (broj kartice), (ime i prezime)
//
//      Kreirati klasu Korpa koja ima:
//      niz ambalaza
//      metodu dodaj ambalazu
//      metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//      privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//      metodu koja racuna i vraca ukupnu cenu korpe (sabira sve cene ambalaze),
//      kao parametar funkcije se prima Super karticu iz koje se cita popust.
//
//      U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova
//      i istestirati sve metode i ispisati ukupnu cenu sa popustom.

        Korpa k = new Korpa();

        Tetrapak t1 = new Tetrapak("12312312", "Moja Kravica čokoladno mleko",
                                    490, 500, true, 100);
        StaklenaAmbalaza s1 = new StaklenaAmbalaza("2312312", "Kabinet Porter pivo",
                                                430, 500, 0, false, 200);
        StaklenaAmbalaza s2 = new StaklenaAmbalaza("34324234", "Kabinet Supernova pivo",
                                                430, 500, 50, true, 250);

        SuperKartica sk = new SuperKartica("555-8908089-73", "Dimitrije Mandić", 200);

        k.dodajAmbalazu(t1);
        k.dodajAmbalazu(s1);
        k.dodajAmbalazu(s2);
        k.izbaciAmbalazu("2312312");

        t1.stampaj();
        s1.stampaj();
        s2.stampaj();

        System.out.println("\nUkupna cena sa popustom je " + k.ukupnaCena(sk) + " RSD.");

    }
}
