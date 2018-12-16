package by.pvt.klass.start.Task5;

public class Counter {
	
	// Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать 
	// свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями 
	// по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, 
	// и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса. 
	private int counter;
	
	public Counter() {
		this.counter = 1;
	}
	
	public Counter(int start) {
		counter = start;
    }	

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	@Override
	public String toString() {
		return "[counter = " + counter + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + counter;
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
		Counter other = (Counter) obj;
		if (counter != other.counter)
			return false;
		return true;
	}
	
	public void countPlus (int plus){
		counter += plus;
	}
	
	public void countMinus (int minus){
		counter -= minus;
	}
	
}