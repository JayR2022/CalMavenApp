package operators;


import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Before;
import org.junit.Rule;

import static org.junit.Assert.assertEquals;



public class OperatorsTest {
	
	private Operators testOp;
//	@Rule
//	final ExpectedException exception = ExpectedException.none();
	
	
	@Before
	public void setUp() {
	testOp = new Operators();
	}
	
	@Test
	public void addTest() {
		double testNum1 = 1;
		double testNum2 = 2;
		double expectedOut = 3;
		int maxDelta = 0;
		assertEquals(expectedOut, testOp.add(testNum1, testNum2), maxDelta);
	}
	
	@Test
	public void subtractTest() {
		
		double testNum1 = 2;
		double testNum2 = 2;
		double expectedOut = 0;
		int maxDelta = 0;
		assertEquals(expectedOut, testOp.subtract(testNum1, testNum2), maxDelta);
	}
	
	@Test
	public void multyplyTest() {
		double testNum1 = 2;
		double testNum2 = 2;
		double expectedOut = 4;
		int maxDelta = 0;
		assertEquals(expectedOut, testOp.multiply(testNum1, testNum2), maxDelta);
	}
	
	@Test
	public void divisionTest() {
		double testDividend = 2;
		double testDivisor = 2;
		double expectedOut = 1;
		int maxDelta = 0;
		assertEquals(expectedOut, testOp.division(testDividend, testDivisor), maxDelta);
	}
	
	@Test
	public void divisionArithmeticExceptionTest() {
		
		
		
//		double testDividend = 2;
//		double testDivisor = 2;
//		double expectedOut = 1;
//		int maxDelta = 0;
//		double testDividend = 2;
//		double testDivisor = 0;
//		double expectedOut = 1;
//		int maxDelta = 0;
//		assertEquals(expectedOut, testOp.division(testDividend, testDivisor), maxDelta);
		
//		Exception exception = assertThrows();
			
	}
	
	

}
