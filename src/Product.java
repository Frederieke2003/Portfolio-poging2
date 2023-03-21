public class Product {
    private String naam;
    private double prijs;
    private int aantal;

    public Product (String naam, double prijs, int aantal) {
        this.naam = naam;
        this.prijs = prijs;
        this.aantal = aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public int getAantal() {
        return aantal;
    }

    public double getTotaal() {
        return aantal*prijs;
    }

    @Override
    public String toString() {
        return naam + " - €" + prijs + " - " + aantal + " stuks";
    }
}
