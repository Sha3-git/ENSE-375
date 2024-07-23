import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import LightSim.Snell;

public class boundaryValueTests {

    private static final double DELTA = 1e-2; // tolerance for floating point comparisons

    @Test
    public void testCalculateIndex1_AllCases() {
        Snell snell;

        // Case 1: Min, Nom, Nom
        snell = new Snell(0, 45, 0, 1.5);
        assertTrue(Double.isInfinite(snell.calculateIndex1()));

        // Case 2: Min+, Nom, Nom
        snell = new Snell(1, 45, 0, 1.5);
        assertEquals(60.77, snell.calculateIndex1(), DELTA);

        // Case 3: Min-, Nom, Nom
        snell = new Snell(-1, 45, 0, 1.5);
        assertEquals(-1.0, snell.calculateIndex1(), DELTA);

        // Case 4: Max, Nom, Nom
        snell = new Snell(90, 45, 0, 1.5);
        assertEquals(1.06, snell.calculateIndex1(), DELTA);

        // Case 5: Max-, Nom, Nom
        snell = new Snell(89, 45, 0, 1.5);
        assertEquals(1.06, snell.calculateIndex1(), DELTA);

        // Case 6: Max+, Nom, Nom
        snell = new Snell(91, 45, 0, 1.5);
        assertEquals(-1, snell.calculateIndex1(), DELTA);

        // Case 7: Nom, Min, Nom
        snell = new Snell(45, 1, 0, 1.5);
        assertEquals(0.03, snell.calculateIndex1(), DELTA);

        // Case 8: Nom, Min+, Nom
        snell = new Snell(45, 2, 0, 1.5);
        assertEquals(0.07, snell.calculateIndex1(), DELTA);

        // Case 9: Nom, Min-, Nom
        snell = new Snell(45, -1, 0, 1.5);
        assertEquals(-1.0, snell.calculateIndex1(), DELTA);

        // Case 10: Nom, Max, Nom
        snell = new Snell(45, 90, 0, 1.5);
        assertEquals(2.12, snell.calculateIndex1(), DELTA);

        // Case 11: Nom, Max-, Nom
        snell = new Snell(45, 89, 0, 1.5);
        assertEquals(2.12, snell.calculateIndex1(), DELTA);

        // Case 12: Nom, Max+, Nom
        snell = new Snell(45, 91, 0, 1.5);
        assertEquals(-1, snell.calculateIndex1(), DELTA);

        // Case 13: Nom, Nom, Min
        snell = new Snell(45, 45, 0, 1);
        assertEquals(1.0, snell.calculateIndex1(), DELTA);

        // Case 14: Nom, Nom, Min+
        snell = new Snell(45, 45, 0, 2);
        assertEquals(2.0, snell.calculateIndex1(), DELTA);

        // Case 15: Nom, Nom, Min-
        snell = new Snell(45, 45, 0, -1);
        assertEquals(-1.0, snell.calculateIndex1(), DELTA);

        // Case 16: Nom, Nom, Max
        snell = new Snell(45, 45, 0, 4);
        assertEquals(4.0, snell.calculateIndex1(), DELTA);

        // Case 17: Nom, Nom, Max-
        snell = new Snell(45, 45, 0, 3);
        assertEquals(3.0, snell.calculateIndex1(), DELTA);

        // Case 18: Nom, Nom, Max+
        snell = new Snell(45, 45, 0, 5);
        assertEquals(-1, snell.calculateIndex1(), DELTA);

        // Case 19: Nom, Nom, Nom
        snell = new Snell(25, 65, 0, 2.5);
        assertEquals(5.36, snell.calculateIndex1(), DELTA);
        
    }
    
    
    
    
    
    
    
    @Test
    public void testCalculateIndex2_AllCases() {
        Snell snell;

        // Case 1: Min, Nom, Nom
        snell = new Snell(0, 45, 1.5, 0);
        assertEquals(0, snell.calculateIndex2(), DELTA);

        // Case 2: Min+, Nom, Nom
        snell = new Snell(1, 45, 1.5, 0);
        assertEquals(0.03, snell.calculateIndex2(), DELTA);

        // Case 3: Min-, Nom, Nom
        snell = new Snell(-1, 45, 1.5, 0);
        assertEquals(-1, snell.calculateIndex2(), DELTA);

        // Case 4: Max, Nom, Nom
        snell = new Snell(90, 45, 1.5, 0);
        assertEquals(2.12, snell.calculateIndex2(), DELTA);

        // Case 5: Max-, Nom, Nom
        snell = new Snell(89, 45, 1.5, 0);
        assertEquals(2.12, snell.calculateIndex2(), DELTA);

        // Case 6: Max+, Nom, Nom
        snell = new Snell(91, 45, 1.5, 0);
        assertEquals(-1, snell.calculateIndex2(), DELTA);

        // Case 7: Nom, Min, Nom
        snell = new Snell(45, 0, 1.5, 0);
        assertTrue(Double.isInfinite(snell.calculateIndex2()));

        // Case 8: Nom, Min+, Nom
        snell = new Snell(45, 1, 1.5, 0);
        assertEquals(60.77, snell.calculateIndex2(), DELTA);

        // Case 9: Nom, Min-, Nom
        snell = new Snell(45, -1, 1.5, 0);
        assertEquals(-1, snell.calculateIndex2(), DELTA);

        // Case 10: Nom, Max, Nom
        snell = new Snell(45, 90, 1.5, 0);
        assertEquals(1.06, snell.calculateIndex2(), DELTA);

        // Case 11: Nom, Max-, Nom
        snell = new Snell(45, 89, 1.5, 0);
        assertEquals(1.06, snell.calculateIndex2(), DELTA);

        // Case 12: Nom, Max+, Nom
        snell = new Snell(45, 91, 1.5, 0);
        assertEquals(-1, snell.calculateIndex2(), DELTA);

        // Case 13: Nom, Nom, Min
        snell = new Snell(45, 45, 1.0, 0);
        assertEquals(1.0, snell.calculateIndex2(), DELTA);

        // Case 14: Nom, Nom, Min+
        snell = new Snell(45, 45, 2.0, 0);
        assertEquals(2.0, snell.calculateIndex2(), DELTA);

        // Case 15: Nom, Nom, Min-
        snell = new Snell(45, 45, -1.0, 0);
        assertEquals(-1.0, snell.calculateIndex2(), DELTA);

        // Case 16: Nom, Nom, Max
        snell = new Snell(45, 45, 4.0, 0);
        assertEquals(4.0, snell.calculateIndex2(), DELTA);

        // Case 17: Nom, Nom, Max-
        snell = new Snell(45, 45, 3.0, 0);
        assertEquals(3.0, snell.calculateIndex2(), DELTA);

        // Case 18: Nom, Nom, Max+
        snell = new Snell(45, 45, 5.0, 0);
        assertEquals(-1, snell.calculateIndex2(), DELTA);

        // Case 19: Nom, Nom, Nom
        snell = new Snell(25, 65, 2.5, 0);
        assertEquals(1.16, snell.calculateIndex2(), DELTA);       
    
}
    
    
    
    
    
   
    @Test
    public void testCalculateTheta1_AllCases() {
        Snell snell;

        // Case 1: Min, Nom, Nom
        snell = new Snell(0, 0, 1.75, 1.5);
        assertEquals(0, snell.calculateTheta1(), DELTA);

        // Case 2: Min+, Nom, Nom
        snell = new Snell(0, 1, 1.75, 1.5);
        assertEquals(0.85, snell.calculateTheta1(), DELTA);

        // Case 3: Min-, Nom, Nom
        snell = new Snell(0, -1, 1.75, 1.5);
        assertEquals(-1.0, snell.calculateTheta1(), DELTA);

        // Case 4: Max, Nom, Nom
        snell = new Snell(0, 90, 1.75, 1.5);
        assertEquals(59.0, snell.calculateTheta1(), DELTA);

        // Case 5: Max-, Nom, Nom
        snell = new Snell(0, 89, 1.75, 1.5);
        assertEquals(58.98, snell.calculateTheta1(), DELTA);

        // Case 6: Max+, Nom, Nom
        snell = new Snell(0, 91, 1.75, 1.5);
        assertEquals(-1, snell.calculateTheta1(), DELTA);

        // Case 7: Nom, Min, Nom
        snell = new Snell(0, 45, 1.0, 1.0);
        assertEquals(45.0, snell.calculateTheta1(), DELTA);

        // Case 8: Nom, Min+, Nom
        snell = new Snell(0, 45, 2.0, 1.5);
        assertEquals(32.03, snell.calculateTheta1(), DELTA);

        // Case 9: Nom, Min-, Nom
        snell = new Snell(0, 45, -1.0, 1.5);
        assertEquals(-1.0, snell.calculateTheta1(), DELTA);

        // Case 10: Nom, Max, Nom
        snell = new Snell(0, 45, 4.0, 1.5);
        assertEquals(15.38, snell.calculateTheta1(), DELTA);

        // Case 11: Nom, Max-, Nom
        snell = new Snell(0, 45, 3.0, 1.5);
        assertEquals(20.70, snell.calculateTheta1(), DELTA);

        // Case 12: Nom, Max+, Nom
        snell = new Snell(0, 45, 5.0, 1.5);
        assertEquals(-1.0, snell.calculateTheta1(), DELTA);

        // Case 13: Nom, Nom, Min
        snell = new Snell(0, 45, 1.5, 1.0);
        assertEquals(28.12, snell.calculateTheta1(), DELTA);

        // Case 14: Nom, Nom, Min+
        snell = new Snell(0, 45, 1.5, 2.0);
        assertEquals(70.53, snell.calculateTheta1(), DELTA);

        // Case 15: Nom, Nom, Min-
        snell = new Snell(0, 45, 1.5, -1.0);
        assertEquals(-1.0, snell.calculateTheta1(), DELTA);

        // Case 16: Nom, Nom, Max
        snell = new Snell(0, 45, 4.0, 4.0);
        assertEquals(45.0, snell.calculateTheta1(), DELTA);

        // Case 17: Nom, Nom, Max-
        snell = new Snell(0, 45, 4.0, 3.0);
        assertEquals(32.03, snell.calculateTheta1(), DELTA);

        // Case 18: Nom, Nom, Max+
        snell = new Snell(0, 45, 1.5, 5.0);
        assertEquals(-1.0, snell.calculateTheta1(), DELTA);

        // Case 19: Nom, Nom, Nom
        snell = new Snell(0, 25, 3.0, 2.0);
        assertEquals(16.36, snell.calculateTheta1(), DELTA);
    }
    
    
    
    
    
    @Test
    public void testCalculateTheta2_AllCases() {
        Snell snell;

        // Case 1: Min, Nom, Nom
        snell = new Snell(0, 0, 1.75, 1.5);
        assertEquals(0, snell.calculateTheta2(), DELTA);

        // Case 2: Min+, Nom, Nom
        snell = new Snell(1, 0, 1.75, 1.5);
        assertEquals(1.16, snell.calculateTheta2(), DELTA);

        // Case 3: Min-, Nom, Nom
        snell = new Snell(-1, 0, 1.75, 1.5);
        assertEquals(-1.0, snell.calculateTheta2(), DELTA);

        // Case 4: Max, Nom, Nom
        snell = new Snell(90, 0, 1.75, 1.5);
        assertTrue(Double.isNaN(snell.calculateTheta2()));

        // Case 5: Max-, Nom, Nom
        snell = new Snell(89, 0, 1.75, 1.5);
        assertTrue(Double.isNaN(snell.calculateTheta2()));

        // Case 6: Max+, Nom, Nom
        snell = new Snell(91, 0, 1.75, 1.5);
        assertEquals(-1, snell.calculateTheta2(), DELTA);

        // Case 7: Nom, Min, Nom
        snell = new Snell(45, 0, 1.0, 1.0);
        assertEquals(45.0, snell.calculateTheta2(), DELTA);

        // Case 8: Nom, Min+, Nom
        snell = new Snell(45, 0, 2.0, 1.5);
        assertEquals(70.52, snell.calculateTheta2(), DELTA);

        // Case 9: Nom, Min-, Nom
        snell = new Snell(45, 0, -1.0, 1.5);
        assertEquals(-1.0, snell.calculateTheta2(), DELTA);

        // Case 10: Nom, Max, Nom
        snell = new Snell(45, 0, 4.0, 1.5);
        assertTrue(Double.isNaN(snell.calculateTheta2()));

        // Case 11: Nom, Max-, Nom
        snell = new Snell(45, 0, 3.0, 1.5);
        assertTrue(Double.isNaN(snell.calculateTheta2()));

        // Case 12: Nom, Max+, Nom
        snell = new Snell(45, 0, 5.0, 1.5);
        assertEquals(-1.0, snell.calculateTheta2(), DELTA);

        // Case 13: Nom, Nom, Min
        snell = new Snell(45, 0, 1.5, 1.0);
        assertTrue(Double.isNaN(snell.calculateTheta2()));

        // Case 14: Nom, Nom, Min+
        snell = new Snell(45, 0, 1.5, 2.0);
        assertEquals(32.02, snell.calculateTheta2(), DELTA);

        // Case 15: Nom, Nom, Min-
        snell = new Snell(45, 0, 1.5, -1.0);
        assertEquals(-1.0, snell.calculateTheta2(), DELTA);

        // Case 16: Nom, Nom, Max
        snell = new Snell(45, 0, 4.0, 4.0);
        assertEquals(45.0, snell.calculateTheta2(), DELTA);

        // Case 17: Nom, Nom, Max-
        snell = new Snell(45, 0, 4.0, 3.0);
        assertEquals(70.52, snell.calculateTheta2(), DELTA);

        // Case 18: Nom, Nom, Max+
        snell = new Snell(45, 0, 1.5, 5.0);
        assertEquals(-1.0, snell.calculateTheta2(), DELTA);

        // Case 19: Nom, Nom, Nom
        snell = new Snell(25, 0, 3.0, 2.0);
        assertEquals(39.34, snell.calculateTheta2(), DELTA);
    }
    

}