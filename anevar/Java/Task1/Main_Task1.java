package by.pvt.klass.start.Task1;

public class Main_Task1 {

	public static void main(String[] args) {
		
		Task1 task = new Task1(6, 45);
		
		task.setValue1(7);
		task.printValue1();
		
		int summ= task.summ();
		System.out.println(summ);
		
		int max = task.max();
		System.out.println(max);
	}

}
