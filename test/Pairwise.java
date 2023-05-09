import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class Pairwise {
    @Test
    public void test() {
        //arrange
        KortingsCode kortingsCode = new KortingsCode("Korting05", 5);

        Consument consument1 = new Consument(1, 10);
        Product product1 = new VersProduct("Melk", 10.00, 1);
        Consument consument2 = new Consument(2, 10);
        Product product2 = new VersProduct("Boter", 11, 1);
        Consument consument3 = new Consument(3, 13);
        Product product3 = new VersProduct("Vifit", 11,4);
        Consument consument4 = new Consument(4, 13);
        Product product4 = new VersProduct("Chocomelk", 10, 4);
        Consument consument5 = new Consument(5, 12);
        Product product5 = new VersProduct("Kruidenboter", 10, 7);
        Consument consument6 = new Consument(5, 12);
        Product product6 = new VersProduct("Roomboter", 11,7);



        //act
        consument1.winkelwagen.voegProductToe(product1);
        consument1.kortingToepassen(kortingsCode);

        consument2.winkelwagen.leegWinkelwagen();
        consument2.kortingToepassen(kortingsCode);

        consument3.winkelwagen.voegProductToe(product3);
        consument3.kortingToepassen(kortingsCode);

        consument4.winkelwagen.leegWinkelwagen();
        consument4.kortingToepassen(kortingsCode);

        consument5.winkelwagen.voegProductToe(product5);
        consument5.kortingToepassen(kortingsCode);

        consument6.winkelwagen.leegWinkelwagen();
        consument6.kortingToepassen(kortingsCode);

        //assert
        assertEquals(5.0 ,consument1.winkelwagen.getTotaal(), 0.001);
        System.out.println(consument1.winkelwagen.getTotaal());

        assertEquals(0, consument2.winkelwagen.getTotaal(), 0.001);
        System.out.println(consument2.winkelwagen.getTotaal());

        assertEquals(8.80, consument3.winkelwagen.getTotaal() , 0.001);
        System.out.println(consument3.winkelwagen.getTotaal());

        assertEquals(0,consument4.winkelwagen.getTotaal(), 0.001);
        System.out.println(consument4.winkelwagen.getTotaal());

        assertEquals(9.00, consument5.winkelwagen.getTotaal(), 0.001);
        System.out.println(consument5.winkelwagen.getTotaal());

        assertEquals(0, consument6.winkelwagen.getTotaal(), 0.001);
        System.out.println(consument6.winkelwagen.getTotaal());


    }
}

