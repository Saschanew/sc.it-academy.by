package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	//Class searchType;
	private Map<E, Object> criteria = new HashMap<E, Object>();

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}

	public void setCriteria(Map<E, Object> criteria) {
		this.criteria = criteria;
	}
	
	
	
	// you may add your own code here

}
