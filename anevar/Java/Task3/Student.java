package by.pvt.klass.start.Task3;

import java.util.Arrays;

public class Student {
	
	// Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, 
	// успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. 
	// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10. 
	
	private String name; private int numberGroup; private int[] ranking;
	
	public Student(String name, int numberGroup) {
		this.name = name;
		this.numberGroup = numberGroup;
		ranking= new int[5];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberGroup() {
		return numberGroup;
	}

	public void setNumberGroup(int numberGroup) {
		this.numberGroup = numberGroup;
	}

	public int[] getRanking() {
		return ranking;
	}

	public void setRanking(int[] ranking) {
		this.ranking = ranking;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberGroup;
		result = prime * result + Arrays.hashCode(ranking);
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberGroup != other.numberGroup)
			return false;
		if (!Arrays.equals(ranking, other.ranking))
			return false;
		return true;
	}
		
	
}
