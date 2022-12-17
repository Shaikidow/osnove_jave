package d13_12_2022;
public class Zadatak4 {

    public static void main(String[] args) {

//      Napisati program koji racuna i ispisuje povrsinu i obim trougla.
//      KOREN BROJA 3 neka bude konstanta 1.73.
//      Za stranicu trougla postavite proizvoljnu vrednost.
//      Primer izvrsenja programa:
//      a: 10
//      Povrsina je 43.25
//      Obim je 30

        int a;
        double korenIz3 = 1.73;

        a = 15;

        double povrsina = a * a * korenIz3 / 4;
        int obim = a * 3;

        System.out.println("a: " + a);
        System.out.println("Površina je " + povrsina);
        System.out.print("Obim je " + obim);

    }
}
