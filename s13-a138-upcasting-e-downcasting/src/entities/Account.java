package entities;

public class Account {
	
	protected Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

    public void withdraw(double amount) {
    	balance -= amount;
    }
    
    public void deposit(double amount) {
    	balance += amount;
    }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Number: ");
		sb.append(number);
        sb.append("\nHolder: ");
        sb.append(holder);
        sb.append("\nbalance: ");
		sb.append(String.format("%.2f", balance));
		
		return sb.toString();
	}
	
    

}
