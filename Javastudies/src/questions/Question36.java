package questions;

public class Question36 {

	public static void main(String[] args) {
		// training36
		Entitiesquestion36 temp = new Entitiesquestion36(25.0);
		System.out.println(temp.getTemperaturaCelsius());
		System.out.println(temp.getTemperaturaFahreinheit());
		temp.setTemperaturaFahreinheit(68.0);
		System.out.println(temp.getTemperaturaCelsius());

	}

}
