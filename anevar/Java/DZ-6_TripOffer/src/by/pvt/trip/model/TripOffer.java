package by.pvt.trip.model;

public class TripOffer {
	
	// Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа 
	// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта, 
	// питания и числа дней. Реализовать выбор и сортировку путевок.
	
	String name; TripCase tripCase; TripTransport transport; FoodCard card; int days;

	public TripOffer(String name, TripCase tripCase, TripTransport transport, FoodCard card, int days) {
		super();
		this.name = name;
		this.tripCase = tripCase;
		this.transport = transport;
		this.card = card;
		this.days = days;
	}	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public TripCase getTripCase() {
		return tripCase;
	}
	public void setTripCase(TripCase tripCase) {
		this.tripCase = tripCase;
	}

	public TripTransport getTransport() {
		return transport;
	}
	public void setTransport(TripTransport transport) {
		this.transport = transport;
	}

	public FoodCard getCard() {
		return card;
	}
	public void setCard(FoodCard card) {
		this.card = card;
	}

	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "Направление: " + name + ", Вид отдыха: " + tripCase + ", транспорт: " + transport + ", питание: " + card
				+ ", число дней: " + days;
	}
	
	

}
