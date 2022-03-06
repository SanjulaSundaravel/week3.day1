package Assignment.week2;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Amount deposited - Child");
	}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();
	}

}
