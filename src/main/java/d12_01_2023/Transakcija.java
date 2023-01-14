package d12_01_2023;

public class Transakcija {

    private String id;
    private Racun polazniRacun;
    private Racun ciljniRacun;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Racun getPolazniRacun() {
        return polazniRacun;
    }
    public void setPolazniRacun(Racun polazniRacun) {
        this.polazniRacun = polazniRacun;
    }

    public Racun getCiljniRacun() {
        return ciljniRacun;
    }
    public void setCiljniRacun(Racun ciljniRacun) {
        this.ciljniRacun = ciljniRacun;
    }

    public Transakcija() {

    }
    public Transakcija(String id, Racun polazniRacun, Racun ciljniRacun) {
        this.id = id;
        this.polazniRacun = polazniRacun;
        this.ciljniRacun = ciljniRacun;
    }

    private double provizija(double iznos) {
        if (iznos <= 4500) {
            return 45;
        }
        return iznos / 100;
    }

    public void izvrsiTransakciju(double iznos) {
        double ukupanIznos = iznos + provizija(iznos);
        if (ukupanIznos > polazniRacun.getStanje()) { // stavka za vežbanje
            System.out.println("\nUnesen je preveliki iznos, transakcija nemoguća!");
        } else {
            polazniRacun.izmeniStanje(-ukupanIznos);
            ciljniRacun.izmeniStanje(iznos);
        }
    }

    public void stampaj() {
        System.out.println("\nID transakcije: " + this.id);
        System.out.println("Račun sa: " + polazniRacun.getKorisnik() + " - " + polazniRacun.getBroj());
        System.out.println("Račun na: " + ciljniRacun.getKorisnik() + " - " + ciljniRacun.getBroj());
    }

}
