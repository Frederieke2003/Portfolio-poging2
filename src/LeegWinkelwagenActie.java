import java.util.Scanner;

public class LeegWinkelwagenActie implements Action{

    @Override
    public void execute(Consument consument, Scanner scanner) {
        consument.winkelwagen.leegWinkelwagen();
        consument.setGebruikteKortingCode(null);
        System.out.println("De winkelwagen is leeg.");
    }
}
