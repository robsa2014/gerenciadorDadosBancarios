package entities;

public class BussinessAccount extends Account {

  private double loanlimit;
  
  public BussinessAccount () {
	super();
}

public BussinessAccount(Integer number, String holder, Double balance, double loanlimit) {
	super(number, holder, balance);
	this.loanlimit = loanlimit;
}

public double getLoanlimit() {
	return loanlimit;
}

public void setLoanlimit(double loanlimit) {
	this.loanlimit = loanlimit;
}
  public void loan(double amount) {
	  if (amount <= loanlimit)
	  balance += amount -10.0;
}
  @ Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
}
}