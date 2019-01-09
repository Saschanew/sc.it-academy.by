package dz1;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		//  Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба. 

		double dlina=0;
		
		@SuppressWarnings({"resource" })
		Scanner sc = new Scanner(System.in);
				
		if (sc.hasNextDouble()) {
			dlina=sc.nextDouble();	
		 }
		
		double s=Math.pow(dlina, 2);
		double s_full = 6*Math.pow(dlina, 2);
		double value=s*dlina;
		
		System.out.println("площадь грани: "+s+ " площадь полной поверхности: "+s_full + " объем: "+value);
		
	}

}
