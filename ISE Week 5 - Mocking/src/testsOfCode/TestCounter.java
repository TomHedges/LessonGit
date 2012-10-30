
package testsOfCode;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import actualCode.Counter;
import actualCode.CounterNoActivity;

/**
 * @author thedge01
 *
 */

public class TestCounter {

	@Test
	public void testA() {
		Integer first;
		Integer expectedFirst=1;

		Counter countTestA = new Counter();

		first = countTestA.getValue();

		assertEquals("Wrong Answer from non-mock test!",expectedFirst, first);
	}

	@Test
	public void testAMock() {
		Integer first, mockedFirst;
		//Integer expectedFirst = 1;

		Counter countTestAMock = new Counter();

		Counter mockedCounter = mock(Counter.class);
		when(mockedCounter.getValue()).thenReturn(1);

		first = countTestAMock.getValue();
		mockedFirst= mockedCounter.getValue();

		assertEquals("Wrong Answer from MOCK test A !",first , mockedFirst);
	}

	@Test
	public void testBMock() {
		Integer first, mockedFirst;
		//Integer expectedFirst=1;
		
		Counter count = new Counter();
		
		Counter mockedCounter= mock(Counter.class);
		when(mockedCounter.getValue()).thenReturn(1).thenReturn(2).thenReturn(3).thenReturn(5);
		
		first = count.getValue();
		mockedFirst= mockedCounter.getValue();
		
		assertEquals("Wrong Answer from MOCK test B - run 1 !",first , mockedFirst);
		
		first = count.getValue();
		mockedFirst= mockedCounter.getValue();
		
		assertEquals("Wrong Answer from MOCK test B - run 2 !",first , mockedFirst);
		
		first = count.getValue();
		mockedFirst= mockedCounter.getValue();
		
		assertEquals("Wrong Answer from MOCK test B - run 3 !",first , mockedFirst);

		//NB - skipping '4' by running the actual counter twice.
		first = count.getValue();
		first = count.getValue();
		mockedFirst= mockedCounter.getValue();
		
		verify(mockedCounter,atLeast(4)).getValue();
		
		assertEquals("Wrong Answer from MOCK test B - run 4 !",first , mockedFirst);
	}

	@Test
	public void testCMock() {
		Integer first, mockedFirst;
		//Integer expectedFirst=1;
		
		CounterNoActivity count = new CounterNoActivity();
		
		CounterNoActivity mockedCounter= mock(CounterNoActivity.class);
		when(mockedCounter.getValue()).thenReturn(1).thenReturn(2).thenReturn(3).thenReturn(5);
		
		first = count.getValue();
		mockedFirst= mockedCounter.getValue();
		
		assertEquals("Wrong Answer from MOCK test C - run 1 !",first , mockedFirst);
		
	}

	@Test
	public void testDMock() {
		Integer first, mockedFirst;
		//Integer expectedFirst = 1;

		Counter countTestAMock = new Counter();

		Counter mockedCounter = mock(Counter.class);
		when(mockedCounter.getValue()).thenReturn(1).thenReturn(2);

		first = countTestAMock.getValue();
		mockedFirst= mockedCounter.getValue();

		assertEquals("Wrong Answer from MOCK test D - run 1 !",first , mockedFirst);


		first = countTestAMock.getValue();
		mockedFirst= mockedCounter.getValue();

		assertEquals("Wrong Answer from MOCK test D - run 2 !",first , mockedFirst);
	}

	@Test
	public void testEMockaAtLeastTimes() {
		Integer first, mockedFirst;
		//Integer expectedFirst = 1;

		Counter countTestAMock = new Counter();

		Counter mockedCounter = mock(Counter.class);
		when(mockedCounter.getValue()).thenReturn(1).thenReturn(2);

		first = countTestAMock.getValue();
		mockedFirst= mockedCounter.getValue();

		assertEquals("Wrong Answer from MOCK test D - run 1 !",first , mockedFirst);


		first = countTestAMock.getValue();
		mockedFirst= mockedCounter.getValue();

		assertEquals("Wrong Answer from MOCK test D - run 2 !",first , mockedFirst);

		verify(mockedCounter,atLeast(2)).getValue();
		verify(mockedCounter,times(2)).getValue();
	}

	@Test
	public void testEMockaAtMostAtLeastOnce() {
		Integer first, mockedFirst;
		//Integer expectedFirst = 1;

		Counter countTestAMock = new Counter();

		Counter mockedCounter = mock(Counter.class);
		when(mockedCounter.getValue()).thenReturn(1).thenReturn(2);

		first = countTestAMock.getValue();
		mockedFirst= mockedCounter.getValue();
		assertEquals("Wrong Answer from MOCK test D - run 1 !",first , mockedFirst);

		first = countTestAMock.getValue();
		mockedFirst= mockedCounter.getValue();
		assertEquals("Wrong Answer from MOCK test D - run 2 !",first , mockedFirst);
	
		mockedFirst= mockedCounter.getValue();
		assertEquals("Wrong Answer from MOCK test D - run 3 !",first , mockedFirst);

		verify(mockedCounter,atMost(3)).getValue();
		verify(mockedCounter,atLeastOnce()).getValue();
	}

	@Test
	public void testEMockaAtL() {
		Integer first, mockedFirst;
		//Integer expectedFirst = 1;

		Counter countTestAMock = new Counter();

		Counter mockedCounter = mock(Counter.class);
		when(mockedCounter.getValue()).thenReturn(1).thenReturn(2);
	
		verify(mockedCounter,never()).getValue();
	}
}
