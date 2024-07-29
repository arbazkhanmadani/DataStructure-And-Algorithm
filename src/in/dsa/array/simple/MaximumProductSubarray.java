package in.dsa.array.simple;

public class MaximumProductSubarray {

	public static void main(String[] args) {


		int maxPro = maxProductSubarray(new int[]{1,-1,-3,0,7,-8,-2});
		System.out.println(maxPro);
	}

	public static int maxProductSubarray(int[] a){
		
		int res = Integer.MIN_VALUE;
		for(int i = 0; i<a.length; i++){
			
			int mul = a[i];
			for(int j = i+1; j<a.length; j++){
				
				res = Math.max(res, mul);
				mul = mul*a[j];
				
			}
			res = Math.max(res, mul);
		}
		
		return res;
		
	}
}
