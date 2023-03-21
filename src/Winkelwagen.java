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

    public double getTotaal() {
        double totaal = 0;
        for (Product product : producten) {
            totaal += product.getTotaal();
        }
        return totaal;
    }

    public void printWinkelwagen() {
        if (producten.size() == 0) {
            System.out.println("Uw winkelwagen is leeg!");
        }
        else {
            System.out.println("Uw winkelwagen bevat: ");
                System.out.println(producten.toString());

        }
        System.out.println("Uw totaal prijs: " + getTotaal());
    }
}
