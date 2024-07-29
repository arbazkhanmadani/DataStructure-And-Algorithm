package in.dsa.array.simple;
import java.util.Arrays;

public class SmallestPositiveMissingNumber {


	public static void main(String[] args){
		
		int arr[] = { 0, 1,10, 3, -10, -20 };
		int ans = firstMissingPositiveByUsingBS(arr);
		int ans1 = firstMissingPositive(arr);
		
		System.out.println("Smallest positive missing number is : "+ans+" : By BS");
		System.out.println("Smallest positive missing number is : "+ans1+" : By LS");
		
	}
	
	
	
	//By Using Linear Search........................
	public static int firstMissingPositive(int[] nums){
		 
		 Arrays.sort(nums);
		 //{-20,-10,0,2,10}
		 
		 int missNum = 0;
		 for (int i = 0; i < nums.length; i++){
			 
			 //nums[i]==missNum -> Checks the availability of num in array.
			 if(nums[i] == missNum){
				 missNum++;
			 }
		}
		 //System.out.println(missNum);
		 return missNum;
	}
	
	
	//By Using Binary Search........................
	public static int firstMissingPositiveByUsingBS(int[] nums){
		
		Arrays.sort(nums);
		//{-20,-10,0,2,10}
		 
		int l = 0, h = nums.length, mid = (h+l)/2,missNum=0;
		while(h>l){
			 
			 if(nums[mid]==missNum) missNum++;
			 
			 else if(nums[mid]>missNum) h = mid-1;
			 
			 else l = mid+1;
				 
		  mid = (h+l)/2;
		 }
		
		 return missNum;
	}
}
