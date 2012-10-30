/**
 * 
 */
package actualCode;

/**
 * @author oded
 *
 */
public class CounterComplex {

	private Integer cnt1;
	private Integer cnt2;

	public CounterComplex() {
		super();
		this.cnt1 = 1;
		this.cnt2 = 2;
	}

	/* (non-Javadoc)
	 * @see tests.Ct#getValue()
	 */
	public int getValue(int i) {
		if( i == 1){
			return cnt1++;
		} else if( i == 2 ){
			return cnt2++;			
		}
		return -1;
	}


}
