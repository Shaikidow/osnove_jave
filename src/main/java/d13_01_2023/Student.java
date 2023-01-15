package d13_01_2023;

import java.util.ArrayList;

public class Student {

    private String brojIndeksa;
    private String imeIPrezime;
    private String tipStudija; // "osnovne", "master", "doktorske"
    private ArrayList<Ispit> ispiti;

    public Student() {
        this.ispiti = new ArrayList<Ispit>();
    }
    public Student(String brojIndeksa, String imeIPrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<Ispit>();
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }
    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }
    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }
    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void dodajIspit(Ispit ispit) {
        this.ispiti.add(ispit);
    }

    public double prosek() {
        double zbirOcenaPolozenih = 0;
        int brojPolozenih = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).polozenIspit()) {
                zbirOcenaPolozenih += ispiti.get(i).getOcena();
                ++brojPolozenih;
            }
        }
        return zbirOcenaPolozenih / brojPolozenih;
    }

    public void stampaj() {
        System.out.println("\n" + this.brojIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija);
        System.out.println("Predmeti:");
        for (int i = 0; i < this.ispiti.size(); i++) {
            this.ispiti.get(i).stampaj();
        }
        System.out.println("Prosečna ocena: " + this.prosek());
    }
}
