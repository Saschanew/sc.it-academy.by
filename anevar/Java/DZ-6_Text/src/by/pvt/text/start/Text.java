package by.pvt.text.start;

import java.util.ArrayList;
import java.util.List;

public class Text {
	
	List<Sentence> text = new ArrayList<>();
	private String header;

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}
		
	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	@Override
	public String toString() {
		String result = "";
	    for (int i = 0; i < text.size(); i++) {
	        result += " " + text.get(i);
	    }
	    System.out.printf("\t\t %s %n  %s", header, result);
	    return super.toString();
	}

	public void addSentence(String str) {
		Sentence sentence = new Sentence();
		sentence.addWords(str);
		text.add(sentence);
	}

}
