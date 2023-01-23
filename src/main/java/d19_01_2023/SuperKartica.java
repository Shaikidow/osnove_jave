package d19_01_2023;

public class SuperKartica {

    private String broj;
    private String vlasnik; // ime
    private int popust; // 200, 500...

    public SuperKartica() {

    }
    public SuperKartica(String broj, String vlasnik, int popust) {
        this.broj = broj;
        this.vlasnik = vlasnik;
        this.popust = popust;
    }

    public String getBroj() {
        return broj;
    }
    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getVlasnik() {
        return vlasnik;
    }
    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getPopust() {
        return popust;
    }
    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void stampaj() {
        System.out.println(this.broj + ", " + this.vlasnik);
    }

}
