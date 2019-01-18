package by.pvt.story.domain;

import java.util.ArrayList;
import java.util.List;

public class StoryList {
	
private static final StoryList stories = new StoryList();
	
	private final List <Story> list = new ArrayList<>();
	
	private StoryList(){
		
	}
	
	public static StoryList getStories(){   
		return stories;  }

	public List<Story> getList() {
		return list;
	} 	
	
	

}
