package d10_01_2023;

public class ClanskaKarta {

    private int popust; // u rasponu od 5 do 10 %
    private String broj;

    public int getPopust() {
        return popust;
    }
    public void setPopust(int popust) {
        this.popust = popust;
    }

    public String getBroj() {
        return broj;
    }
    public void setBroj(String broj) {
        this.broj = broj;
    }

    public ClanskaKarta() {

    }
    public ClanskaKarta(String broj, int popust) {
        this.broj = broj;
        this.popust = popust;
    }
}
