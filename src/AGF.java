public class AGF extends Product {
    private String soort;

    public AGF(String naam, double prijs, String soort) {
        super(naam, prijs);
        this.soort = soort;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + soort;
    }
}
