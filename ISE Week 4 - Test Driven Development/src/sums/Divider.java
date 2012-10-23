/**
 * 
 */
package sums;

/**
 * @author thedge01
 *
 */
public class Divider implements MathematicalOperation {

	/* (non-Javadoc)
	 * @see sums.MathematicalOperation#operations(int, int)
	 */
	@Override
	public int operations(int input1, int input2) {
		// TODO Auto-generated method stub
		return input1/input2;
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
