package by.pvt.dz3.start;

public class Task26 {

	public static void main(String[] args) {
		//  Вывести на экран соответствий между символами и их численными обозначениями в 
		// памяти компьютера (Таблицу ASCII). 
		
		int [] str = new int [255]; 
		
		for (int i = 0; i < str.length; i++) {
			str[i]=i+1;
		}
		
		for (int i = 0; i < str.length; i++) {
		   char a = (char) str[i];
		   System.out.println(a);
		}
		
		
	}

}
