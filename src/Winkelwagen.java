import java.util.ArrayList;

public class Winkelwagen extends WinkelwagenTemplate {
    private ArrayList<Product> producten;

    public Winkelwagen() {
        producten = new ArrayList<>();
    }

   @Override
    public ArrayList<Product> getProducten() {
        return producten;
    }

    @Override
  public void voegProductToe(Product product) {
        producten.add(product);
    }

    @Override
    public void verwijderProduct(Product product) {
        producten.remove(product);
    }

    @Override
    public void leegWinkelwagen() {
        producten.clear();
    }

    @Override
    public double getTotaal() {
        double totaal = 0;
        for (Product product : producten) {
            totaal += product.getPrijs();
        }
        return totaal;
    }
}

