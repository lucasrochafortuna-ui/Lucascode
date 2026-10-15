package questions;

public class Entitiesquestion36 {
	private double temperaturaCelsius;
	
	public double getTemperaturaCelsius() {
		return temperaturaCelsius;
	}
	public void setTemperaturaCelsius(double temperaturaCelsius) {
		this.temperaturaCelsius = temperaturaCelsius;
	}
	public double getTemperaturaFahreinheit() {
		return temperaturaCelsius * 1.8 + 32;
	}
	public void setTemperaturaFahreinheit(double temp) {
		this.temperaturaCelsius = (temp - 32) / 1.8;
	}
	public Entitiesquestion36 (double temperaturaCelsius) {
		this.temperaturaCelsius = temperaturaCelsius;
	}
}
