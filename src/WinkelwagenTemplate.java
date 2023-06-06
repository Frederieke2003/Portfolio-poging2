import java.util.ArrayList;

abstract class WinkelwagenTemplate {
    abstract ArrayList<Product> getProducten();
    abstract void voegProductToe(Product product);
    abstract void verwijderProduct(Product product);
    abstract void leegWinkelwagen();
    abstract double getTotaal();
}
