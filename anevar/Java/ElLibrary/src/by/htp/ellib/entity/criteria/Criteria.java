package by.htp.ellib.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

	private Map<CriteriasBook, Object> criteria = new HashMap<CriteriasBook, Object>();

	public void add(CriteriasBook searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<CriteriasBook, Object> getCriteria() {
		return criteria;
	}

	public void setCriteria(Map<CriteriasBook, Object> criteria) {
		this.criteria = criteria;
	}


}
