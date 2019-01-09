package by.pvt.dz4.start;

import java.util.Random;

public class Task18 {

	public static void main(String[] args) {
		//  «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в ряд ячеек, 
		// в которые надо вставить игральные кубики. Но дверь открывается только в том случае,
		// когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10. 
		// (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу, которая 
		// разгадывает код замка при условии, что два кубика уже вставлены в ячейки.

		int [] zamok = new int[10];
		
		Random randomA1 = new Random();
		int a1 =randomA1.nextInt(6)+1;
		Random randomA2 = new Random();;
		int a2 =randomA2.nextInt(6)+1;	
				
		System.out.println("первые два кубика выпали: "+a1+" и "+a2);
		
		System.out.println("В какие ячейки их вставим от 1 до 10?");
		
		int indexA1 = Helper.readInt()-1;
		int indexA2 = Helper.readInt()-1;
		
		zamok[indexA1]=a1;
		zamok[indexA2]=a2;
		
		if(indexA1%3 == indexA2%3 && a1!=a2) {
			System.out.println("Решений нет");			
		}else if(indexA1%3 == indexA2%3 && a1==a2) {
		
		}
		
		if(indexA1%3 != indexA2%3 && a1+a2>9) {
			System.out.println("Решений нет");			
		}else if(indexA1%3 != indexA2%3 && a1+a2<10) {
			
		}
		
	
	
			
			System.out.println("Полный код замка: ");
			
			for (int i = 0; i < zamok.length; i++) {
				System.out.print(zamok[i]);
			}
		}

}

