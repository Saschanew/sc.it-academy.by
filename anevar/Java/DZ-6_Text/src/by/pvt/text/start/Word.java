package by.pvt.text.start;

public class Word {
	
	 // Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить 
	// текст, вывести на консоль текст, заголовок текста. 
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
	
	

}
