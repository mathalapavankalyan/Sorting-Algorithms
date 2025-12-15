package recursioncodes.sortings;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		
		int[] arr = {5,6,7,3,8,2};
		System.out.println(Arrays.toString(mergeSort(arr)));
		mergeSortInPlace(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));

	}

	public static int[] mergeSort(int[] arr) {
		if (arr.length == 1) {
			return arr;
		}
		
		int mid = arr.length /2;
		
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

		return merge(left, right);
	}

	private static int[] merge(int[] first, int[] second) {
		
		int[] mix = new int[first.length + second.length];
		
		int firstPointer = 0;
		int secondPointer = 0;
		int mixPointer = 0;
		while (firstPointer < first.length && secondPointer < second.length) {
			if (first[firstPointer] < second[secondPointer]) {
				mix[mixPointer] = first[firstPointer];
				firstPointer++;
			}
			else {
				mix[mixPointer] = second[secondPointer];
				secondPointer++;
			}
			mixPointer++;
			
		}
		
			while (firstPointer < first.length ) {
					mix[mixPointer] = first[firstPointer];
					firstPointer++;
					mixPointer++;
			}
		
			while (secondPointer < second.length ) {
					mix[mixPointer] = second[secondPointer];
					secondPointer++;
					mixPointer++;
			}
		
		
		return mix;
	}
	
	
	// Merge inPlace
	
	public static void mergeSortInPlace(int[] arr, int s ,int e) {
		if ((e-s) == 1) {
			return;
		}
		
		int mid = (s+e) /2;
		
		mergeSortInPlace(arr,s,mid);
		mergeSortInPlace(arr, mid,e);

		mergeInPlace(arr, s,mid,e);
	}

	private static void mergeInPlace(int[] arr, int s , int mid , int e) {
		
		int[] mix = new int[e-s];
		
		int firstPointer = s;
		int secondPointer = mid;
		int mixPointer = 0;
		while (firstPointer < mid && secondPointer < e) {
			if (arr[firstPointer] < arr[secondPointer]) {
				mix[mixPointer] = arr[firstPointer];
				firstPointer++;
			}
			else {
				mix[mixPointer] = arr[secondPointer];
				secondPointer++;
			}
			mixPointer++;
			
		}
		
			while (firstPointer < mid ) {
					mix[mixPointer] = arr[firstPointer];
					firstPointer++;
					mixPointer++;
			}
		
			while (secondPointer < e ) {
					mix[mixPointer] = arr[secondPointer];
					secondPointer++;
					mixPointer++;
			}
		 for(int l=0;l<mix.length;l++) {
			 arr[s+l] = mix[l];
		 }
		
	}

}
