package by.tc.task01.test;

import by.tc.task01.dao.impl.ApplianceDAOImpl;
import by.tc.task01.entity.criteria.Criteria;

public class Test {

	public static void main(String[] args) {

		ApplianceDAOImpl test = new ApplianceDAOImpl();
		
		test.find(new Criteria<>());

	}

}
