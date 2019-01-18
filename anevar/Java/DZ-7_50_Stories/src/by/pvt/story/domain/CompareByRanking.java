package by.pvt.story.domain;

import java.util.Comparator;

public class CompareByRanking implements Comparator<Story> {

	@Override
	public int compare(Story o1, Story o2) {
		
		return o1.getRanking()-o2.getRanking();
	}

}
