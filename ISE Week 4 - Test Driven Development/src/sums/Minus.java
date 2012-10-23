/**
 * 
 */
package sums;

/**
 * @author thedge01
 *
 */
public class Minus implements MathematicalOperation {

	/* (non-Javadoc)
	 * @see sums.MathematicalOperation#operationAdd(int, int)
	 */
	@Override
	public int operations(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public void throwIllegalArgumentException() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void throwIllegalArithmeticException() {
		// TODO Auto-generated method stub
		
	}

}
