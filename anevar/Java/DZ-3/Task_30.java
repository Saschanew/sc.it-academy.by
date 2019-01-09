package by.pvt.dz3.start;

public class Task_30 {

	public static void main(String[] args) {
		// Написать программу, переводящую римские цифры в арабские. 
		
		String rimskajaZifra;
		int arabskajaZifra;
		
		System.out.println("Введите римскую цифру");
		
		rimskajaZifra = Helper.readString();
	 
		arabskajaZifra=letterToNumber(rimskajaZifra);
		System.out.println("Римской "+rimskajaZifra+" соответствует "+arabskajaZifra);

	}

	private static int letterToNumber(String letter)
	{
 
		switch (letter) {
			case "I":  return 1;
			case "II":  return 2;
			case "III":  return 3;
			case "IV":  return 4;
			case "V":  return 5;
			case "VI":  return 6;
			case "VII":  return 7;
			case "VIII":  return 8;
			case "IX":  return 9;
			
			case "X":  return 10;
			case "L":  return 50;
			case "C":  return 100;
			case "D":  return 500;
			case "M":  return 1000;
			
		}
		return 0;
	}
}
