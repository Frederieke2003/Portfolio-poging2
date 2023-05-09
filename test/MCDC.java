import org.junit.*;
import static org.junit.Assert.*;

public class MCDC {
    @Test
    public void test() {
        //arrange
        Winkelwagen winkelwagen = new Winkelwagen();
        Product product = new Product("Tomatensaus", 15.00);
        Consument consument = new Consument(1, 14);
        KortingsCode kortingsCode = new KortingsCode("Korting05", 5);

        //act
        winkelwagen.voegProductToe(product);
        consument.kortingToepassen(kortingsCode);
        consument.setGebruikteKortingCode(kortingsCode);

        //assert
        assertEquals(kortingsCode, consument.getGebruikteKortingCode());
        System.out.println(consument.getGebruikteKortingCode());
    }
}
