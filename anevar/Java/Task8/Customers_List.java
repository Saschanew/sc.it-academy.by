package by.pvt.klass.start.Task8;

import java.util.ArrayList;
import java.util.List;

public class Customers_List {

	// Найти и вывести:  a) список покупателей в алфавитном порядке;  b) список покупателей, у которых номер 
	// кредитной карточки находится в заданном интервале 
	
	List<Customer> list = new ArrayList<>();

	public List<Customer> getList() {
		return list;
	}
	public void setList(List<Customer> list) {
		this.list = list;
	}
	
	public List<Customer> sortByAwnerName (){
		List<Customer> newList = new ArrayList<>();	
		newList=list;
		for (int i = 0; i < newList.size(); i++) {
			for (int j = 0; j < newList.size() - i - 1; j++) {
				if (newList.get(j).getFamilyname().compareTo(newList.get(j+1).getFamilyname()) > 0) {
					Customer c = newList.get(j);
					newList.set(j, newList.get(j+1));
					newList.set(j+1, c);
				}
			}
		}
		
		return newList;
	}
			
	public List<Customer> sortByCardNumber(int start, int end){
		List<Customer> newList = new ArrayList<>();
		
		for (Customer customer : list) {
			if (customer.getCardNumber()>=start && customer.getCardNumber()<=end) {
				newList.add(customer);
			}
		}
		
		return newList;
		
	}
	
}
