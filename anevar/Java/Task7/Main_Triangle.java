package by.pvt.klass.start.Task7;

public class Main_Triangle {

	public static void main(String[] args) {
		
		Triangle tringle = new Triangle(3, 5, 6);
		
		double [] mxy = tringle.median();
		
		for (int i = 0; i < mxy.length; i++) {
			System.out.println(mxy[i]);
		}
				
	}

}
