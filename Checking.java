
public class Checking extends BAccount {
	private int with;

	public Checking(double moneys, double timePass, int accT, int withdraw) {
		super(moneys, timePass, accT);
		with = withdraw;
	}

	public int getwith() {
		return with;
	}

	public void setWit(int set) {
		with = 0;

	}
}
