package d16_12_2022;

public class Zadatak3 {

    public static void main(String[] args) {

//      Napisati program koji stampa sve brojeve od 1 do 100 tako da:
//      sve parne stampa kao negativne a
//      sve neparne kao pozitivne brojeve
//      Primer izvrsenja:
//      0, 1, -2, 3, -4, 5, -6, ……..

        for (int i = 1; i <= 100; i++) { // ako je trebalo ipak od 0 do 100, onda int i = 0;
            if (i % 2 == 0) {
                System.out.print((i - 2 * i) + ", ");
            } else {
                System.out.print(i + ", ");
            }
        }

    }
}
