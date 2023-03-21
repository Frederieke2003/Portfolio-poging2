import java.util.ArrayList;

public class Winkelwagen {
    private ArrayList<Product> producten;

    public Winkelwagen() {
        producten = new ArrayList<>();
    }

    public ArrayList<Product> getProducten() {
        return producten;
    }

    public void voegProductToe(Product product) {
        producten.add(product);
    }

    public void verwijderProduct(Product product) {
        producten.remove(product);
    }

    public void leegWinkelwagen() {
        producten.clear();
    }

    public double getTotaal() {
        double totaal = 0;
        for (Product product : producten) {
            totaal += product.getPrijs();
        }
        return totaal;
    }
}

