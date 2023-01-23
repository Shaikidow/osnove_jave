package d19_01_2023;

public class Alpinista extends Planinar {

    private int poeni;

    public Alpinista(int id, String imeIPrezime) {
        super(id, imeIPrezime);
    }

    public int getPoeni() {
        return poeni;
    }
    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: " + this.id + ", ime: " + this.imeIPrezime + ", broj poena: " + this.poeni);
    }

    @Override
    public double clanarina() {
        int ukupanIznos = 1500 - this.poeni * 50;
        if (this.poeni * 50 > 1500) {
            return 0;
        }
        return ukupanIznos;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        return 4000 >= planina.getVisina();
    }

}
