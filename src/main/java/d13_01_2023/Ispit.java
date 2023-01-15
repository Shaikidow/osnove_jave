package d13_01_2023;

public class Ispit {

    private String nazivPredmeta;
    private int ocena; // od 5 do 10
    private String profesor; // ime i prezime

    public Ispit() {

    }
    public Ispit(String nazivPredmeta, int ocena, String profesor) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }
    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public boolean polozenIspit() {
        return this.ocena >= 6;
    }

    public void stampaj() {
        System.out.println(this.nazivPredmeta + " - " + this.profesor + " - " + this.ocena);
    }

}
