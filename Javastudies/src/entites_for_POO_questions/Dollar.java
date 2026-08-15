package entites_for_POO_questions;

public class Dollar {
	public static double CurrencyConverter(double dollar, double pay) {
		return (dollar + (dollar / 100 * 6)) * pay;
	}
}
