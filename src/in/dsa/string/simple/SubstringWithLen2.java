package in.dsa.string.simple;

public class SubstringWithLen2 {

public static void main(String[] args) {
	
	boolean f = isSubstringPresent("leetcode");
	System.out.println(f);
}
public static boolean isSubstringPresent(String s) {
        
        String rev = "";
       
        for(int j=s.length()-1; j>=0;j--)
            rev+=s.charAt(j);
    	//System.out.println(rev);

        for(int i=0; i<s.length()-1; i++)
         if(s.contains(rev.substring(i, i+2)) )
        	 return true;
         
        
        return false;
    }
}
