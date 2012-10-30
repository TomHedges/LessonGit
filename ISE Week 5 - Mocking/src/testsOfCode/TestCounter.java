
package testsOfCode;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import actualCode.Counter;

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

		assertEquals("Wrong Answer from MOCK!",first , mockedFirst);
	}

	@Test
	public void testBMock() {
		Integer first,mockedFirst;
		//Integer expectedFirst=1;
		
		Counter count = new Counter();
		
		Counter mockedCounter= mock(Counter.class);
		when(mockedCounter.getValue()).thenReturn(1).thenReturn(2);
		
		first = count.getValue();
		mockedFirst= mockedCounter.getValue();
		
		assertEquals("Wrong Answer from MOCK test B - run 1 !",first , mockedFirst);
		
		first = count.getValue();
		mockedFirst= mockedCounter.getValue();
		
		assertEquals("Wrong Answer from MOCK test B - run 2 ",first , mockedFirst);
	}
}
