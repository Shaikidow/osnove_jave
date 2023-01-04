package d29_12_2022;

public class Zadatak3 {

    public static void main(String[] args) {

//      (ZA VEZBANJE)
//      Kreirati klasu SmartAirConditioning koja ima:
//      atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//      atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//      atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//      atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//      atribut za mod (hladi/greje)
//      metodu za stampu - stampa u formatu
//      marka - mod - temperatura
//      metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//      30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//      metodu koja racuna koliko klima novca potrosi za mesec dana
//      Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//      Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//      Metoda vraca ukupnu cenu za taj mesec
//
//      U glavnom programu kreirati objekat klase SmartAirConditioning i testirati sve metode.

        SmartAirConditioning device = new SmartAirConditioning();

        device.setBrand("Venting");
        device.setCoolingPower(3);
        device.setHeatingPower(5);
        device.setTemperature(24);
        device.setMode("hladi");

        device.print();

        if (device.monthlyPowerSpending() == -1) {
            System.out.print("Nije moguće izračunati mesečnu potrošnju i cenu, izaberite validan mod za rad uređaja!");
        } else {
            System.out.println("Mesečna potrošnja: " + device.monthlyPowerSpending() + "kW/h");
            System.out.print("Mesečna cena: " + device.monthlyCost() + ".00RSD");
        }



    }
}
