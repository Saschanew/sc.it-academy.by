package by.pvt.dz3.start;

public class Main {

	public static void main(String[] args) {

		Getter gt = new Getter();

		gt.setX(5);
		int a = gt.getX();
		System.out.println(a);

		gt = new Getter();
		int b = gt.getX();
		System.out.println(b);

	}

}
