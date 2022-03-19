package week5.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		super.deposit();
		System.out.println("Child Deposit Method");
	}
	public static void main(String[] args) {
		AxisBank objAbank = new AxisBank();
		objAbank.deposit();
	}

}
