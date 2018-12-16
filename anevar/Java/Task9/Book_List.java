package by.pvt.klass.start.Task9;

import java.util.ArrayList;
import java.util.List;

public class Book_List {
	
	// Найти и вывести:  a) список книг заданного автора;  b) список книг, 
	// выпущенных заданным издательством;  c) список книг, выпущенных после заданного года.
	
	List<Book> list = new ArrayList<>();

	public List<Book> getList() {
		return list;
	}
	public void setList(List<Book> list) {
		this.list = list;
	}

	public void searchByAutor (String autor){
		for (Book book : list) {
			String[] autors = book.getAutors();
			for (String string : autors) {
				if (string.equals(autor)) {
					System.out.println(book.toString());
				}
			}
		}
	}
	
	public void searchByAgency (String agency){
		for (Book book : list) {
			String string = book.getAgency();
				if (string.equals(agency)) {
					System.out.println(book.toString());
				}			
		}
	}
	
	public void searchByYear (int year){
		for (Book book : list) {
			int start = book.getYear();
				if (start>year) {
					System.out.println(book.toString());
				}			
		}
	}
	
}
