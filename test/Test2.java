import org.junit.Test;
import static org.junit.Assert.*;

public class Test2 {
    @Test
    public void testRekenAf() {
        //Arrange
        Consument consument = new Consument(01, 13);
        Winkelwagen winkelwagen = new Winkelwagen();
        Product product1 = new StandaardProduct("Cola", 8);
        Product product2 = new VersProduct("Vifit", 8, 8);
        StandaardKortingsCode kortingsCode = new StandaardKortingsCode("KORTINGSCODETEST", 10);

        //Act
        winkelwagen.voegProductToe(product1);
        winkelwagen.voegProductToe(product2);
        consument.setWinkelwagen(winkelwagen);
        consument.kortingToepassen(kortingsCode);

        //Assert
        assertEquals(6, consument.rekenAf(), 0.01);
        assertTrue(consument.winkelwagen.getProducten().size() == 0);

    }
}
