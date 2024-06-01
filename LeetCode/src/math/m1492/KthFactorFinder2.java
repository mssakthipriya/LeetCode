package math.m1492;

public class KthFactorFinder2 {
	
    public static int kthFactor(int n, int k) {
        int[] factors = new int[k];
        int i = 1;
        int j = 0;
        while((j<k)&&(i<=n)){
            if(n%i == 0){
                factors[j] = i;
                j++;
            }
            i++;
        }

        if(factors[k-1]!=0){
            return factors[k-1];
        }else{
            return -1;
        }

    }
	
	public static void main(String[] args) {
		System.out.println(kthFactor(12,3));
	}

}
