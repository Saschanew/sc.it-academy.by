package by.pvt.account.view;

import by.pvt.account.model.Account;
import by.pvt.account.model.Client;

public class Main {

	public static void main(String[] args) {
		//  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. 
		// Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, 
		// имеющим положительный и отрицательный балансы отдельно. 
		
		Client client = new Client("Vasja");
		
		client.addAccount(new Account(111, 500, client));
		client.addAccount(new Account(112, -300, client));
		client.addAccount(new Account(114, 800, client));
		client.addAccount(new Account(113, -200, client));
		client.addAccount(new Account(115, 100, client));
		
		client.turnBlocked(112);
		client.sortAccounts();
		client.searchAccount(114);
		client.summ();
		client.summMinus();
		client.summPlus();

	}

}
