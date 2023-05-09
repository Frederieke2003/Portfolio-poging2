import java.util.ArrayList;
import java.util.List;

public class Consument {
    private int consumentId;
    private int leeftijd;
    public Winkelwagen winkelwagen;
    private List<KortingsCode> kortingsCodes;
    private KortingsCode gebruikteKortingCode;

    public Consument(int consumentId, int leeftijd) {
        this.consumentId = consumentId;
        this.leeftijd = leeftijd;
        this.winkelwagen = new Winkelwagen();
        this.kortingsCodes = new ArrayList<>();
    }

    public void kortingToepassen(KortingsCode kortingsCode) {
        if (leeftijd > 12 && winkelwagen.getTotaal() > 10.00) {
            this.gebruikteKortingCode = kortingsCode;
            System.out.println(kortingsCode + " is toegepast.");
            setGebruikteKortingCode(kortingsCode);
        }
        else{ System.out.println("Sorry, u moet meer dan €10 bestellen om een kortingscode toe te passen.");
        gebruikteKortingCode = null;}
    }

    public double rekenAf() {
        double totaalPrijs = winkelwagen.getTotaal();
        if (gebruikteKortingCode != null) {
            totaalPrijs -= gebruikteKortingCode.getKortingWaarde();
        }
        //winkelwagen.leegWinkelwagen();
        return totaalPrijs;
    }

    public void voegKortingCodeToe(KortingsCode kortingsCode) {
        kortingsCodes.add(kortingsCode);
    }

    public int getConsumentId() {
        return consumentId;
    }

    public void setConsumentId(int consumentId) {
        this.consumentId = consumentId;
    }

    public int getLeeftijd() {return leeftijd;}
    public void setLeeftijd(int leeftijd) {this.leeftijd=leeftijd;}

    public Winkelwagen getWinkelwagen() {
        return winkelwagen;
    }

    public void setWinkelwagen(Winkelwagen winkelwagen) {
        this.winkelwagen = winkelwagen;
    }

    public List<KortingsCode> getKortingsCodes() {
        return kortingsCodes;
    }

    public void setKortingsCodes(List<KortingsCode> kortingsCodes) {
        this.kortingsCodes = kortingsCodes;
    }

    public KortingsCode getGebruikteKortingCode() {
        return gebruikteKortingCode;
    }

    public void setGebruikteKortingCode(KortingsCode gebruikteKortingCode) {
        this.gebruikteKortingCode = gebruikteKortingCode;
    }
}
