package d12_01_2023;

public class ZeleniKarton {

    private String imeIPrezimeStudenta;
    private String brojIndeksa; // nije toliko dugačak broj, ali ga ne obrađujemo kroz računske operacije, zato - String
    private String nazivPredmeta;
    private String imeIPrezimeProfesora;
    private int ocena; // od 5 do 10

    public String getImeIPrezimeStudenta() {
        return imeIPrezimeStudenta;
    }
    public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }
    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }
    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }
    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public ZeleniKarton() {

    }

    public ZeleniKarton(String imeIPrezimeStudenta, String brojIndeksa,
                        String nazivPredmeta, String imeIPrezimeProfesora, int ocena) {

        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;

    }

    public boolean polozenIspit() {
        if (this.ocena >= 6) {
            return true;
        }
        return false;
    }

    public void stampaj() {
        System.out.println("\n" + this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: " + this.imeIPrezimeStudenta + ", " + this.brojIndeksa);
        System.out.println("Profesor: " + this.imeIPrezimeProfesora);
    }
}
