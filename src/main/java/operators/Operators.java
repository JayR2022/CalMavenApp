package operators;

//import java.util.Optional;

public class Operators {

	public Operators() {
		// default constructors
	}

	public double add(double num1, double num2) {
		return num1 + num2;
	}

	public double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public double subtract(double num1, double num2) {
		return num1 - num2;
	}

	public double division(double dividend, double divisor){
		
		try {
			return dividend/divisor;			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}
	
//	public Optional<Double> division(double dividend, double divisor) {
//
//		try {
//			if (divisor < dividend) {
//				Double dub;
//				dub = Optional.of(dividend / divisor).orElseThrow(ArithmeticException::new);
//				return Optional.ofNullable(dub);
//			} else {
//				System.out.println("Division cannot be performed");
//				return Optional.empty();
//			}
//
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//
//		}
//
//		return Optional.empty();

}
