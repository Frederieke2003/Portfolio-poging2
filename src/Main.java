import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Action> actions = new HashMap<>();
        actions.put(1, new ProductToevoegenActie());
        actions.put(2, new ProductVerwijderenActie());
        actions.put(3, new LeegWinkelwagenActie());
        actions.put(4, new KortingscodeToepassenActie());
        actions.put(5, new AfrekenenActie());
        actions.put(6, new BekijkWinkelwagenActie());
        actions.put(7, new BekijkKortingscodeActie());
        actions.put(8, new StoppenActie());




        Scanner scanner = new Scanner(System.in);
        Consument consument = new Consument(1, 13);

        List<Product> beschikbareProducten = new ArrayList<>();
        beschikbareProducten.add(new StandaardProduct("Brood", 2.50));
        beschikbareProducten.add(new StandaardProduct("Cola", 4));
        beschikbareProducten.add(new VersProduct("Melk", 20, 7));
        beschikbareProducten.add(new VersProduct("Kaas", 5, 4));
        beschikbareProducten.add(new VersProduct("Eieren", 15, 2));
        beschikbareProducten.add(new AGF("Appel", 1.00, "Fruit"));
        beschikbareProducten.add(new AGF("Bloemkool", 2.50, "Groente"));
        Action productToevoegenActie = new ProductToevoegenActie();

        List<StandaardKortingsCode> mijnKortingCodes = new ArrayList<>();
        mijnKortingCodes.add(new StandaardKortingsCode("KORTING05", 5));
        mijnKortingCodes.add(new StandaardKortingsCode("BLACKFRIDAY", 10));
        mijnKortingCodes.add(new StandaardKortingsCode("KORTING10", 10));
        mijnKortingCodes.add(new StandaardKortingsCode("KORTING20", 20));
        Action kortingscodeToepassenActie = new KortingscodeToepassenActie();

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

            Action selectedAction = actions.get(keuze);
            if (selectedAction != null) {
                selectedAction.execute(consument, scanner);
            } else {
                System.out.println("Ongeldige keuze. Probeer opnieuw.");
            }

        }
    }
