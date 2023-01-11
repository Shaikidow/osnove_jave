package d10_01_2023;

public class Knjiga {

    private String isbn; // International Standard Book Number
    private String naziv;
    private int godina;
    private Autor pisac;

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }
    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Autor getPisac() {
        return pisac;
    }
    public void setPisac(Autor pisac) {
        this.pisac = pisac;
    }

    public Knjiga() {

    }
    public Knjiga(String isbn, String naziv, int godina, Autor pisac) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godina = godina;
        this.pisac = pisac;
    }

    public void stampaj() {
        System.out.println("\n" + this.isbn);
        System.out.println(this.naziv + " - " + this.godina + ".");
        System.out.print("autor: ");
        this.pisac.stampaj();
    }
}
