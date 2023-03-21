public class Afrekenen {
    public double berekenTotaalBedrag(Winkelwagen winkelwagen) {
        double totaalBedrag = 0;

        for (Product product : winkelwagen.getProducten()) {
            totaalBedrag += product.getPrijs() * product.getAantal();
        }

        System.out.println("Uw totaal bedrag is: " + totaalBedrag);

        return totaalBedrag;
    }

    public void leegWinkelwagen(Winkelwagen winkelwagen) {
        winkelwagen.getProducten().clear();
        System.out.println("Uw winkelwagen is leeg gemaakt.");
    }


}