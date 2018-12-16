package by.pvt.klass.start.Task8;

import java.util.List;

public class Main_Customer {

	public static void main(String[] args) {
		
		// Найти и вывести:  a) список покупателей в алфавитном порядке;  b) список покупателей, у которых номер 
		// кредитной карточки находится в заданном интервале
		
		Customer customer1 = new Customer(1, "Willis", "Brus", "Petrovich", "Smolevichi", 12536, 1234435);
		Customer customer2 = new Customer(2, "Obama", "Barak", "Olegovich", "Malibu", 56784, 6787483);
		Customer customer3 = new Customer(3, "Klinton", "Borja", "Sanych", "Kishinev", 76845, 7686789);
		Customer customer4 = new Customer(4, "Merkel", "Anzhela", "Viktorovna", "Berlin", 54678, 9078567);
		Customer customer5 = new Customer(5, "Diesel", "Vova", "Vladimirovich", "Moskva", 65768, 2350798);
		Customer customer6 = new Customer(6, "Bush", "Zhorik", "Vartanovich", "Las Vegas", 87943, 9067437);
		
		Customers_List list = new Customers_List();
		
		list.getList().add(customer1);
		list.getList().add(customer2);
		list.getList().add(customer3);
		list.getList().add(customer4);
		list.getList().add(customer5);
		list.getList().add(customer6);
		
		List<Customer> listCustomerSortedByName = list.sortByAwnerName();
		System.out.println("Сортировка по фамилии: ");
		for (Customer customer : listCustomerSortedByName) {
			System.out.println(customer.toString());
		}
					
		List<Customer> listCustomerSortedByCardNumber = list.sortByCardNumber(60000, 80000);
		System.out.println("Сортировка по кредитной карточке: ");
		for (Customer customer : listCustomerSortedByCardNumber) {
			System.out.println(customer.toString());
		}

	}

}
