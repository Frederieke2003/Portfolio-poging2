public class StandaardKortingsCode implements KortingsCode {
    private String code;
    private int kortingWaarde;

    public StandaardKortingsCode(String code, int kortingWaarde) {
        this.code = code;
        this.kortingWaarde = kortingWaarde;
    }

    public String getCode() {
        return code;
    }

    @Override
    public int getKortingWaarde() {
        return kortingWaarde;
    }

    @Override
    public String toString() {
        return code + " (€" + kortingWaarde + " korting)";
    }
}
