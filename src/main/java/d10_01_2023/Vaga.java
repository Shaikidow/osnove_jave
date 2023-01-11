package d10_01_2023;

public class Vaga {

    private String unit = "kg"; // podrazumevana merna jedinica vage je kg, a metoda "konvertuj" podešava na lb i nazad!
    private Proizvod2 product;

    public Vaga() {

    }

    public String getUnit() {
        return unit;
    }
//    public void setUnit(String unit) { // za ovim seterom nema potrebe, jer postoji metoda za toggle-ovanje konverzije
//        this.unit = unit;
//    }

    public Proizvod2 getProduct() {
        return product;
    }
    public void setProduct(Proizvod2 product) {
        this.product = product;
    }

    public void konvertuj() {
        if (this.unit.equals("kg")) {
            this.unit = "lb";
        } else if (this.unit.equals("lb")) {
            this.unit = "kg";
        }
    }

    public double sracunajCenu(double tezina) {
        if (unit.equals("kg")) {
            return this.product.getCenaKg() * tezina;
        }
        return this.product.getCenaLb() * tezina; // toggle ide napred-nazad jedino između kilograma i funte, razume se!
    }

    public void stampaj(double tezina) { // možda nije ortodoksno, ali mi jedino ovo mesto pada na pamet za unos težine!
        System.out.println();
        this.product.stampaj();
        if (unit.equals("kg")) {
            System.out.print(this.product.getCenaKg());
        } else if (unit.equals("lb")) {
            System.out.print(this.product.getCenaLb());
        }
        System.out.println(" RSD/" + this.unit + " x " + tezina);
        System.out.println("Ukupno: " + sracunajCenu(tezina)+ " RSD");
    }
}
