

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import LightSim.Snell;

import org.junit.jupiter.api.DisplayName;

/* 
 * Theta1 -> (-inf,0], [T1], [91,inf)
 * T1 = degree between 0-90
 * 
 * Theta2 -> (-inf,0], [T2], [91,inf)
 * T2 = degree between 0-90
 *
 * Index1 -> (-inf,1],[I1],[4.1,inf) 
 * I1 = index between 1-4
 * 
 * Index2 -> (-inf,1],[I2],[4.1,inf) 
 * I2 = index between 1-4
 * 
 * */

class EquivalenceClassTest{
	
	private static final double DELTA = 1e-2; // tolerance for floating point comparisons

	@Test
	@DisplayName("Test all cases for calculateIndex1")
	void testCalculateIndex1() {
		
		Snell snellTest;
		//theta1, theta2, idnex1, index2
		
		//case 1: 	(-inf,0]	(-inf,0]	(-inf,1]
		snellTest = new Snell(-1,-1,0,-1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
	
		//case 2: (-inf,0]	[T2]	(-inf,1]
		snellTest = new Snell(-1,45,0,-1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 3: (-inf,0]	[91,inf)	(-inf,1]
		snellTest = new Snell(-1,91,0,-1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 4:[T1]	(-inf,0]	(-inf,1]
		snellTest = new Snell(45,-1,0,-1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 5:[T1]	[T2]	(-inf,1]
		snellTest = new Snell(45,45,0,-1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 6:[T1]	[91,inf)	(-inf,1]
		snellTest = new Snell(45,91,0,-1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 7:[91,inf)	(-inf,0]	(-inf,1]
		snellTest = new Snell(91,-1,0,-1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 8:[91,inf)	[T2]	(-inf,1]
		snellTest = new Snell(91,45,0,-1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 9:[91,inf)	[91,inf)	(-inf,1]
		snellTest = new Snell(91,91,0,-1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 10:(-inf,0]	(-inf,0]	[I2]
		snellTest = new Snell(-1,-1,0,2);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 11:(-inf,0]	[T2]	[I2]
		snellTest = new Snell(-1,45,0,2);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 12:(-inf,0]	[91,inf)	[I2]
		snellTest = new Snell(-1,91,0,2);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 13:[T1]	(-inf,0]	[I2]
		snellTest = new Snell(45,-1,0,2);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 14:[T1]	[T2]	[I2]
		snellTest = new Snell(45,45,0,2);
		assertEquals(2, snellTest.calculateIndex1(), DELTA);
		
		//case 15:	[T1]	[91,inf)	[I2]
		snellTest = new Snell(45,91,0,2);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 16:[91,inf)	(-inf,0]	[I2]
		snellTest = new Snell(91,-1,0,2);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 17:[91,inf)	[T2]	[I2]
		snellTest = new Snell(91,45,0,2);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 18:[91,inf)	[91,inf)	[I2]
		snellTest = new Snell(91,91,0,2);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 19:(-inf,0]	(-inf,0]	[4.1,inf)
		snellTest = new Snell(-1,-1,0,4.1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 20:(-inf,0]	[T2]	[4.1,inf)
		snellTest = new Snell(-1,45,0,4.1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);

		//case 21:(-inf,0]	[91,inf)	[4.1,inf)
		snellTest = new Snell(-1,91,0,4.1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 22:[T1]	(-inf,0]	[4.1,inf)
		snellTest = new Snell(-1,-1,0,4.1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 23:	[T1]	[T2]	[4.1,inf)
		snellTest = new Snell(45,45,0,4.1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 24:[T1]	[91,inf)	[4.1,inf)
		snellTest = new Snell(45,91,0,4.1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 25:[91,inf)	(-inf,0]	[4.1,inf)
		snellTest = new Snell(91,-1,0,4.1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 26:[91,inf)	[T2]	[4.1,inf)
		snellTest = new Snell(91,45,0,4.1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
		//case 27:[91,inf)	[91,inf)	[4.1,inf)
		snellTest = new Snell(91,91,0,4.1);
		assertEquals(-1, snellTest.calculateIndex1(), DELTA);
		
	}

	@Test
	@DisplayName("Test all cases for calculateIndex2")
	void testCalculateIndex2() {
		
		Snell snellTest2;
		//theta1, theta2, idnex1, index2
		
		//case 1: 	(-inf,0]	(-inf,0]	(-inf,1]
		snellTest2 = new Snell(-1,-1,-1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
	
		//case 2: (-inf,0]	[T2]	(-inf,1]
		snellTest2 = new Snell(-1,45,-1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 3: (-inf,0]	[91,inf)	(-inf,1]
		snellTest2 = new Snell(-1,91,-1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 4:[T1]	(-inf,0]	(-inf,1]
		snellTest2 = new Snell(45,-1,-1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 5:[T1]	[T2]	(-inf,1]
		snellTest2 = new Snell(45,45,-1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 6:[T1]	[91,inf)	(-inf,1]
		snellTest2 = new Snell(45,91,-1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 7:[91,inf)	(-inf,0]	(-inf,1]
		snellTest2 = new Snell(91,-1,-1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 8:[91,inf)	[T2]	(-inf,1]
		snellTest2 = new Snell(91,45,-1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 9:[91,inf)	[91,inf)	(-inf,1]
		snellTest2 = new Snell(91,91,-1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 10:(-inf,0]	(-inf,0]	[I1]
		snellTest2 = new Snell(-1,-1,2,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 11:(-inf,0]	[T2]	[I1]
		snellTest2 = new Snell(-1,45,2,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 12:(-inf,0]	[91,inf)	[I1]
		snellTest2 = new Snell(-1,91,2,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 13:[T1]	(-inf,0]	[I1]
		snellTest2 = new Snell(45,-1,2,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 14:[T1]	[T2]	[I1]
		snellTest2 = new Snell(45,45,2,0);
		assertEquals(2, snellTest2.calculateIndex2(), DELTA);
		
		//case 15:	[T1]	[91,inf)	[I1]
		snellTest2 = new Snell(45,91,2,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 16:[91,inf)	(-inf,0]	[I1]
		snellTest2 = new Snell(91,-1,2,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 17:[91,inf)	[T2]	[I1]
		snellTest2 = new Snell(91,45,2,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 18:[91,inf)	[91,inf) [I1]
		snellTest2 = new Snell(91,91,2,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 19:(-inf,0]	(-inf,0]	[4.1,inf)
		snellTest2 = new Snell(-1,-1,4.1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 20:(-inf,0]	[T2]	[4.1,inf)
		snellTest2 = new Snell(-1,45,4.1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);

		//case 21:(-inf,0]	[91,inf)	[4.1,inf)
		snellTest2 = new Snell(-1,91,4.1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 22:[T1]	(-inf,0]	[4.1,inf)
		snellTest2 = new Snell(-1,-1,4.1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 23:	[T1]	[T2]	[4.1,inf)
		snellTest2 = new Snell(45,45,4.1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 24:[T1]	[91,inf)	[4.1,inf)
		snellTest2 = new Snell(45,91,4.1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 25:[91,inf)	(-inf,0]	[4.1,inf)
		snellTest2 = new Snell(91,-1,4.1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 26:[91,inf)	[T2]	[4.1,inf)
		snellTest2 = new Snell(91,45,4.1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
		
		//case 27:[91,inf)	[91,inf)	[4.1,inf)
		snellTest2 = new Snell(91,91,4.1,0);
		assertEquals(-1, snellTest2.calculateIndex2(), DELTA);
			
	}
	
	@Test
	@DisplayName("Test all cases for calculateTheta1")
	void testCalculateTheta1() {
		
		Snell snellTest3;
		//theta1, theta2, idnex1, index2
		
		//case 1: 	(-inf,0]	(-inf,1]	(-inf,1]
		snellTest3 = new Snell(0,-1,-1,-1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
	
		//case 2: (-inf, 0]	(-inf, 1]	(4.1, inf)
		snellTest3 = new Snell(0,-1,-1,4.1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 3: (-inf, 0]	(4.1, inf)	(-inf, 1]
		snellTest3 = new Snell(0,-1,4.1,-1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 4:(-inf, 0]	(4.1, inf)	(4.1, inf)
		snellTest3 = new Snell(0,-1,4.1,4.1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 5:[T2]	(-inf, 1]	(-inf, 1]
		snellTest3 = new Snell(0,45,-1,-1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 6:[T2]	(-inf, 1]	(4.1, inf)
		snellTest3 = new Snell(0,45,-1,4.1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 7:[T2]	(4.1, inf)	(-inf, 1]
		snellTest3 = new Snell(0,45,4.1,-1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 8:[T2]	(4.1, inf)	(4.1, inf)
		snellTest3 = new Snell(0,45,4.1,4.1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 9: [91, inf)	(-inf, 1]	(-inf, 1]
		snellTest3 = new Snell(0,91,-1,-1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 10:[91, inf)	(-inf, 1]	(4.1, inf)
		snellTest3 = new Snell(0,91,-1,4.1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 11:[91, inf)	(4.1, inf)	(-inf, 1]
		snellTest3 = new Snell(0,91,4.1,-1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 12:[91, inf)	(4.1, inf)	(4.1, inf)
		snellTest3 = new Snell(0,91,4.1,4.1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 13:(-inf, 0]	[I1]	(-inf, 1]
		snellTest3 = new Snell(0,-1,2,-1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 14:(-inf, 0]	[I1]	(4.1, inf)
		snellTest3 = new Snell(0,-1,2,4.1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 15:	(-inf, 0]	(4.1, inf)	[I2]
		snellTest3= new Snell(0,-1,4.1,2);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 16:(-inf, 0]	[I1]	[I2]
		snellTest3 = new Snell(0,-1,2,2);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 17:[T2]	[I1]	(-inf, 1]
		snellTest3 = new Snell(0,45,2,-1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 18:[T2]	[I1]	(4.1, inf)
		snellTest3 = new Snell(0,45,2,4.1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 19:[T2]	(4.1, inf)	[I2]
		snellTest3 = new Snell(0,45,4.1,2);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 20:[T2]	[I1]	[I2]
		snellTest3 = new Snell(0,45,2,2);
		assertEquals(45, snellTest3.calculateTheta1(), DELTA);

		//case 21:	[91, inf)	[I1]	(-inf, 1]
		snellTest3 = new Snell(0,91,2,-1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 22: [91, inf)	[I1]	(4.1, inf)
		snellTest3 = new Snell(0,91,2,4.1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 23:	[91, inf)	(4.1, inf)	[I2]
		snellTest3 = new Snell(0,91,4.1,2);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 24:[T1]	[91, inf)	[I1]	[I2]
		snellTest3 = new Snell(0,91,2,2);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 25:(-inf, 0]	[I1]	[I2]
		snellTest3 = new Snell(0,-1,2,2);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 26:[T2]	[I1]	(4.1, inf)
		snellTest3 = new Snell(0,45,2,4.1);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
		//case 27:[91, inf)	(4.1, inf)	[I2]
		snellTest3 = new Snell(0,91,4.1,2);
		assertEquals(-1, snellTest3.calculateTheta1(), DELTA);
		
	}

	@Test
	@DisplayName("Test all cases for calculateTheta2")
	void testCalculateTheta2() {
		
		Snell snellTest4;
		//theta1, theta2, idnex1, index2
		
		//case 1: 	(-inf,0]	(-inf,1]	(-inf,1]
		snellTest4 = new Snell(-1,0,-1,-1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
	
		//case 2: (-inf, 0]	(-inf, 1]	(4.1, inf)
		snellTest4 = new Snell(-1,0,-1,4.1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 3: (-inf, 0]	(4.1, inf)	(-inf, 1]
		snellTest4 = new Snell(-1,0,4.1,-1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 4:(-inf, 0]	(4.1, inf)	(4.1, inf)
		snellTest4 = new Snell(-1,0,4.1,4.1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 5:[T2]	(-inf, 1]	(-inf, 1]
		snellTest4 = new Snell(45,0,-1,-1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 6:[T2]	(-inf, 1]	(4.1, inf)
		snellTest4 = new Snell(45,0,-1,4.1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 7:[T2]	(4.1, inf)	(-inf, 1]
		snellTest4 = new Snell(45,0,4.1,-1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 8:[T2]	(4.1, inf)	(4.1, inf)
		snellTest4 = new Snell(45,0,4.1,4.1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 9: [91, inf)	(-inf, 1]	(-inf, 1]
		snellTest4 = new Snell(91,0,-1,-1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 10:[91, inf)	(-inf, 1]	(4.1, inf)
		snellTest4 = new Snell(91,0,-1,4.1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 11:[91, inf)	(4.1, inf)	(-inf, 1]
		snellTest4 = new Snell(91,0,4.1,-1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 12:[91, inf)	(4.1, inf)	(4.1, inf)
		snellTest4 = new Snell(91,0,4.1,4.1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 13:(-inf, 0]	[I1]	(-inf, 1]
		snellTest4 = new Snell(-1,0,2,-1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 14:(-inf, 0]	[I1]	(4.1, inf)
		snellTest4 = new Snell(-1,0,2,4.1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 15:	(-inf, 0]	(4.1, inf)	[I2]
		snellTest4= new Snell(-1,0,4.1,2);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 16:(-inf, 0]	[I1]	[I2]
		snellTest4 = new Snell(-1,0,2,2);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 17:[T2]	[I1]	(-inf, 1]
		snellTest4 = new Snell(45,0,2,-1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 18:[T2]	[I1]	(4.1, inf)
		snellTest4 = new Snell(45,0,2,4.1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 19:[T2]	(4.1, inf)	[I2]
		snellTest4 = new Snell(45,0,4.1,2);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 20:[T2]	[I1]	[I2]
		snellTest4 = new Snell(45,0,2,2);
		assertEquals(45, snellTest4.calculateTheta2(), DELTA);

		//case 21:	[91, inf)	[I1]	(-inf, 1]
		snellTest4 = new Snell(91,0,2,-1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 22: [91, inf)	[I1]	(4.1, inf)
		snellTest4 = new Snell(91,0,2,4.1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 23:	[91, inf)	(4.1, inf)	[I2]
		snellTest4 = new Snell(91,0,4.1,2);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 24:[91, inf)	[I1]	[I2]
		snellTest4 = new Snell(91,0,2,2);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 25:(-inf, 0]	[I1]	[I2]
		snellTest4 = new Snell(-1,0,2,2);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 26:[T2]	[I1]	(4.1, inf)
		snellTest4 = new Snell(45,0,2,4.1);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
		//case 27:[91, inf)	(4.1, inf)	[I2]
		snellTest4 = new Snell(91,0,4.1,2);
		assertEquals(-1, snellTest4.calculateTheta2(), DELTA);
		
	}
	
}
