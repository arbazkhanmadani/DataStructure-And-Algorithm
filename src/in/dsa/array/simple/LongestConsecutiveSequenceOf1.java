package in.dsa.array.simple;

public class LongestConsecutiveSequenceOf1 {

public static void main(String[] args){
		
		int e = longetConsecutive(new int[]{1,1,0,1,1,1});
		System.out.println(e);
	}
	
	
	public static int longetConsecutive(int[]a){
		
		int longest = 1;
		int maxLongest = 0;
		
        for(int num : a){
        	
            if(num == 1)
            	maxLongest++;
            
            //Handling Non 1 Number.
            else
            	maxLongest = 0;
            
            if(maxLongest>longest)
            	longest = maxLongest;
        }
        
        return maxLongest;
	}
}
