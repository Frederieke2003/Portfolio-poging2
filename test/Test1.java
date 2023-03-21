import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Test1 {
@Test
    public void testVoegProductToe() {
    //Arrange
    Winkelwagen winkelwagen = new Winkelwagen();

    //Act
    Product product = new Product("Wijn", 5.00, 4);
    winkelwagen.voegProductToe(product);

    //Assert
    assertTrue(winkelwagen.getProducten().contains(product));

}
}
