package by.pvt.dz3.start;

public class Calc_main {

	public static void main(String[] args) {
		// Написать программу, в которой вводятся два операнда Х и Y и знак
		// операции (+, –, /, *).
		// Вычислить результат Z в зависимости от знака. Предусмотреть реакции
		// на возможный неверный знак
		// операции, а также на ввод Y=0 при делении. Организовать возможность
		// многократных вычислений без
		// перезагрузки программа (т.е. построить цикл). В качестве символа
		// прекращения вычислений принять ‘0’

		System.out.println("Введите первое число: ");
		double x = Helper.readDouble();
		char operator;
		double y, z=0;

		do {

			System.out.println("Введите оператор +,-,*,/: или ноль для прекращения");
			operator = Helper.readChar();

			if (operator == '0') {
				break;
			}
			if (operator != '0' && operator != '+' && operator != '-' && operator != '*' && operator != '/') {
				System.out.println("Невозможный оператор!");
				continue;
			}

			System.out.println("Задайте второе число: ");
			y = Helper.readDouble();
			if (operator == '/' && y == 0) {
				System.out.println("Нельзя делить на ноль!");
				continue;
			}

			switch (operator) {
			case ('+'):
				z = Helper.summ(x, y);
				break;
			case ('-'):
				z = Helper.minus(x, y);
				break;
			case ('*'):
				z = Helper.multipl(x, y);
				break;
			case ('/'):
				z = Helper.del(x, y);
				break;
			}
		} while (operator != '0');

		System.out.printf("Результат: %.2f %n", +z);
	}

	
}
