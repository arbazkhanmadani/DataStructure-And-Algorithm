package in.dsa.array.matrix;    

public class SumOfDaigonalOfMatrix {


	public static void main(String[] args) {

		int sum = sumOfDiagonal(new int[][]{ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} });
		System.out.println("Element fount at idx: "+ sum);
	}
	
	public static int sumOfDiagonal(int[][] a){
		
		int sum = 0, n = a.length-1;
		if(a.length==1)return 0;
			
		for(int i = 0; i<=n; i++){
			for(int j = 0; j<a[i].length; j++){
			 
				if( (i==0 && j==0) || (i==n && j==n) || (i==0 && j==n) || (i==n && j==0) || (i==j )){
					
					sum = sum + a[i][j];
				}
			}
		}
	  return sum;			
	}

}
