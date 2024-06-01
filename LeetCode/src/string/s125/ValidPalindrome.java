package string.s125;

public class ValidPalindrome {
	
    public static boolean isPalindrome(String s) {
    	s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int j = s.length()-1;
    	
    	for(int i=0;i<s.length()/2;i++) {
    		if(s.charAt(i)!=s.charAt(j)) {
    			return false;
    		}
    		j--;
    	}





    	return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("OP"));
	}

}
