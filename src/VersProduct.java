public class VersProduct extends Product {
    private int houdbaarheid;

    public VersProduct(String naam, double prijs, int houdbaarheid) {
        super(naam, prijs);
        this.houdbaarheid = houdbaarheid;
    }

    @Override
    public double getPrijs() {
        if (houdbaarheid <= 2) {
            return super.getPrijs() * 0.5;
        } else if (houdbaarheid <= 5) {
            return super.getPrijs() * 0.8;
        } else if (houdbaarheid <= 8) {
            return super.getPrijs() *0.9;
        }
        else {
            return super.getPrijs();
        }
    }

    @Override
    public String info() {
        return super.toString() + " (Houdbaarheid: " + houdbaarheid + " dagen)";
    }
}
