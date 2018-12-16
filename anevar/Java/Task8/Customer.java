package by.pvt.klass.start.Task8;

public class Customer {
	
	// Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, 
	// set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, 
	// с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.  
	 
	// Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.  
	

	private int id; private String familyname; private String name; private String fathername;
	private String adress; private int cardNumber; private int accountNumber;


	public Customer(int id, String familyname, String name, String fathername, String adress, int cardNumber,
			int accountNumber) {
		this.id = id;
		this.familyname = familyname;
		this.name = name;
		this.fathername = fathername;
		this.adress = adress;
		this.cardNumber = cardNumber;
		this.accountNumber = accountNumber;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getFamilyname() {
		return familyname;
	}
	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}


	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}


	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}


	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	

	@Override
	public String toString() {
		return "Customer [id = " + id + ", familyname = " + familyname + ", name = " + name + ", fathername = " + fathername
				+ ", adress = " + adress + ", cardNumber = " + cardNumber + ", accountNumber = " + accountNumber + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + cardNumber;
		result = prime * result + ((familyname == null) ? 0 : familyname.hashCode());
		result = prime * result + ((fathername == null) ? 0 : fathername.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Customer other = (Customer) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (cardNumber != other.cardNumber)
			return false;
		if (familyname == null) {
			if (other.familyname != null)
				return false;
		} else if (!familyname.equals(other.familyname))
			return false;
		if (fathername == null) {
			if (other.fathername != null)
				return false;
		} else if (!fathername.equals(other.fathername))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
