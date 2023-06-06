import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BekijkKortingscodeActie implements Action{
    private List<StandaardKortingsCode> mijnKortingCodes = new ArrayList<>();
    @Override
    public void execute(Consument consument, Scanner scanner) {
        System.out.println("Mijn kortingcodes:");
        for (KortingsCode code : mijnKortingCodes) {
            System.out.println("- " + code);
        }
    }
}
