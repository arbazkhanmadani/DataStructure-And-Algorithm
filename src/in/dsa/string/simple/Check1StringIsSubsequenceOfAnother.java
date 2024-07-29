package in.dsa.string.simple;

public class Check1StringIsSubsequenceOfAnother {


	public static void main(String[] args){
		System.out.println(check("abcde", "abc"));
	}
	
	
	public static boolean check(String s1, String s2){
	
		int i =0,j=0;
		
		while(i<s1.length() && j<s2.length()){
			
			if(s1.charAt(i)==s2.charAt(j))
				i++;
			
		  j++;	
		}


		System.out.println(i);
		return i==s1.length();
	
	}

}
