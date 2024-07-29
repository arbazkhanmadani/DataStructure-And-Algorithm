package in.dsa.array.simple;



import java.util.Arrays;

public class SecondLowestThroughSorting {

	public static void main(String[] args) {


		int min_elm = lowestElement(new int[]{1,1,0,0,1,1,0,0,1,1,0,0,0,0});
			
			System.out.println(min_elm);
		
	}
		
	public static int lowestElement(int arr[]){
			
		int second = Integer.MAX_VALUE;
		Arrays.sort(arr);
		
		for(int i = 1; i<arr.length; i++){
			
			//Ignoring duplicate....
			if(arr[0]!=arr[i]){
				second = arr[i];
				//System.out.println(Arrays.toString(arr));
				break;
			}
			
		}
		
		return second;
	}
		
		
		
}
