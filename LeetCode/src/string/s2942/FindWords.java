package string.s2942;

import java.util.ArrayList;
import java.util.List;

public class FindWords {
	
	public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> index = new ArrayList<>();
        for(int i=0;i<words.length;i++) {
        	if(words[i].indexOf(x)!=-1) {
        		index.add(i);
        	}
        }
        
        return index;
    }
	
	public static void main(String[] args) {
		String[] strArray = new String[]{"abc","bcd","aaaa","cbc"};
		
		System.out.println(findWordsContaining(strArray,'z'));
		
	}

}
