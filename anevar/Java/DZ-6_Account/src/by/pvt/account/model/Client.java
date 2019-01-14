package by.pvt.account.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private List<Account> accounts = new ArrayList<>();
	private String name;
	
	public Client(String name) {
		super();
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void addAccount(Account newAccount) {
		newAccount.setClient(this);
		accounts.add(newAccount);
	}

	public String getName() {
		return name;
	}
	
	public void turnBlocked (int accountId) {
		for (Account account : accounts) {
			if(account.getAccountId()==accountId && account.isBlocked()==false){
				account.setBlocked(true);
			}else if(account.getAccountId()==accountId && account.isBlocked()==true){
				account.setBlocked(false);
			}
		}
	}
	
	public void searchAccount (int accountId) {
		for (Account account : accounts) {
			if(account.getAccountId()==accountId){
				System.out.println("Счет номер: "+account.getAccountId()+" Клиент: "+account.getClient().getName()+" Блокировка: "+account.isBlocked());
			}			
		}
	
	
	} 
	
	public void sortAccounts() {
		ComparatorAccount comparator = new ComparatorAccount();
		accounts.sort(comparator);
		
		}	
	
	public void summ() {
		int summ =0;
		for (Account account : accounts) {
			summ+=account.getAmount();
		}
		System.out.println("Общая сумма счетов: "+summ);
	}
	
	public void summMinus() {
		int summ =0;
		for (Account account : accounts) {
			if (account.getAmount()<0) {
				summ+=account.getAmount();
			}		
		}
		System.out.println("Общая сумма минусовых счетов: "+summ);
	}
	
	public void summPlus() {
		int summ =0;
		for (Account account : accounts) {
			if (account.getAmount()>=0) {
				summ+=account.getAmount();
			}		
		}
		System.out.println("Общая сумма плюсовых счетов: "+summ);
	}
	
}	


