package hashtable.ht2405;

import java.util.ArrayList;

public class OptimalPartition {
	
    public static int partitionString(String s) {
        int count =0;
        String sub = "";
        for(int i = 0;i<s.length();i++) {

        	if(sub.contains(s.subSequence(i, i+1))) {
        		count++;
        		sub="";
        		i--;
        	}else {
        		sub+=s.charAt(i);
        	}
        }
        
        return count+1;
    }
	
	public static void main(String[] args) {
		System.out.println(partitionString("ssssssa"));
	}

}
