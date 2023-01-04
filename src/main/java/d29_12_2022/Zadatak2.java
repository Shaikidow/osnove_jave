package d29_12_2022;

public class Zadatak2 {

    public static void main(String[] args) {

//      Kreirati klasu FacebookPost koja ima:
//      Od atributa:
//      ime i prezime korisnika koji je objavio post
//      ime i prezime korisnika na kom je profilu objavljen post
//      (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//      tekst objave
//      broj lajkova
//      broj deljenja
//      gettere za sve atribute
//      settere za sve atribute osim broja lajkova i broja deljenja
//      Od metoda:
//      like(), koja povecava broj lajkova za 1.
//      dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//      share(), koja povecava broj deljenja za 1
//      print(), koja stampa objavu u formatu:
//      (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//      (tekst objave)
//      Likes (broj lajkova) | Shares (broj deljenja)
//
//      U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//      Primer stampanja:
//
//      Milan Jovanovic >>> Pera Peric
//      Ovo je tekst objave
//      Likes 3 | Shares 1

        FacebookPost komsijo = new FacebookPost();
        FacebookPost nemam = new FacebookPost();

        komsijo.setUser1("Danny Trejo");
        komsijo.setUser2("George Clooney");
        komsijo.setText("Komšijo?");

        nemam.setUser1("George Clooney");
        nemam.setUser2("Danny Trejo");
        nemam.setText("Nemam!");

        komsijo.like();
        komsijo.dislike();
        komsijo.share();

        nemam.like();
        nemam.like();
        nemam.like();
        nemam.like();
        nemam.dislike();
        nemam.share();
        nemam.share();

        komsijo.print();
        nemam.print();

    }
}
