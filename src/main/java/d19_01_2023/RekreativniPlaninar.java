package d19_01_2023;

public class RekreativniPlaninar extends Planinar {

    private int tezinaOpreme; // kg
    private String nazivOkruga;
    private int maxUspon;

    public RekreativniPlaninar(int id, String imeIPrezime, int tezinaOpreme, String nazivOkruga, int maxUspon) {
        super(id, imeIPrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }
    public String getNazivOkruga() {
        return nazivOkruga;
    }
    public int getMaxUspon() {
        return maxUspon;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + this.id + ", ime: " + this.imeIPrezime + ", okrug: " + this.nazivOkruga);
    }

    @Override
    public double clanarina() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        return this.maxUspon - (this.tezinaOpreme * 50) >= planina.getVisina();
    }

}
