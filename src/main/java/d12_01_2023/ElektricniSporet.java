package d12_01_2023;

import java.util.ArrayList;

public class ElektricniSporet {

    private String marka;
    private int garancija; // broj godina
    private int maxUkljucenihRingli; // 1, 2, 3 ili 4
    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;
    private ArrayList<Ringla> ringle; // opet mnogo olakšava posao!

    public ElektricniSporet(String marka, int garancija, int maxUkljucenihRingli,
                            Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        this.marka = marka;
        this.garancija = garancija;
        this.maxUkljucenihRingli = maxUkljucenihRingli;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
        ringle = new ArrayList<Ringla>(); // ne unosim je kao atribut, samo je pravim
        ringle.add(this.goreLevo);
        ringle.add(this.goreDesno);
        ringle.add(this.doleLevo);
        ringle.add(this.doleDesno);
    }

    public String getMarka() {
        return marka;
    }
    public int getGarancija() {
        return garancija;
    }
    public int getMaxUkljucenihRingli() {
        return maxUkljucenihRingli;
    }
    public Ringla getGoreLevo() {
        return goreLevo;
    }
    public Ringla getGoreDesno() {
        return goreDesno;
    }
    public Ringla getDoleLevo() {
        return doleLevo;
    }
    public Ringla getDoleDesno() {
        return doleDesno;
    }
    public ArrayList<Ringla> getRingle() { // naravno, dodajem i getter
        return ringle;
    }

    public void pojacaj(int pozicijaRingle) {

        this.ringle.get(pozicijaRingle - 1).pojacajRinglu();
        int ukljuceneRingle = 0;

        for (int i = 0; i < 4; i++) {
            if (this.ringle.get(i).jeUkljucena()) {
                ++ukljuceneRingle;
            }
        }

        if (ukljuceneRingle > this.maxUkljucenihRingli) {
            for (int i = 0; i < 4; i++) {
                if (i != pozicijaRingle) {
                    this.ringle.get(i).iskljuciRinglu();
                }
            }
        }

    }
    public void iskljuci(int pozicijaRingle) {
        this.ringle.get(pozicijaRingle - 1).iskljuciRinglu();
    }

    public double potrosnja(int sati) { // uzimamo jedan setting za sve ringle i onda merimo potrošnju za neki broj sati
        double ukupnaPotrosnja = 0;
        for (int i = 0; i < 4; i++) {
            ukupnaPotrosnja += ringle.get(i).potrosnja(sati);
        }
        return ukupnaPotrosnja;
    }

    public void stampaj() {
        System.out.println("\n" + this.marka + " - " + this.garancija + "god. garancije");
        for (int i = 0; i < 4; i++) {
            this.ringle.get(i).stampaj();
        }
    }
}
