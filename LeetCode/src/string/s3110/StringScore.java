package string.s3110;



public class StringScore {
	
	public static int scoreOfString(String s) {
		int score = 0;
		
		for(int i=0;i<s.length()-1;i++) {
			score+=Math.abs(((int)s.charAt(i))-((int)s.charAt(i+1)));
		}
		
		return score;
	}
	
	public static void main(String[] args) {
		int scr = scoreOfString("zaz");
		System.out.println(scr);
	}

}
