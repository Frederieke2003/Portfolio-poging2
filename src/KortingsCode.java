public class KortingsCode {
    private String code;
    private int kortingWaarde;

    public KortingsCode(String code, int kortingWaarde) {
        this.code = code;
        this.kortingWaarde = kortingWaarde;
    }

    public String getCode() {
        return code;
    }

    public int getKortingWaarde() {
        return kortingWaarde;
    }

    @Override
    public String toString() {
        return code + " (€" + kortingWaarde + " korting)";
    }
}