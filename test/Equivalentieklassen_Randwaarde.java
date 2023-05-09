import org.junit.Test;
import static org.junit.Assert.*;

public class Equivalentieklassen_Randwaarde {
    @Test
    public void test() {
        //Arrange
        Product product1 = new VersProduct("Melk", 3.90, 8);
        Product product2 = new VersProduct("Kaas", 4.00, 6);
        Product product3 = new VersProduct("Boter", 2.50, 2);
        Product product4 = new VersProduct("Vifit", 8, 1);
        Product product5 = new VersProduct("Kruidenboter", 2.00, 5);
        Product product6 = new VersProduct("Chocomelk", 3.00, 4);

        //Act
        double prijs1 = product1.getPrijs();
        double prijs2 = product2.getPrijs();
        double prijs3 = product3.getPrijs();
        double prijs4 = product4.getPrijs();
        double prijs5 = product5.getPrijs();
        double prijs6 = product6.getPrijs();

        //Assert
        assertEquals(3.51, prijs1, 0.001);
        assertEquals(3.60, prijs2, 0.001);
        assertEquals(1.25, prijs3, 0.001);
        assertEquals(4.00, prijs4, 0.001);
        assertEquals(1.60, prijs5, 0.001);
        assertEquals(2.40, prijs6, 0.001);



    }

}
