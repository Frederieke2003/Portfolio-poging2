import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consument consument = new Consument(1);

        List<Product> beschikbareProducten = new ArrayList<>();
        beschikbareProducten.add(new Product("Brood", 2.50));
        beschikbareProducten.add(new Product("Cola", 4));
        beschikbareProducten.add(new VersProduct("Melk", 20, 7));
        beschikbareProducten.add(new VersProduct("Kaas", 5, 4));
        beschikbareProducten.add(new VersProduct("Eieren", 15, 2));
        beschikbareProducten.add(new AGF("Appel", 1.00, "Fruit"));
        beschikbareProducten.add(new AGF("Bloemkool", 2.50, "Groente"));

        List<KortingsCode> mijnKortingCodes = new ArrayList<>();
        mijnKortingCodes.add(new KortingsCode("KORTING05", 5));
        mijnKortingCodes.add(new KortingsCode("BLACKFRIDAY", 10));
        mijnKortingCodes.add(new KortingsCode("KORTING10", 10));
        mijnKortingCodes.add(new KortingsCode("KORTING20", 20));

        while (true) {
            System.out.println("Welkom! Wat wil je doen?");
            System.out.println("1. Product toevoegen aan winkelwagen");
            System.out.println("2. Product verwijderen uit winkelwagen");
            System.out.println("3. Winkelwagen leegmaken");
            System.out.println("4. Kortingcode toepassen");
            System.out.println("5. Afrekenen");
            System.out.println("6. Bekijk mijn winkelwagen");
            System.out.println("7. Bekijk mijn kortingcodes");
            System.out.println("8. Stoppen");

            int keuze = scanner.nextInt();
            scanner.nextLine();

            switch (keuze) {
                case 1:
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
                            break;
                        }
                    }

                    if (geslecteerdProduct == null) {
                        System.out.println("Product niet gevonden.");
                        break;
                    }

                    consument.winkelwagen.voegProductToe(geslecteerdProduct);
                    System.out.println(geslecteerdProduct + " is toegevoegd aan de winkelwagen.");
                    break;

                case 2:
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
                    break;

                case 3:
                    consument.winkelwagen.leegWinkelwagen();
                    consument.setGebruikteKortingCode(null);
                    System.out.println("De winkelwagen is leeg.");
                    break;

                case 4:
                    System.out.println("Mijn kortingcodes: ");
                    for (KortingsCode code : mijnKortingCodes) {
                        System.out.println("- " + code);
                    }

                    System.out.println("Voer de kortingcode in: (code)");
                    String kortingCodeString = scanner.nextLine();
                    KortingsCode kortingCode = null;
                    for (KortingsCode code : mijnKortingCodes) {
                        if (code.getCode().equalsIgnoreCase(kortingCodeString)) {
                            kortingCode = code;
                            break;
                        }
                    }

                    if (kortingCode == null) {
                        System.out.println("Kortingcode niet gevonden.");
                        break;
                    }

                    if (consument.getGebruikteKortingCode()!= null) {
                        System.out.println("Er is al een kortingcode toegepast. Wil je deze vervangen? (ja/nee)");
                        String antwoord = scanner.nextLine();
                        if (!antwoord.equalsIgnoreCase("ja")) {
                            break;
                        }
                    }

                    consument.kortingToepassen(kortingCode);
                    System.out.println(kortingCode + " is toegepast.");
                    break;

                case 5:
                    double totaalPrijs = consument.rekenAf();
                    mijnKortingCodes.remove(consument.getGebruikteKortingCode());
                    consument.setGebruikteKortingCode(null);
                    System.out.println("De winkelwagen is leeg en de kortingcode is niet meer beschikbaar.");
                    System.out.println("Totaalprijs: " + totaalPrijs);
                    break;

                case 6:
                    System.out.println("Producten in de winkelwagen:");
                    Map<String, Integer> productsWithCount2 = new HashMap<>();
                    // Dit creëert een nieuwe HashMap met
                    // sleutels van het type String en waarden van het type Integer en wijst deze toe aan de variabele productsWithCount2.
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
                    break;

                case 7:
                    System.out.println("Mijn kortingcodes:");
                    for (KortingsCode code : mijnKortingCodes) {
                        System.out.println("- " + code);
                    }
                    break;

                case 8:
                    System.out.println("Bedankt voor je bezoek aan de winkel!");
                    return;

                default:
                    System.out.println("Ongeldige keuze. Probeer opnieuw.");
                    break;
            }
        }
    }
}