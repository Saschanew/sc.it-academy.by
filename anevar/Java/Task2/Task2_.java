package by.pvt.klass.start.Task2;

public class Task2_ {
	
	// Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
	// Добавьте конструктор, инициализирующий члены класса по умолчанию. 
	// Добавьте set- и get- методы для полей экземпляра класса. 
	
	private String name; private int value;

	public Task2_(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public Task2_() {
		name = "First";
		value = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + value;
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
		Task2_ other = (Task2_) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
	
	

}
