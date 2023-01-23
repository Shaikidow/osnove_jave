package d19_01_2023;

public class Zadatak2 {

    public static void main(String[] args) {

//      (za vezbanje)
//      (10 poena) Kreirati klasu Planina koja od privatnih atributa ima:
//      ime planine
//      naziv države u kojoj se nalazi
//      visinu planine.
//      a od javnih metoda:
//      default-ni konstruktor i konstruktor koji postavlja sve parametre
//      gettere i settere za sve atribute
//
//      (15 poena) Kreirati apstraktnu klasu Planinar koja od zaštićenih atributa ima:
//      jedinstveni celobrojni identifikacioni broj
//      ime i prezime
//      Dok od javnih metoda:
//      konstruktor koji postavlja sve atribute klase.
//      gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije
//      tj. posle njihovog postavljanja u konstruktoru)
//      apstraktnu metodu štampaj
//      apstraktnu metodu koja vraca clanarinu planinara
//      apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar uspešno popeti na planinu.
//      Metoda kao ulazni parametar prima objekat tipa Planina.
//
//      (20 poena) Kreirati klasu RekreativniPlaninar koja nasleđuje klasu Planinar.
//      Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstruktoru:
//      težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
//      naziv okruga odakle je rekreativni planinar.
//      maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//      da li će se rekreativni planinar uspešno popeti na planinu zavisi od toga
//      da li je njegov najveći uspon manji od visine planine,
//      s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
//      rekreativci placaju clanarinu u iznosu od 1000 rsd
//      metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//      Rekreativac, id: (id) ime: (ime i prezime) Okrug: (okrug)
//
//      (20 poena) Kreirati klasu Alpinista koja nasleđuje klasu Planinar.
//      Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost)
//      i poeni se mogu menjati.
//      Alpinista može da savlada sve uspone do 4000 metara,
//      placa clanarinu u iznosu od 1500
//      pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu:
//      Alpinista, id: (id) ime: (ime i prezime) Broj poena: (poeni)
//
//      (25 poena) Kreirati klasu PlaninarskiDom koja ima privatne atribute:
//      naziv doma
//      godinu kada je osnovan.
//      članove doma koji su planinari (klasa vodi računa o nizu)
//      Dok od javnih:
//      default-ni konstruktor i konstruktor koji postavlja sve parametre
//      gettere i settere koji su potrebni
//      metodu učlani planinara, koja dodaje planinara u niz
//      metodu koja vraća broj planinara koji će se uspešno popeti na planinu
//      (metoda za parametar prima Planinu za koju se proverava informacija)
//      metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju
//      metodu koja štampa podatke o domu i o svim članovima doma
//      metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
//      (10 poena) U glavnom programu kreirati jedan planinarski dom,
//      i u njega učlaniti nekoliko rekreativnih planinara i nekoliko alpinista (minimum po 3),
//      i istestirati svaku od metoda.
//
//      Napomena: Za funkcionalnost koju ne znate da uradite,
//      izostavite njenu implementaciju i smatrajte da je ona implementirana.

        Planina m1 = new Planina("Himalaji", "Nepal", 8848);
        Planina m2 = new Planina("Vlaška planina", "Srbija", 1443);

        PlaninarskiDom pd = new PlaninarskiDom("The Climbers Guild", 1950);

        Alpinista p1 = new Alpinista(45, "Milena Manojlović");

        RekreativniPlaninar p2 = new RekreativniPlaninar
                (17, "Dimitrije Mandić", 3, "Niški okrug", 1600);

        RekreativniPlaninar p3 = new RekreativniPlaninar
                (2, "David Josijević", 3, "Okrug Kruševac", 2000);

        Alpinista p4 = new Alpinista(1, "Zoran Miletić");

        Alpinista p5 = new Alpinista(68, "Aleksandar Mandić");

        RekreativniPlaninar p6 = new RekreativniPlaninar
                (11, "Milena Đorđević", 4, "Niški okrug", 1600);

        pd.uclaniPlaninara(p1);
        pd.uclaniPlaninara(p2);
        pd.uclaniPlaninara(p3);
        pd.uclaniPlaninara(p4);
        pd.uclaniPlaninara(p5);
        pd.uclaniPlaninara(p6);

        pd.izbaciClana(2);

        p1.setPoeni(10);
        p4.setPoeni(50);
        p5.setPoeni(5);

        pd.stampaj();

        System.out.println("\nBroj članova koji će se uspešno popeti na vrh planine "
                            + m1.getIme() + " je " + pd.uspesniPlaninari(m1) + ".");
        System.out.println("\nBroj članova koji će se uspešno popeti na vrh planine "
                + m2.getIme() + " je " + pd.uspesniPlaninari(m2) + ".");
    }
}
