package dz1;

public class task21 {

	public static void main(String[] args) {
		// Дано действительное число R вида nnn.ddd (три цифровых разряда в
		// дробной и целой частях).
		// Поменять местами дробную и целую части числа и вывести полученное
		// значение числа.

		double r = 555.777;
		double revers = 0;

		revers = ((r * 1000 % 1000) * 1000 + (r * 1000 - (r * 1000 % 1000)) / 1000) / 1000;

		System.out.println(revers);
//////////////////////////////////////////////////////////////////////////////////////////////////////
		String str = Double.toString(r * 1000);
		
		char[] chStr = new char[6];
		chStr = str.toCharArray();

		char[] chStrFnal = new char[6];

		chStrFnal[0] = chStr[3];
		chStrFnal[1] = chStr[4];
		chStrFnal[2] = chStr[5];
		chStrFnal[3] = chStr[0];
		chStrFnal[4] = chStr[1];
		chStrFnal[5] = chStr[2];

		String str2 = String.valueOf(chStrFnal);
		Double revers2= Double.valueOf(str2);
		
		System.out.println(revers2/1000);

	}

}
