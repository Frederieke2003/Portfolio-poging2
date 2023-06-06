import java.util.Scanner;

public class StoppenActie implements Action{
    @Override
    public void execute(Consument consument, Scanner scanner) {
        System.out.println("Bedankt voor je bezoek aan de winkel!");
        System.exit(0);
    }
}
