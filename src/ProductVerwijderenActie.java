import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductVerwijderenActie implements Action{

    @Override
    public void execute(Consument consument, Scanner scanner) {
        System.out.println("Producten in de winkelwagen: ");
        Map<String, Integer> productsWithCount = new HashMap<>();
        for (Product product : consument.winkelwagen.getProducten()) {
            String productName = product.getNaam();
            if (!productsWithCount.containsKey(productName)) {
                productsWithCount.put(productName, 1);
            } else {
                int count = productsWithCount.get(productName) + 1;
                productsWithCount.put(productName, count);
            }
        }

        for (Map.Entry<String, Integer> entry : productsWithCount.entrySet()) {
            String productName = entry.getKey();
            int productCount = entry.getValue();
            System.out.println(productName + " (aantal: " + productCount + ")");
        }

        System.out.println("Welk product wil je verwijderen? (naam)");
        String productNaamToRemove = scanner.nextLine();
        for (Product p : consument.winkelwagen.getProducten()) {
            if (p.getNaam().equalsIgnoreCase(productNaamToRemove)) {
                consument.winkelwagen.verwijderProduct(p);
                System.out.println(p + " is verwijderd uit de winkelwagen.");
                break;
            }
        }
    }
}



