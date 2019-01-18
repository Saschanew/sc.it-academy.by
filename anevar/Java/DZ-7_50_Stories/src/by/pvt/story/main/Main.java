package by.pvt.story.main;

import by.pvt.story.controller.Controller;
import by.pvt.story.view.input.Helper;

public class Main {

	public static void main(String[] args) {
		// Создать программу, позволяющую обрабатывать информацию о 50 сказках Шахерезады. Реализовать возможность 
		// просмотра информации обо всех сказках, выбора самой интересной сказки и выбора сказок, суммарный объем печатных 
		// знаков в которого не превысит заданный. 
		
		Controller controller = new Controller();
		
		String x=" ";
		
		while (!x.equals("к") || !x.equals("k")) {
			
			System.out.println("Введите что нибудь для выбора команды кроме к (к окончание):");
			
			x=Helper.readString();
			
			if (x.equals("к") || x.equals("k")) {
				System.out.println("Программа закончена.");
				break;
			}			
			
			controller.doAсtion();
			
		}		

	}

}
