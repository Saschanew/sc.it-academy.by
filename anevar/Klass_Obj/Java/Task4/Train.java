package by.pvt.klass.start.Task4;

public class Train {
	// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
	// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива 
	// по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
	// Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения 
	// должны быть упорядочены по времени отправления. 

	private String destination; private int numberTrain; private int hours; private int minuts;

	public Train(String destination, int numberTrain, int hours, int minuts) {
		this.destination = destination;
		this.numberTrain = numberTrain;
		this.hours = hours;
		this.minuts = minuts;
	}
	
	@Override
	public String toString() {
		System.out.println("Пункт назначения: "+destination+" Номер поезда: "+numberTrain+" Время отправления: "+hours+
				":"+minuts);
		return super.toString();
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberTrain() {
		return numberTrain;
	}

	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinuts() {
		return minuts;
	}

	public void setMinuts(int minuts) {
		this.minuts = minuts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + hours;
		result = prime * result + minuts;
		result = prime * result + numberTrain;
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
		Train other = (Train) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (hours != other.hours)
			return false;
		if (minuts != other.minuts)
			return false;
		if (numberTrain != other.numberTrain)
			return false;
		return true;
	}
	
	
	
}
