import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Winkelwagen winkelwagen = new Winkelwagen();
        Afrekenen afrekenen = new Afrekenen();


        List<Product> beschikbareProducten = new ArrayList<>();
        beschikbareProducten.add(new Product("Brood", 2.50, 10));
        beschikbareProducten.add(new Product("Cola", 4, 30));
        beschikbareProducten.add(new VersProduct("Melk", 1.50, 20, 7));
        beschikbareProducten.add(new VersProduct("Kaas", 3.75, 5, 4));
        beschikbareProducten.add(new VersProduct("Eieren", 2.00, 15, 2));
        beschikbareProducten.add(new Agf("Appel", 1.00, 50, "Fruit"));
        beschikbareProducten.add(new Agf("Bloemkool", 2.50, 15, "Groente"));

        boolean doorgaan = true;

        while (doorgaan) {
            System.out.println("Beschikbare producten:");
            for (int i = 0; i < beschikbareProducten.size(); i++) {
                System.out.println((i+1) + ". " + beschikbareProducten.get(i).getNaam());
            }

            System.out.println();
            System.out.println("8. Winkelwagen bekijken");
            System.out.println("9. Afrekenen");
            System.out.println("10. Stoppen");
            System.out.print("Kies een optie: ");
            int optie = scanner.nextInt();

            switch (optie) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    Product geselecteerdProduct = beschikbareProducten.get(optie - 1);
                    System.out.println();
                    System.out.print("Hoeveel stuks wilt u kopen? ");
                    System.out.println();
                    int aantal = scanner.nextInt();
                    geselecteerdProduct.setAantal(aantal);
                    winkelwagen.voegProductToe(geselecteerdProduct);
                    System.out.println("Product is toegevoegd aan de winkelwagen.");
                    System.out.println("---------------------------------------------------------------------------------------");
                    break;
                case 8:
                    System.out.println("---------------------------------------------------------------------------------------");
                    winkelwagen.printWinkelwagen();
                    System.out.println("---------------------------------------------------------------------------------------");
                    break;
                case 9:
                    System.out.println("---------------------------------------------------------------------------------------");
                    afrekenen.berekenTotaalBedrag(winkelwagen);
                    afrekenen.leegWinkelwagen(winkelwagen);
                    System.out.println("---------------------------------------------------------------------------------------");
                    break;
                case 10:
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("Bedankt voor het winkelen!");
                    doorgaan = false;
                    break;
                default:
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("Ongeldige optie. Probeer opnieuw.");
                    System.out.println("---------------------------------------------------------------------------------------");

                    break;
            }
        }
    }
}