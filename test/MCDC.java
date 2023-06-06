import org.junit.*;
import static org.junit.Assert.*;

public class MCDC {
    @Test
    public void test() {
        //arrange
        Product product1 = new StandaardProduct("Tomatensaus", 15.00);
        Consument consument1 = new Consument(1, 14);
        StandaardKortingsCode kortingsCode1 = new StandaardKortingsCode("Korting05", 5);

        Product product2 = new StandaardProduct("Knoflook", 5);
        Consument consument2 = new Consument(2, 15);
        StandaardKortingsCode kortingsCode2 = new StandaardKortingsCode("Korting06", 6);

        Product product3 = new StandaardProduct("Jam", 90.00);
        Consument consument3 = new Consument(3, 16);
        StandaardKortingsCode kortingsCode3 = new StandaardKortingsCode("Korting07", 7);

        Product product4 = new StandaardProduct("Bananenwraps", 10.02);
        Consument consument4 = new Consument(4, 10);
        StandaardKortingsCode kortingsCode4 = new StandaardKortingsCode("Korting08", 8);

        //act
        consument1.winkelwagen.voegProductToe(product1);
        consument1.kortingToepassen(kortingsCode1);

        consument2.winkelwagen.voegProductToe(product2);
        consument2.kortingToepassen(kortingsCode2);

        consument3.winkelwagen.leegWinkelwagen();
        consument3.kortingToepassen(kortingsCode3);

        consument4.winkelwagen.voegProductToe(product4);
        consument4.kortingToepassen(kortingsCode4);

        //assert
        assertEquals(kortingsCode1, consument1.getGebruikteKortingCode());
        System.out.println(consument1.getGebruikteKortingCode());
        assertEquals(null, consument2.getGebruikteKortingCode());
        System.out.println(consument2.getGebruikteKortingCode());
        assertEquals(null, consument3.getGebruikteKortingCode());
        System.out.println(consument3.getGebruikteKortingCode());
        assertEquals(null, consument4.getGebruikteKortingCode());
        System.out.println(consument4.getGebruikteKortingCode());

    }
}
