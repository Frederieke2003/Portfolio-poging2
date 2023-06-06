public class StandaardProduct extends Product {
    public StandaardProduct(String naam, double prijs) {
        super(naam, prijs);
    }

    @Override
    String info() {
        return super.toString();
    }
}
