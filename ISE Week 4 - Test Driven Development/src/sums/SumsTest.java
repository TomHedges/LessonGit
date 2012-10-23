/**
 * 
 */
package sums;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author thedge01
 *
 */
public class SumsTest {
	
	private static int input1;
	private static int input2;

	@BeforeClass
	static public void beforeClass(){
		input1 = 2;
		input2 = 3;
	}

	@Before
	public void before(){
		input1 = input1+7;
		input2 = input2+1;
	}

	// Comment @after assertion to stop undoing the @before - means @before runs before EVERY TEST! 
	@After
	public void after(){
		input1 = input1-7;
		input2 = input2-1;
	}


	@Test
	public void This_tests_using_fields_and_static_variables() {

		int expected = 5;
		int output;

		MathematicalOperation sum = new Minus();

		output = sum.operations(input1,input2);

		assertEquals("FAILING - UNEQUAL",expected,output);
	}

	@Test
	public void This_tests_adding() {

		int input1 = 3;
		int input2 = 42;
		int expected = 45;
		int output;

		MathematicalOperation sum= new Adder();

		output = sum.operations(input1,input2);

		assertEquals("FAILING - UNEQUAL",expected,output);
	}


	@Test
	public void This_tests_minusing() {

		int input1 = 7;
		int input2 = 2;
		int expected = 5;
		int output;

		MathematicalOperation sum = new Minus();

		output = sum.operations(input1,input2);

		assertEquals("FAILING - UNEQUAL",expected,output);
	}


	//made to pass so that i can focus on other issue!
	//shows that when first assert fails, the test STOPS - no further code executed
	@Test
	public void This_tests_deliberate_fail() {

		int input1 = 7;
		int input2 = 2;
		int expected = 5;
		int output;

		MathematicalOperation sum = new Minus();

		output = sum.operations(input1,input2);

		assertEquals("FAILING - UNEQUAL",expected,output); //replace 'output' with 4
		assertEquals("FAILING - UNEQUAL",expected,output); //replace 'output' with 19
	}

	@Test
	public void This_tests_using_fields_and_static_variables_last() {

		int expected = 5;
		int output;

		MathematicalOperation sum = new Minus();

		output = sum.operations(input1,input2);

		assertEquals("FAILING - UNEQUAL",expected,output);
	}

	@Test(timeout=500)
	public void This_tests_timeout() {

		int input1 = 5;

		while (input1<10){
			input1++;
		}

		assertEquals("FAILING - UNEQUAL",input1,10);
	}

	//EXCEPTION TESTING with credit to Jakob Jenkov @ http://tutorials.jenkov.com/java-unit-testing/exceptions.html
	@Test
	public void This_tests_exception_trycatch_method() {

		int input1 = 3;
		int input2 = 0; //NB - this fails when there is an 'ArithmeticException'
		int output;
		
		MathematicalOperation sum = new Divider();
		
		try {
			sum.throwIllegalArgumentException();
			output = sum.operations(input1,input2);
		} catch (Exception e) {
	        fail("FAIL - error in sum");
		}
	}

	//EXCEPTION TESTING with credit to Jakob Jenkov @ http://tutorials.jenkov.com/java-unit-testing/exceptions.html
	@Test(expected = ArithmeticException.class)
	public void This_tests_exception_not_trycatch() {

		int input1 = 3;
		int input2 = 1; //NB - this ONLY fails when there is NO 'ArithmeticException'
		int output;
		
		MathematicalOperation sum = new Divider();

		sum.throwIllegalArithmeticException();
		output = sum.operations(input1,input2);
	}
	
}
