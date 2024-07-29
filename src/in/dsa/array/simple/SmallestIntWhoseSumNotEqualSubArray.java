package in.dsa.array.simple;

import java.util.Arrays;

/*
 *  {1,10,3,11,6,5}
 *  smallestint = 2
 *  It means arr does not contain a num whose sum=any subset of array.
 */
public class SmallestIntWhoseSumNotEqualSubArray {

	public static void main(String[] args) {
		int smallestInt = smallestIntWHoseSumNotEqualSubarray(new int[]{1,2,10,3,11,6,5});
		System.out.println(smallestInt);
	}

	public static int smallestIntWHoseSumNotEqualSubarray (int[] a){
		
		//intialize Result....
		int res = 1;
		Arrays.sort(a);
		
		for(int i = 0; i<a.length; i++){
			
				if(a[i]>res)
					return res;
				else 
					res = res+a[i];
		
		}
		
		return res;
		
	}	
}
