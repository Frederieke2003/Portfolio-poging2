import org.junit.Test;
import static org.junit.Assert.*;

public class Test3 {

    @Test
    public void testBerekenTotaalPrijs() {
        //Arrange
        Winkelwagen winkelwagen = new Winkelwagen();
        Product product1 = new Product("Broodje frikandel", 2.00);
        Product product2 = new AGF("Ananas", 4.00, "Fruit");

        //Act
        winkelwagen.voegProductToe(product1);
        winkelwagen.voegProductToe(product2);
        double verwachteTotaalPrijs = product1.getPrijs() + product2.getPrijs();

        //Assert
        assertEquals(verwachteTotaalPrijs, winkelwagen.getTotaal(), 0.01);
    }
}
