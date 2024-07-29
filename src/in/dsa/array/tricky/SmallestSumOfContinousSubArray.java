package in.dsa.array.tricky;

public class SmallestSumOfContinousSubArray {


    public static void main(String[] args){
         
        int arr[] = {3, -4, 2, -3, -1, 7, -5};
        System.out.print("Smallest sum: "+ smallestSumSubArray(arr));
    }
    
    
	public static int smallestSumSubArray(int arr[]){
         
        // to store the minimum value that is ending up to the current index
        int currSum = Integer.MIN_VALUE;
         
        // to store the minimum value encountered so far
        int minSum = Integer.MIN_VALUE;
         
        for (int i = 0; i < arr.length; i++){
             
        	currSum = currSum + arr[i];
            
        	if (currSum > minSum)
            	minSum = currSum;
             
            if(currSum<0)
            	currSum=0;
        }
         
        return minSum;
    }
     
}
