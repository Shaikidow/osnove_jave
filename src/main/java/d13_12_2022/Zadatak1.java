package d13_12_2022;

public class Zadatak1 {

    public static void main(String[] args) {

//      Napisati program koji stampa verziju softvera. Verzija softvera se sastoji od major, minor i patch brojeva.
//      Koristan link za verzionisanje softvera:
//      https://en.wikipedia.org/wiki/Software_versioning
//      Odstampati na ekranu verziju softvera u formatu:
//      [MAJOR].[MINOR].[PATCH]

        int major;
        int minor;
        int patch;

        major = 1;
        minor = 9;
        patch = 7;

        String softwareVersion = major + "." + minor + "." + patch;

        System.out.print(softwareVersion);

    }
}
