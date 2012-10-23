package sums;

public interface MathematicalOperation {

	public abstract int operations(int input1, int input2);

	public abstract void throwIllegalArgumentException();

	public abstract void throwIllegalArithmeticException();

}