package in.dsa.array.tricky;

public class StockBuySellBestTime {

	public static void main(String[] args){
		  
        // stock prices on consecutive days
        int price[] = {7,1,5,6,4};
        int bestTime = bestTime(price);
        System.out.println("Best Time is : "+bestTime);
	  }
  
	
	 static int bestTime(int prices[]){
	  
	     //maxProfit adds up the difference between 
		 //adjacent elements if they are in increasing order
	     int maxProfit = 0;
	     int buy = prices[0];
	     
	     //The loop starts from 1 as its comparing with the previous
	     for(int i = 1; i < prices.length; i++)
	    	
	    	//checking for lower buy value.
	    	if(buy> prices[i])
	        	buy = prices[i]; 
	    	//Checking for higher profit.
	    	else if( (prices[i]-buy)>maxProfit )
	    		maxProfit = prices[i]-buy;
	    		
	    		
	     return  maxProfit>0 ? maxProfit: 0;
	    }
	  

}
