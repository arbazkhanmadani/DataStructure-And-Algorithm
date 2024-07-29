package in.dsa.array.simple;

import java.util.*;

public class KthSmallestBySortingDSC {

	public static void main(String[]args ) {
		
		//9,7,6,5,4,3,2,1
		int arr[] = {1,9,3,2,4,6,5,7};
		int kth_smallest = kthSmallestElementBySorting(arr, 2);
		System.out.println(kth_smallest);
	}
	
		//Kth smallest element means where k = 2; which means 2nd smallest element
		// if k = 4; 4th largest element 
		public static int kthSmallestElementBySorting(int a[], int k){
			
			
			for(int i = 0; i<a.length; i++){
				
				for(int j = 0; j<a.length; j++){
					
					int temp = 0;
					if(a[i]>a[j]){
						
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			
			return a[a.length-k];
			
		}
}
