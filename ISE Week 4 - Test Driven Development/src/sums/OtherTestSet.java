/**
 * 
 */
package sums;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author thedge01
 *
 */
public class OtherTestSet {

	@Test
	public void This_tests_adding() {
		
		int input1 = 3;
		int input2 = 42;
		int expected = 45;
		int output;
		
		MathematicalOperation classUnderTest = new adder();
		
		output = classUnderTest.operations(input1,input2);
		
		assertEquals("FAILING - UNEQUAL",expected,output);
	}


	@Test
	public void This_tests_minusing() {
		
		int input1 = 7;
		int input2 = 2;
		int expected = 5;
		int output;
		
		MathematicalOperation classUnderTest = new minus();
		
		output = classUnderTest.operations(input1,input2);
		
		assertEquals("FAILING - UNEQUAL",expected,output);
	}

}
