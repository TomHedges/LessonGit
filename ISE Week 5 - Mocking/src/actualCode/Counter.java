/**
 * 
 */
package actualCode;

/**
 * @author thedge01
 *
 */
public class Counter {
	
	private Integer loopCount;
	
	public Counter() {
		super();
		this.loopCount= 1;
	}
	
	public Integer getValue() {
		return loopCount++;
	}
}
