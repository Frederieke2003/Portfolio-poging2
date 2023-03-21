import java.util.ArrayList;
import java.util.List;

public class Consument {
    private int consumentId;
    public Winkelwagen winkelwagen;
    private List<KortingsCode> kortingsCodes;
    private KortingsCode gebruikteKortingCode;

    public Consument(int consumentId) {
        this.consumentId = consumentId;
        this.winkelwagen = new Winkelwagen();
        this.kortingsCodes = new ArrayList<>();
    }

    public void kortingToepassen(KortingsCode kortingsCode) {
        this.gebruikteKortingCode = kortingsCode;
    }

    public double rekenAf() {
        double totaalPrijs = winkelwagen.getTotaal();
        if (gebruikteKortingCode != null) {
            totaalPrijs -= gebruikteKortingCode.getKortingWaarde();
        }
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
