package recursioncodes.arrays;

class SecondLargest {
	public static void main(String[] args) {
		int nums[] = {12, 35, 1, 10, 34, 1};
		System.out.println(getSecondLargest(nums));
	}
    public static int getSecondLargest(int[] arr) {
        // code here
        int secondMini = Integer.MIN_VALUE;
        int mini = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>mini){
                secondMini = mini;
                mini = i;
            }
            if(i<mini && i>secondMini){
                secondMini = i;
            }
        }
        
        return secondMini == Integer.MIN_VALUE ? -1 : secondMini;
    }
}