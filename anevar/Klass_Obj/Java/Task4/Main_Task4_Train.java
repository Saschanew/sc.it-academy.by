package by.pvt.klass.start.Task4;

public class Main_Task4_Train {

	public static void main(String[] args) {

		Train[] trains = { new Train("Magadan", 111, 14, 55), new Train("Moskva", 777, 13, 21),
				new Train("Brest", 748, 8, 5), new Train("Tashkent", 335, 20, 25),
				new Train("Mogilev", 234, 17, 46), new Train("Mogilev", 234, 17, 41) };
		
		sortByTrainNumber(trains);
		
		System.out.println("Сортировка по номеру поезда:");
		for (int i = 0; i < trains.length; i++) {
			trains[i].toString();
		}
		
		System.out.println("Введите номер поезда который хотите найти:");
		
		int trainNumber = Helper.readInt();
		
		trainByNumber(trains, trainNumber);
		
		System.out.println("Сортировка по пункту назначения:");
		sortByDestination(trains);
		for (int i = 0; i < trains.length; i++) {
			trains[i].toString();
		}

	}

	public static void sortByTrainNumber(Train[] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length - i - 1; j++) {
				if (mas[j].getNumberTrain() > mas[j + 1].getNumberTrain()) {
					Train t = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = t;
				}
			}
		}
	}
	
	public static void trainByNumber(Train[] mas, int number){
		
		for (Train train : mas) {
			if (train.getNumberTrain() == number) {
				train.toString();
			}
		}
		
	}
	
	public static void sortByDestination(Train[] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length - i - 1; j++) {
				if (mas[j].getDestination().compareTo(mas[j+1].getDestination())>0) {
					Train t = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = t;
				} else if(mas[j].getDestination().compareTo(mas[j+1].getDestination())==0){
					if (mas[j].getHours() > mas[j+1].getHours()) {
						Train t = mas[j];
						mas[j] = mas[j + 1];
						mas[j + 1] = t;
				}else if(mas[j].getHours() == mas[j+1].getHours()){
					if (mas[j].getMinuts() > mas[j+1].getMinuts()) {
						Train t = mas[j];
						mas[j] = mas[j + 1];
						mas[j + 1] = t;
				}
				}
			}
		}
	}
}
}
