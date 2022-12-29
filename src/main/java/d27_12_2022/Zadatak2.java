package d27_12_2022;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

//      Kreirati klasu SmartAirConditioning koja ima:
//      atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//      atribut za izabranu temperaturu
//      atribut za mod (hladi/greje) - string
//      metodu za stampu (proizvoljno)
//      metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//      Metoda kao parametar prima temperaturu koja je napolju.
//
//      U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode

        Scanner s = new Scanner(System.in);

        SmartAirConditioning klima1 = new SmartAirConditioning();
        SmartAirConditioning klima2 = new SmartAirConditioning();

        klima1.marka = "Venting";
        klima1.temperatura = 28;
        klima1.mod = "greje";

        klima2.marka = "Samsung";
        klima2.temperatura = 24;
        klima2.mod = "hladi";

//      PROVERA 1

        klima1.stampajInfo();

        System.out.print("Unesite spoljnu temperaturu: ");
        double spoljnaTemperatura = s.nextDouble();

        if ( (klima1.jeToplijeNapolju(spoljnaTemperatura) && klima1.mod.equals("hladi"))
                ||
                (!klima1.jeToplijeNapolju(spoljnaTemperatura) && klima1.mod.equals("greje")) ) {
            System.out.println("Uključite svoj " + klima1.marka + " klima uređaj!");
        } else {
            System.out.println("Nema potrebe da uključujete klimu!");
        }

//      /PROVERA 1

        System.out.println();

//      PROVERA 2

        klima2.stampajInfo();

        System.out.print("Unesite spoljnu temperaturu: ");
        spoljnaTemperatura = s.nextDouble();

        if ( (klima2.jeToplijeNapolju(spoljnaTemperatura) && klima2.mod.equals("hladi"))
                ||
                (!klima2.jeToplijeNapolju(spoljnaTemperatura) && klima2.mod.equals("greje")) ) {
            System.out.println("Uključite svoj " + klima2.marka + " klima uređaj!");
        } else {
            System.out.println("Nema potrebe da uključujete klimu!");
        }

//      /PROVERA 2

    }
}
