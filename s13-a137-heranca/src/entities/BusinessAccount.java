package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance -= amount - 10.0;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Number: ");
		sb.append(number);
        sb.append("\nHolder: ");
        sb.append(getHolder());
        sb.append("\nbalance: ");
		sb.append(String.format("%.2f", balance));
		sb.append("\nLoan limit: ");
		sb.append(String.format("%.2f", loanLimit));
		
		return sb.toString();
	}
	
}
