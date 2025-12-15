package recursioncodes.sortings;

import java.util.Arrays;

public class QuickSort {
public static void main(String[] args) {
	
	
	/**
	 * Quick sort Algorithm
	 * 
	 * step 1 : choose any element - after first pass - all the smallest elements of the pivot(choosen element) should be in the LHS
	 * and elements which are greater than pivot should be on RHS.
	 * 
	 * cases : pivot = any element
	 * rule 1 : element < pivot , should be in LHS
	 * rule 2 : element > pivot , should be in RHS
	 * 
	 * 
	 * How to pick the Pivot
	 * 1. choose middle element as pivot
	 * 2.choose random element as pivot
	 * 3.choose corner element as pivot
	 * 
	 * Recurrence relation : T(N) + T(N-K-1) + O(N)
	 * 
	 */
	
	int[] nums = {4,5,3,6,2,7};
	quickSort(nums , 0 , nums.length-1);
	System.out.println(Arrays.toString(nums));
}

private static void quickSort(int[] nums, int low, int high) {
	if(low >= high) {
		return;
	}
	
	
	int start = low;
	int end = high;
	int mid = start + (end-start)/2;
	int pivot = nums[mid];
	while(start <= end) {
		
		
		while(nums[start] < pivot) {
			start++;
		}
		
		while(nums[end] > pivot) {
			end--;
		}
		
		if(start <= end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
	
	// sort remaining two Halves
	
	quickSort(nums , low , end);
	quickSort(nums , start , high);
	
	
}
}
