import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AfrekenenActie implements Action {
    private List<StandaardKortingsCode> mijnKortingCodes = new ArrayList<>();


    @Override
    public void execute(Consument consument, Scanner scanner) {
        double totaalPrijs = consument.rekenAf();
                    mijnKortingCodes.remove(consument.getGebruikteKortingCode());
                    consument.setGebruikteKortingCode(null);
                    System.out.println("De winkelwagen is leeg en de kortingcode is niet meer beschikbaar.");
                    System.out.println("Totaalprijs: " + totaalPrijs);
    }
}
