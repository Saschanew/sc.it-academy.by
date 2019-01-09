package by.pvt.dz3.start;

import java.util.Scanner;

public class Proverka {

	public static void main(String[] args) {

     @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
     
     String str = sc.next();
     
     chooseInt(str);
     
     System.out.println(chooseInt(str));

	}
	
	public static int chooseInt (String str){
		int index;
		index=str.indexOf(":");
		int hour;
		if (index > 0) {
			str = str.substring(0, index);
		}
		hour=Integer.parseInt(str);
		return hour;
		
	}

}
