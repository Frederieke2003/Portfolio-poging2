public class Agf extends Product{

    private String soort;
    public Agf(String naam, double prijs, int aantal, String soort) {
        super(naam, prijs, aantal);
        this.soort = soort;
    }

    @Override
    public String toString() {
        return "Soort: " + soort + " - naam: " + super.getNaam() + " - €" + super.getPrijs() + " - " + super.getAantal() + " stuks";
    }
}
