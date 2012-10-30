
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

		Counter count = new Counter();

		first = count.getValue();

		assertEquals("Wrong Answer!",expectedFirst, first);
	}
}
