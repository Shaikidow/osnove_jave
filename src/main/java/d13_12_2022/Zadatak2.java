package d13_12_2022;
public class Zadatak2 {

    public static void main(String[] args) {

//      Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici.
//      Od informacija se pamti broj kartice (16 cifara sa razmacima),
//      mesec i godina do kada vazi kartica, kao i ime i prezime vlasnika kartice.
//      Kartica se stampa sa zvezdicama.
//      Ne brinite ukoliko neka zvezdica mrdne i nije u liniji; to ce zavisiti od duzine imena.
//      Napomena: svaka informacija mora da bude u okviru posebne promenljive.

        String cardType = "Credit Card";
        String cardNumber = "1234 1232 4321 1212";
        String validity = "valid > 02/23";
        String cardName = "Dimitrije Mandić";

        System.out.println("*************************************");
        System.out.println("*  " + cardType + "                      *");
        System.out.println("*    ****                           *");
        System.out.println("*    ****                           *");
        System.out.println("*       " + cardNumber + "         *");
        System.out.println("*                  " + validity + "    *");
        System.out.println("*                                   *");
        System.out.println("*    " + cardName + "               *");
        System.out.print("*************************************");


    }
}
