package by.pvt.trip.model;

import java.util.Comparator;

public class TripOfferComparatorByDays implements Comparator<TripOffer> {

	@Override
	public int compare(TripOffer o1, TripOffer o2) {
		
		return o1.getDays()-o2.getDays();
	}

}
