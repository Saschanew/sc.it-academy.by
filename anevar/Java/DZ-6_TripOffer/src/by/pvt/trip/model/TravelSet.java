package by.pvt.trip.model;

import java.util.ArrayList;
import java.util.List;

public class TravelSet {
	
	private List<TripOffer> list = new ArrayList<>();
	
	public void addTrip(TripOffer offer) {
		list.add(offer);
	}
	
	public void searchTrip(String name, String tripCase, String transport, String card, int days) {
		System.out.println("Ваше путешествие: ");
		for (TripOffer tripOffer : list) {
			if (name.equals(tripOffer.getName()) && tripCase.toUpperCase().equals(tripOffer.getTripCase().name()) 
					&& transport.toUpperCase().equals(tripOffer.getTransport().name()) && 
					card.toUpperCase().equals(tripOffer.getCard().name()) && days == tripOffer.getDays()){
				System.out.println(tripOffer.toString());
			}
		}
		
	}
	
	public void sortByDays() {
		TripOfferComparatorByDays comparator = new TripOfferComparatorByDays();
		list.sort(comparator);
		System.out.println("Список отсортированный по продолжительности: ");
		for (TripOffer tripOffer : list) {			
			System.out.println(tripOffer.toString());
		}
	}

}
