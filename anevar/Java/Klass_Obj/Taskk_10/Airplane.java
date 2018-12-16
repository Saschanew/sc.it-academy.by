package by.pvt.klass.start.Taskk_10;

import java.util.Date;

public class Airplane {
	
	//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
	
	private String destination;
	private int numberFlight;
	private String typeAircraft;
	Airplane_WeekDays day;
	Date time = new Date();
	
	@SuppressWarnings("deprecation")
	public Airplane(String destination, int numberFlight, String typeAircraft, 
			int hour, int minute, Airplane_WeekDays day) {
	
		this.destination = destination;
		this.numberFlight = numberFlight;
		this.typeAircraft = typeAircraft;
		time.setHours(hour);
		time.setMinutes(minute);
		this.day = day;
				
	}

	@SuppressWarnings("deprecation")
	@Override
	public String toString() {
		return "[destination: " + destination + ", numberFlight: " + numberFlight + ", typeAircraft: "
				+ typeAircraft + ", hour: " + time.getHours() + ", minute: " + 
				time.getMinutes() + ", day: " + day + "]";
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberFlight() {
		return numberFlight;
	}

	public void setNumberFlight(int numberFlight) {
		this.numberFlight = numberFlight;
	}

	public String getTypeAircraft() {
		return typeAircraft;
	}

	public void setTypeAircraft(String typeAircraft) {
		this.typeAircraft = typeAircraft;
	}

	public Airplane_WeekDays getDay() {
		return day;
	}

	public void setDay(Airplane_WeekDays day) {
		this.day = day;
	}	

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + numberFlight;
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((typeAircraft == null) ? 0 : typeAircraft.hashCode());
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
		Airplane other = (Airplane) obj;
		if (day != other.day)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (numberFlight != other.numberFlight)
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (typeAircraft == null) {
			if (other.typeAircraft != null)
				return false;
		} else if (!typeAircraft.equals(other.typeAircraft))
			return false;
		return true;
	}
	
	
	
}

