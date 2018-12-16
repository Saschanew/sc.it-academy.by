package by.pvt.klass.start.Task9;

public class Main_Book {

	public static void main(String[] args) {
		// Найти и вывести:  a) список книг заданного автора;  b) список книг, 
		// выпущенных заданным издательством;  c) список книг, выпущенных после заданного года.
		
	Book book1 = new Book(1, "Java", new String[] {"Ekkel", "Morozov"}, "Beldruk", 1962, 557, 65, "hard");
	Book book2 = new Book(2, "C++", new String[] {"Klinton", "Ivanov"}, "Mosdruk", 1982, 123, 156, "light");
	Book book3 = new Book(3, ".Net", new String[] {"Ekkel"}, "Beldruk", 2001, 453, 76, "medium");
	Book book4 = new Book(4, "Python", new String[] {"Petrov", "Morozov"}, "Strelka", 1995, 654, 177, "hard");
	Book book5 = new Book(5, "Ruby", new String[] {"Sidorov", "Morozov"}, "Beldruk", 2008, 557, 125, "light");
	Book book6 = new Book(6, "Prolog", new String[] {"Ekkel", "Petrov"}, "Belлф", 2011, 234, 65, "hard");
	
	Book_List list = new Book_List();
	
	list.getList().add(book1);
	list.getList().add(book2);
	list.getList().add(book3);
	list.getList().add(book4);
	list.getList().add(book5);
	list.getList().add(book6);
	
	System.out.println("Сортировка по автору: ");
	list.searchByAutor("Ekkel");
	System.out.println("Сортировка по издательству: ");
	list.searchByAgency("Beldruk");
	System.out.println("Список книг, выпущенных после заданного года: ");
	list.searchByYear(2000);

	}

}
