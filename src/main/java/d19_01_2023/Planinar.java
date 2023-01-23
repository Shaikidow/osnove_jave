package d19_01_2023;

public abstract class Planinar {

    protected int id;
    protected String imeIPrezime;

    public Planinar(int id, String imeIPrezime) {
        this.id = id;
        this.imeIPrezime = imeIPrezime;
    }

    public int getId() {
        return id;
    }
    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public abstract void stampaj();

    public abstract double clanarina(); // RSD

    public abstract boolean uspesanUspon(Planina planina);
}
