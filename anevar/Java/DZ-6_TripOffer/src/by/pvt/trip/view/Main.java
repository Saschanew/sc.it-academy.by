package by.pvt.trip.view;

import by.pvt.trip.model.FoodCard;
import by.pvt.trip.model.TravelSet;
import by.pvt.trip.model.TripCase;
import by.pvt.trip.model.TripOffer;
import by.pvt.trip.model.TripTransport;

public class Main {

	public static void main(String[] args) {
		
		//  Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа 
		// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта, 
		// питания и числа дней. Реализовать выбор и сортировку путевок.
		
		TripOffer offer1 = new TripOffer("Madagaskar", TripCase.RELAX, TripTransport.PLANE, FoodCard.ALL_INCLUSIVE, 14);
		TripOffer offer2 = new TripOffer("Madagaskar", TripCase.EXCURSION, TripTransport.BUS, FoodCard.BREAKFAST, 21);
		TripOffer offer3 = new TripOffer("Madagaskar", TripCase.CURE, TripTransport.PLANE, FoodCard.ALL_INCLUSIVE, 14);
		TripOffer offer4 = new TripOffer("Madagaskar", TripCase.SHOPPING, TripTransport.RAILWAY, FoodCard.DEMI_PENSION, 14);
		TripOffer offer5 = new TripOffer("Madagaskar", TripCase.RELAX, TripTransport.PLANE, FoodCard.ALL_INCLUSIVE, 7);
		
		TravelSet list = new TravelSet();
		list.addTrip(offer1); list.addTrip(offer2); list.addTrip(offer3); list.addTrip(offer4); list.addTrip(offer5);
		
		list.searchTrip("Madagaskar", "cure", "plane", "all_inclusive", 14);
		list.sortByDays();

	}

}
