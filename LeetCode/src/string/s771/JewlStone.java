package string.s771;

import java.util.regex.Pattern;

public class JewlStone {
	
    public static int numJewelsInStones(String jewels, String stones) {
        int nos = 0;
        
        for(int i=0;i<jewels.length();i++) {
        	nos+= stones.length()- stones.replace(jewels.subSequence(i, i+1), "").length();
        }
        
        return nos;
    }
	
public static void main(String[] args) {
	String names = "xxhixx";
	System.out.println(names);
	System.out.println(names.subSequence(2, 3));
	
	System.out.println(numJewelsInStones("z","ZZ"));
}
}
