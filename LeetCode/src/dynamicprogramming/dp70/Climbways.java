package dynamicprogramming.dp70;

public class Climbways {
	private static int [] cache;
	public static int climbStairs(int n) {
		
		if(n<=2) {
			return n;
		}
		
		if(cache[n]!=0) {
			return cache[n];
		}
		int ways = climbStairs(n-1)+climbStairs(n-2);
		cache[n] = ways;
		return ways;
	}
	
	public static void main(String[] args) {
		int n = 45;
		cache = new int[n+1];
		System.out.println(climbStairs(n));
	}

}
