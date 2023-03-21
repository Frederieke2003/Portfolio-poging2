import org.junit.Test;
import static org.junit.Assert.*;

public class Test1 {
@Test
public void testVerwijderProduct() {
    //Arrange
    Winkelwagen winkelwagen = new Winkelwagen();
    Product product1 = new Product("Pindakaas", 3.50);
    Product product2 = new VersProduct("Melk", 2.50, 4);

    //Act
    winkelwagen.voegProductToe(product1);
    winkelwagen.voegProductToe(product2);
    winkelwagen.verwijderProduct(product2);

    //Assert
    assertFalse(winkelwagen.getProducten().contains(product2));


}
}
