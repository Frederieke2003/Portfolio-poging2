import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KortingscodeToepassenActie implements Action{
    private List<StandaardKortingsCode> mijnKortingCodes = new ArrayList<>();


    @Override
    public void execute(Consument consument, Scanner scanner) {
        System.out.println("Mijn kortingcodes: ");
        for (StandaardKortingsCode code : mijnKortingCodes) {
            System.out.println("- " + code);
        }

        System.out.println("Voer de kortingcode in: (code)");
        String kortingCodeString = scanner.nextLine();
        StandaardKortingsCode kortingCode = null;
        for (StandaardKortingsCode code : mijnKortingCodes) {
            if (code.getCode().equalsIgnoreCase(kortingCodeString)) {
                kortingCode = code;
            }
        }

        if (kortingCode == null) {
            System.out.println("Kortingcode niet gevonden.");
        }

        if (consument.getGebruikteKortingCode() != null) {
            System.out.println("Er is al een kortingcode toegepast. Wil je deze vervangen? (ja/nee)");
            String antwoord = scanner.nextLine();
            if (!antwoord.equalsIgnoreCase("ja")) {
            }
        }

        consument.kortingToepassen(kortingCode);
    }
}
