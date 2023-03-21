import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test2 {
    @Test
    public void testGetTotaalprijs() {
        //Arrange
        Winkelwagen winkelwagen = new Winkelwagen();

        //Act
        Product product1 = new Agf("Apple", 2.50, 2, "Fruit");
        Product product2 = new Product("Chocolade", 3.00, 3);
        winkelwagen.voegProductToe(product1);
        winkelwagen.voegProductToe(product2);

        //Assert
        assertEquals(14.0, winkelwagen.getTotaal(), 0.01);
    }
}
