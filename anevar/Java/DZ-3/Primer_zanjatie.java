package by.pvt.dz3.start;

import java.util.Scanner;

public class Primer_zanjatie {

	public static void main(String[] args) {
		final int countOfWorkingHours = 14;
		String[] actions = new String[countOfWorkingHours];

		System.out.println("Заполни свое расписание дня.");

		int workingHour = chooseHour();

	}

	private static final String[] correctData = { "8", "9", "10", "11", "8:00", "08:00" };

	public static int chooseHour() {
		String userData;
		int chooseHour;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите рекактируемое время: ");
		userData = sc.next();

		int i = 0;
		while (i < correctData.length) {
			if (correctData[i].equals(userData)) {
				break;
			}
			i++;
		}

		/*int index;
		if (i < correctData.length) {
			index = userData.indexOf(":");
			if (index > 0) {
				userData = userData.substring(0, index);
			}
			chooseHour = Integer.parseInt(userData);
			return chooseHour;
		}*/
		
		if (i < correctData.length) {
			chooseHour=chooseInt(userData);
		}
		
		return 0;

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

	private static final int baseHour = 8;

	public static String takeHour(final int arrayIndex) {
		int hour;
		String result;

		hour = baseHour + arrayIndex;
		result = hour + ":00";

		return result;
	}

}
