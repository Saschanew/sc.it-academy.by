package by.pvt.text.start;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
	
	List<Word> sentence = new ArrayList<>();
	
	@Override
	public String toString() {
		String result = "";
	    for (int i = 0; i < sentence.size(); i++) {
	        result += " " + sentence.get(i);
	    }
	    return result;
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}
	
	public void addWords(String str) {
		Word word = new Word();
		word.setValue(str);
		sentence.add(word);
	}

}
