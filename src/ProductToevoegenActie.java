import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductToevoegenActie implements Action {
    private List<Product> beschikbareProducten;

    public ProductToevoegenActie() {
        this.beschikbareProducten = beschikbareProducten;
    }

    @Override
    public void execute(Consument consument, Scanner scanner) {
        System.out.println("Beschikbare producten:");
        for (Product product : beschikbareProducten) {
            System.out.println("- " + product);
        }

        System.out.println("Welk product wil je toevoegen? (naam)");
        String productNaam = scanner.nextLine();

        Product geslecteerdProduct = null;
        for (Product product : beschikbareProducten) {
            if (product.getNaam().equalsIgnoreCase(productNaam)) {
                geslecteerdProduct = product;
            }
        }

        if (geslecteerdProduct == null) {
            System.out.println("Product niet gevonden.");
        }

        consument.winkelwagen.voegProductToe(geslecteerdProduct);
        System.out.println(geslecteerdProduct + " is toegevoegd aan de winkelwagen.");

    }

}
