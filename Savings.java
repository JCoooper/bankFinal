
public class Savings extends BAccount {
	private double lowestBal;
	private double interest;
	private double intmoney;

	public Savings(double moneys, double timePass, int accT, double lowBal, double inter) {
		super(moneys, timePass, accT);
		lowestBal = lowBal;
	}

	public double getLowestBal2() {

		return lowestBal;
	}

	public double getIntMoney() {
		return intmoney;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterBal(double IB) {
		lowestBal = IB;
	}
}
