package Java.day17_classObjects_Part2;

public class CapitalOne {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		
		account1.accountHolder="Azat Bayramov";
		account1.accountNumber=123456;
		account1.deposit(1550);
		account1.showBalance();
		account1.withdraw(850);
		account1.showBalance();
		account1.charge(150, "CellPhone");
		account1.showBalance();
		account1.charge(1000, "Car");

	}

}
