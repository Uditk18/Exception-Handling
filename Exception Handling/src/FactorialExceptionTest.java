import java.util.*;

class InvalidInputException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidInputException(String message) {
		super(message);
	}
}

class FactorialException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FactorialException(String message) {
		super(message);
	}
}

class Factorial {
	int num;

	int getFactorial(int num) throws InvalidInputException, FactorialException {
		int fact = 1;
		this.num = num;
		if (num < 2) {
			throw new InvalidInputException("Number cannot be less than 2");
		}

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		if (fact > Integer.MAX_VALUE) {
			throw new FactorialException("Number cannot greater than maximum value of Integer");

		}

		return fact;

	}
}

public class FactorialExceptionTest {
	public static void main(String[] args) {
		Factorial fact = new Factorial();

		try {
			int ans = fact.getFactorial(3);
			System.out.println("Factorial is : " + ans);
		}

		catch (InvalidInputException e) {
			e.printStackTrace();
		} catch (FactorialException f) {
			f.printStackTrace();
		}
	}
}