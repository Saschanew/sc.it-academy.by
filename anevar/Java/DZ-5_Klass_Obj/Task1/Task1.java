package by.pvt.klass.start.Task1;

public class Task1 {
	
	// Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения 
	// этих переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, 
	// который находит наибольшее значение из этих двух переменных. 
	
	private int value1; private int value2;
	
	public Task1(int value1, int value) {
		this.value1=value1;
		this.value2=value;
	}
	
	
	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value1;
		result = prime * result + value2;
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
		Task1 other = (Task1) obj;
		if (value1 != other.value1)
			return false;
		if (value2 != other.value2)
			return false;
		return true;
	}


	public void printValue1(){
		System.out.println(value1);		
	}
	
	public void printValue2 (){
		System.out.println(value2);		
	}

	public int summ(){
		int summ = value1+value2;
		return summ;
	}

	public int max(){
		int max;
		if (value1>=value2) {
			 max = value1;
		}else{
			max= value2;
		}
		return max;
	}
	
}
