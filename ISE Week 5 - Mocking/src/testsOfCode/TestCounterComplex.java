/**
 * 
 */
package testsOfCode;

import static org.junit.Assert.*;

import org.junit.Test;

import actualCode.CounterComplex;

import static org.mockito.Mockito.*;


/**
 * @author oded
 *
 */
public class TestCounterComplex {

	@Test
	public void test() {
		
		Integer first,mockedFirst;
		Integer second,mockedSecond;
		
		CounterComplex count = new CounterComplex();
		
		CounterComplex mockedCounter = mock(CounterComplex.class);
		when(mockedCounter.getValue(1)).thenReturn(1).thenReturn(2).thenReturn(3);
		when(mockedCounter.getValue(2)).thenReturn(2).thenReturn(3).thenReturn(4);
		
		first = count.getValue(1);
		second = count.getValue(2);
		mockedFirst = mockedCounter.getValue(1);
		mockedSecond = mockedCounter.getValue(2);
		
		assertEquals("First first wronge Answer !",first , mockedFirst);
		assertEquals("First second Wronge Answer !",second , mockedSecond);
		
		first = count.getValue(1);
		second = count.getValue(2);
		mockedFirst = mockedCounter.getValue(1);
		mockedSecond = mockedCounter.getValue(2);
		
		assertEquals("Second first Answer !",first , mockedFirst);
		assertEquals("Second second Answer !",second , mockedSecond);
		
		first = count.getValue(1);
		second = count.getValue(2);
		mockedFirst = mockedCounter.getValue(1);
		mockedSecond = mockedCounter.getValue(2);
		
		assertEquals("Third first Answer !",first , mockedFirst);
		assertEquals("Third second Answer !",second , mockedSecond);
		
	}

}
