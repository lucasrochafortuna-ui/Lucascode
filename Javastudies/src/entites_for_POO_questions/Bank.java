package entites_for_POO_questions;

public class Bank {
	private String name;
	private int account;
	private double deposit;
	
	public Bank() {
	}
	public Bank(String name, int account) {
		this.name = name;
		this.account = account;
	}
	public Bank(String name, int account, double initialDeposit) {
		this.name = name;
		this.account = account;
		addDeposit(initialDeposit);
	}
	public String loadAccount(String name, int account, double deposit) {
		return "Account data: \nAccount " + this.account + ", Holder: " + this.name + ", Balance: $ " + String.format("%.2f%n", this.deposit);
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccount() {
		return this.account;
	}
	public double GetDeposit() {
		return this.deposit;
	}
	public double addDeposit(double deposit) {
		return this.deposit += deposit;
	}
	public double removeDeposit(double deposit) {
		return this.deposit -= (deposit + 5);
	}
	public String toString() {
		return "Updated data: \nAccount " + this.account + ", Holder: " + this.name + ", Balance: $ " + String.format("%.2f%n", this.deposit);
	}
	
}
