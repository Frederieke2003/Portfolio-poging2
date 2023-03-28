import org.junit.Test;
import static org.junit.Assert.*;

public class Test4 {

    @Test
    public void testGetPrijsUitVers() {
        //Arrange
        Product product1 = new VersProduct("Melk", 3.90, 3);
        Product product2 = new VersProduct("Kaas", 4.00, 1);
        Product product3 = new VersProduct("Boter", 2.50, 6);

        //Act
        double prijs1 = product1.getPrijs();
        double prijs2 = product2.getPrijs();
        double prijs3 = product3.getPrijs();

        //Assert
        assertEquals(3.12, prijs1, 0.001);
        assertEquals(2, prijs2, 0.001);
        assertEquals(2.50, prijs3, 0.001);
    }
}
