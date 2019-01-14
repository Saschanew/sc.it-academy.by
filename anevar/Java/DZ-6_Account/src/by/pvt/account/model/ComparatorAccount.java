package by.pvt.account.model;

import java.util.Comparator;

public class ComparatorAccount implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		
		return o1.getAccountId()-o2.getAccountId();
	}



}
