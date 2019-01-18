package by.pvt.story.domain;

public class Story {
	
	private String name; private int ranking; private int numbToken;

	public Story(String name, int ranking, int numbToken) {
		super();
		this.name = name;
		this.ranking = ranking;
		this.numbToken = numbToken;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public int getNumbToken() {
		return numbToken;
	}
	
	public void setNumbToken(int numbToken) {
		this.numbToken = numbToken;
	}
	
	@Override
	public String toString() {
		return "Story [name=" + name + ", ranking=" + ranking + ", numbToken=" + numbToken + "]";
	}

}
