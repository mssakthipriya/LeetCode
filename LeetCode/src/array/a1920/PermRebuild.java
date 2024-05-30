package array.a1920;

import java.util.Iterator;

public class PermRebuild {
	
    public static int[] buildArray(int[] nums) {
    	
    	int[] tempArr = new int[nums.length];
    	
        for(int i=0;i<nums.length;i++){
        	tempArr[i] = nums[nums[i]];
        }
        
        return tempArr;
    }
	
	public static void main(String[] args) {
		
		int[] newArr = {0,2,1,5,3,4};
		for(int i = 0; i< newArr.length;i++) {
		System.out.println(buildArray(newArr)[i]);
		}
	}

}
