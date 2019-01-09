package by.pvt.klass.start.Task3;

public class Main_Task3_Student {

	public static void main(String[] args) {

		Student[] students = {new Student("Vasja", 1), new Student("Koljan", 3), new Student("Vovan", 2),
				new Student("Djastin", 1), new Student("Borja", 1), new Student("Bill", 3),
				new Student("Batman", 2), new Student("Halk", 1), new Student("Spiderman", 1), new Student("Cat", 2),};

		students[0].setRanking(new int[]{5,6,7,8,4});
		students[1].setRanking(new int[]{10,10,10,10,9});
		students[2].setRanking(new int[]{5,6,7,9,4});
		students[3].setRanking(new int[]{9,9,9,10,10});
		students[4].setRanking(new int[]{5,6,7,8,4});
		students[5].setRanking(new int[]{5,9,7,8,4});
		students[6].setRanking(new int[]{5,10,7,8,4});
		students[7].setRanking(new int[]{9,10,9,9,9});
		students[8].setRanking(new int[]{10,6,7,8,4});
		students[9].setRanking(new int[]{5,6,7,8,9});
		
		System.out.println("Студенты только с 9 и 10ми:");
		printNeards(students);
		
	}
	
	public static void printNeards(Student[] students){
		for (int i = 0; i < students.length; i++) {
			int[] temp=students[i].getRanking();
			boolean tempB = false;
			for (int j = 0; j < temp.length; j++) {
				if (temp[j]==9 || temp[j]==10) {
					tempB=true;
				}else{
					tempB=false;
					break;
				}
			}
			if (tempB==true) {
				System.out.println(students[i].getName()+" Группа: "+students[i].getNumberGroup());
			}
		}
		
	}

}
