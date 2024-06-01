package math.m1492;

public class KthFactorFinder {
	
    public static int kthFactor(int n, int k) {
    	int i=1;
    	int j = 0;
    	while((j<k)&&(i<=n)){
    		if(n%i==0) {

    			j++;
    		}
    		i++;
    	}
    	if(j==k) {
    	return i-1;
    	}else {
    		return -1;
    	}

    }
	
	public static void main(String[] args) {
		System.out.println(kthFactor(7,2));
	}

}
