package d26_12_2022;

public class Zadatak3 {

    public static void main(String[] args) {

//      Napisati funkciju koja za dva jednocifrena broja (koja su ulazni parametri funkcije)
//      vraca novu vrednost koja se formira kao na primeru.
//      METODA NISTA NE STAMPA.
//      Ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//      Ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        int cifra1 = 2;
        int cifra2 = 3;

//      PROVERA

        if (dvocifreniBroj(cifra1, cifra2) - 23 == 0) {
            System.out.print(dvocifreniBroj(cifra1, cifra2));
        }

//      /PROVERA

    }

    public static int dvocifreniBroj(int cifra1, int cifra2) {
        return (cifra1 * 10 + cifra2);
    }

}
