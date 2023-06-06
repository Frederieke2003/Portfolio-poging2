import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BekijkWinkelwagenActie implements Action{

    @Override
    public void execute(Consument consument, Scanner scanner) {
        System.out.println("Producten in de winkelwagen:");
        Map<String, Integer> productsWithCount2 = new HashMap<>();
        // Dit creëert een nieuwe HashMap met
        // sleutels van het type String en waarden van het type int en wijst deze toe aan de variabele productsWithCount2.
        double totaalPrijs2 = 0;
        for (Product product : consument.winkelwagen.getProducten()) {
            String productName = product.getNaam();
            if (!productsWithCount2.containsKey(productName)) {
                productsWithCount2.put(productName, 1);
                // Dit voegt het product toe aan de HashMap productsWithCount2
                // met de waarde van 1 als er nog geen product van deze naam in de HashMap zit.
            } else {
                int count = productsWithCount2.get(productName) + 1;
                productsWithCount2.put(productName, count);
                // Dit verhoogt het aantal producten met dezelfde naam in de HashMap met 1 als er
                // al een product met die naam in de HashMap zit.
            }

            totaalPrijs2 += product.getPrijs();
        }

        for (Map.Entry<String, Integer> entry : productsWithCount2.entrySet()) {
            String productName = entry.getKey();
            int productCount = entry.getValue();
            System.out.println(productName + " (aantal: " + productCount + ")");
        }

        System.out.println("Totaalprijs: " + totaalPrijs2);
    }
}
