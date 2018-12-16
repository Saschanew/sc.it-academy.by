package by.pvt.klass.start.Task6;

public class Time {
	// Составьте описание класса для представления времени. Предусмотрте возможности установки времени и 
	// изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае 
	// недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на заданное 
	// количество часов, минут и секунд. 
	
	private int hour, minut, second;
	
	public Time() {
		
	}

	public Time(int hour, int minut, int second) {
		if (hour>=0 && hour<=23) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
		
		if (minut>=0 && minut<=59) {
			this.minut = minut;
		} else {
			this.minut = 0;
		}
		
		if (second>=0 && second<=59) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour>=0 && hour<=23) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	public int getMinut() {
		return minut;
	}

	public void setMinut(int minut) {
		if (minut>=0 && minut<=59) {
			this.minut = minut;
		} else {
			this.minut = 0;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second>=0 && second<=59) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}
	
	@Override
	public String toString() {
		System.out.println("Часы: "+hour+" Минуты: "+minut+" Секунды: "+second);
		return super.toString();
	}
	
}
