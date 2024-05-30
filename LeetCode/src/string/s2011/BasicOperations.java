package string.s2011;

public class BasicOperations {
	
    public static int finalValueAfterOperations(String[] operations) {
        int X  = 0;
        for(int i = 0;i < operations.length;i++){
            if((operations[i].equals("++X"))||(operations[i].equals("X++"))){
                X++;
            }else if((operations[i].equals("--X"))||(operations[i].equals("--X"))){
                X--;
            }
        }

        return X;
    }
    
	public static void main(String[] args) {
        String[] strArray = new String[]{"X++","++X","--X","X--"};
        
		System.out.println("Ans: "+finalValueAfterOperations(strArray));
	}


}
