/**
 * 
 */
package sums;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
		
		MathematicalOperation classUnderTest = new minus();
		
		output = classUnderTest.operations(input1,input2);
		
		assertEquals("FAILING - UNEQUAL",expected,output);
	}

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
	
	//shows that when first assert fails, the test STOPS - no further code executed
	@Test
	public void This_tests_deliberate_fail() {
		
		int input1 = 7;
		int input2 = 2;
		int expected = 5;
		int output;
		
		MathematicalOperation classUnderTest = new minus();
		
		output = classUnderTest.operations(input1,input2);

		assertEquals("FAILING - UNEQUAL",expected,4);
		assertEquals("FAILING - UNEQUAL",expected,19);
	}

	@Test
	public void This_tests_using_fields_and_static_variables_last() {
		
		int expected = 5;
		int output;
		
		MathematicalOperation classUnderTest = new minus();
		
		output = classUnderTest.operations(input1,input2);
		
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
	

	@Test(expected=IllegalArgumentException.class)
	public void This_tests_exception_trycatch() {
		
		int input1 = 3;
		int input2 = 0;
		int expected = 45;
		int output = 0;
		
		MathematicalOperation classUnderTest = new divide();
		
		try {
			output = classUnderTest.operations(input1,input2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals("FAILING - UNEQUAL",expected,output);
	}
}
