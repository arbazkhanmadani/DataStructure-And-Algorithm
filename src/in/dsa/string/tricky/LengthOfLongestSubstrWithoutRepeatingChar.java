package in.dsa.string.tricky;

import java.util.HashMap;
import java.util.Map;

/**
    abcabcbb -> longest substr without repeating char is ->  abc = 3 len		
 */
public class LengthOfLongestSubstrWithoutRepeatingChar {

	public static void main(String[] args) {

		int maxLen = lengthOfSubstr("abcabcbb");
		System.out.println(maxLen);
	}
	
	public static int lengthOfSubstr(String s){
		
		if(s==null || s.length()==0)
			return 0;
		
		Map<Character, Integer> m = new HashMap<>();
		int start = 0, maxLen=0;
		
		for(int end = 0; end<s.length(); end++){
			
			char ch = s.charAt(end);
			if(m.containsKey(ch))
			   //move start pointer to the right of the previous occurrence of the curr char....
			   start = Math.max(start, m.get(ch)+1 );
				//System.out.println("Start : "+start);
				//System.out.println("End : "+end);
				
			//update idx of curr Char.........
			m.put(ch, end);
			
			//update the maxLen...................
			maxLen = Math.max(maxLen, end-start+1);
			//System.out.println("MaxLen : "+maxLen);
			
		}
		System.out.println(m);
		
		
		
		
		
		return maxLen;
	}

}
