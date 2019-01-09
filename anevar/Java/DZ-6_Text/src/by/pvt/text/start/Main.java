package by.pvt.text.start;

public class Main {

	public static void main(String[] args) {
		 // Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить 
		// текст, вывести на консоль текст, заголовок текста. 
		
		Text text = new Text();
		
		text.setHeader("Letter to friend.");
		
		text.addSentence("Hello my Friend.");
		text.addSentence("I am glad to see you again!");
		
		text.toString();

	}

}
