package by.pvt.account.model;

public class Account {
	
	private int accountId; private double amount;
	private boolean isBlocked=false;
	private Client client;
	
	public Account(int accountId, double amount, Client client) {
		super();
		this.accountId = accountId;
		this.amount = amount;
		this.client = client;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	

}
