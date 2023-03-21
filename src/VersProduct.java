public class VersProduct extends Product {

    private int houdbaarheid;

    public VersProduct(String naam, double prijs, int aantal, int houdbaarheid) {
        super(naam, prijs, aantal);
        this.houdbaarheid = houdbaarheid;
    }

    @Override
    public double getPrijs() {
        if (houdbaarheid <= 2) {
            return super.getPrijs() * 1.50;
        }
        else if (houdbaarheid <= 7) {
            return super.getPrijs() * 2.50;
        }
        else{
            return getPrijs();
        }
    }

    @Override
    public String toString() {
        return super.getNaam() + " - €" + super.getPrijs() + " - " + super.getAantal() + " stuks - " + houdbaarheid + " dagen houdbaar." ;
    }
}
