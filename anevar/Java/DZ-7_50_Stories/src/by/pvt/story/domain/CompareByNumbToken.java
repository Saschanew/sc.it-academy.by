package by.pvt.story.domain;

import java.util.Comparator;

public class CompareByNumbToken implements Comparator<Story> {

	@Override
	public int compare(Story o1, Story o2) {
		// TODO Auto-generated method stub
		return o1.getNumbToken()-o2.getNumbToken();
	}

}
