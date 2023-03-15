package array;

import java.util.Arrays;

public class HighestConsecutiveNumber {

	public static void main(String[] args) {
   
		int a[]= {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,20,21};
		 System.out.println("Array: " + Arrays.toString(a));
		    int maxConsecutive = findMaxConsecutive(a);
		    System.out.println("Highest consecutive number: " + maxConsecutive);
		
		
		    System.out.println("------------------------------------");
		    
		    int[] max=findMaxConsecutives(a);
		    
		    System.out.println("Array : "+Arrays.toString(max));
		    int sum=0;
		    for(int i=0;i<max.length;i++) {
		    	sum=sum+max[i];
		    }
		    System.out.println(sum);
		    System.out.println(max.length);
	}
	public static int findMaxConsecutive(int[] nums) {
	    int maxCount = 0;
	    int currentCount = 0;
	    
	    for (int i = 0; i < nums.length; i++) {
	        // If the current number is part of a consecutive sequence
	        if (i > 0 && nums[i] == nums[i-1]+1) {
	            currentCount++;
	        } else {
	            // If the current number is not part of a consecutive sequence
	            maxCount = Math.max(maxCount, currentCount);
	            currentCount = 1;
	        }
	    }
	    // Handle the case where the last number is part of a consecutive sequence
	    maxCount = Math.max(maxCount, currentCount);
	    
	    return maxCount;
	}
	



public static int[] findMaxConsecutives(int[] nums) {
    int maxCount = 0;
    int currentCount = 0;
    int currentNumber = 0;
    
    for (int i = 0; i < nums.length; i++) {
        // If the current number is part of a consecutive sequence
    	
        if (i > 0 && nums[i] == nums[i-1]+1) {
//        	System.out.println((num[i-1]+1));
            currentCount++;
        } else {
            // If the current number is not part of a consecutive sequence
            if (currentCount > maxCount) {
                maxCount = currentCount;
                currentNumber = nums[i-1];
            }
            currentCount = 1;
        }
    }

    if (currentCount > maxCount) {
        maxCount = currentCount;
        currentNumber = nums[nums.length-1];
    }
    
    int[] result = new int[maxCount];
    for (int i = 0; i < maxCount; i++) {
        result[i] = currentNumber - maxCount + 1 + i;
    }
    return result;
}

}
