package by.pvt.klass.start.Task6;

public class Main_Task6_Time {

	public static void main(String[] args) {

		Time time = new Time(25, 10, 15);
		time.toString();

		Time newTime = new Time();
		newTime = changeTimePlus(time, 26, 18, 40);

		newTime.toString();
		
		Time newTime1 = new Time();
		newTime1 = changeTimeMinus(time, 24, 5, 10);
		
		newTime1.toString();

	}

	public static Time changeTimePlus(Time time, int hour, int minut, int second) {

		Time newTime;

		int currentliTimeSeconds, currentliTimeSecondsPlus;

		currentliTimeSeconds = time.getHour() * 3600 + time.getMinut() * 60 + time.getSecond();
		currentliTimeSecondsPlus = currentliTimeSeconds + hour * 3600 + minut * 60 + second;

		if (currentliTimeSecondsPlus >= 24 * 3600) {
			System.out.println("Переходим в другой день");
			currentliTimeSecondsPlus = currentliTimeSecondsPlus % (24 * 3600);
		}

		int newHours = currentliTimeSecondsPlus / 3600;
		int newMinuts = (currentliTimeSecondsPlus - newHours * 3600) / 60;
		int newSeconds = (currentliTimeSecondsPlus - newHours * 3600) % 60;

		newTime = new Time(newHours, newMinuts, newSeconds);

		return newTime;

	}

	public static Time changeTimeMinus(Time time, int hour, int minut, int second) {

		Time newTime;

		int currentliTimeSeconds, currentliTimeSecondsMinus;

		currentliTimeSeconds = time.getHour() * 3600 + time.getMinut() * 60 + time.getSecond();
						
		do {
			currentliTimeSeconds += 24*3600;
			System.out.println("Переходим в другой день");
		} while (hour*3600+minut*60+second > currentliTimeSeconds);
		
		currentliTimeSecondsMinus = currentliTimeSeconds - hour * 3600 - minut * 60 - second;
		
		int newHours = currentliTimeSecondsMinus / 3600;
		int newMinuts = (currentliTimeSecondsMinus - newHours * 3600) / 60;
		int newSeconds = (currentliTimeSecondsMinus - newHours * 3600) % 60;

		newTime = new Time(newHours, newMinuts, newSeconds);

		return newTime;

	}

}
