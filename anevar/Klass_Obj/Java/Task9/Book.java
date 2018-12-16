package by.pvt.klass.start.Task9;

import java.util.Arrays;

public class Book {
	
	// Создать класс Book, спецификация которого приведена ниже. 
	// Определить конструкторы, set- и get- методы и метод  toString(). 
	// Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
	// Задать критерии выбора данных и вывести эти данные на консоль.  
	 
	// Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, 
	// тип переплета.  Найти и вывести:  a) список книг заданного автора;  b) список книг, 
	// выпущенных заданным издательством;  c) список книг, выпущенных после заданного года. 
	
	private int id; private String name; private String[] autors; private String agency; private int year;
	private int numberPages; private int price; private String typ;



	public Book(int id, String name, String[] autors, String agency, int year, int numberPages, int price, String typ) {
		super();
		this.id = id;
		this.name = name;
		this.autors = autors;
		this.agency = agency;
		this.year = year;
		this.numberPages = numberPages;
		this.price = price;
		this.typ = typ;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String[] getAutors() {
		return autors;
	}
	public void setAutors(String[] autors) {
		this.autors = autors;
	}

	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberPages() {
		return numberPages;
	}
	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agency == null) ? 0 : agency.hashCode());
		result = prime * result + Arrays.hashCode(autors);
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberPages;
		result = prime * result + price;
		result = prime * result + ((typ == null) ? 0 : typ.hashCode());
		result = prime * result + year;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (agency == null) {
			if (other.agency != null)
				return false;
		} else if (!agency.equals(other.agency))
			return false;
		if (!Arrays.equals(autors, other.autors))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberPages != other.numberPages)
			return false;
		if (price != other.price)
			return false;
		if (typ == null) {
			if (other.typ != null)
				return false;
		} else if (!typ.equals(other.typ))
			return false;
		if (year != other.year)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Book [id = " + id + ", name = " + name + ", autors = " + Arrays.toString(autors) + ", agency = " + agency
				+ ", year = " + year + ", numberPages = " + numberPages + ", price = " + price + ", typ = " + typ + "]";
	}



}
