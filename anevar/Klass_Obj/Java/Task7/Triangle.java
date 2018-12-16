package by.pvt.klass.start.Task7;

public class Triangle {
	
	// Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, 
	// периметра и точки пересечения медиан.

	private double a,b,c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(a);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(b);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(c);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(a) != Double.doubleToLongBits(other.a))
			return false;
		if (Double.doubleToLongBits(b) != Double.doubleToLongBits(other.b))
			return false;
		if (Double.doubleToLongBits(c) != Double.doubleToLongBits(other.c))
			return false;
		return true;
	}

	public double perimeter(){
		double perimeter = a+b+c;
		return perimeter;
	}
	
	public double content(){
		 double content=Math.sqrt(perimeter()/2*(perimeter()/2-a)*
				 (perimeter()/2-b)*(perimeter()/2-c));
		return content;
	}
	 
	public double[] median(){
					
		double my= (2/b)*Math.sqrt(perimeter()/2*(perimeter()/2-a)*
				 (perimeter()/2-b)*(perimeter()/2-c));
		
		double mx= Math.sqrt(Math.pow(c, 2)-Math.pow(my, 2));
		
		double[] mxy= new double[] {mx,my};
		return mxy; 
	}
}
