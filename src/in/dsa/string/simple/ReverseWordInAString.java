package in.dsa.string.simple;

public class ReverseWordInAString {


	public static void main(String[] args){
		String r = reverseWord("		I love java programing language.	");
		System.out.println(r);
	}
	
	public static String reverseWord(String str){
		
		String words[] = str.split("\\s");
		String finalRstr = "";
		
		for(int i = 0; i<=words.length-1; i++){
			
			String wrd = words[i];
			String rStr = "";
			for(int j = wrd.length()-1; j>=0; j--){
				
				rStr = rStr + wrd.charAt(j);
			}
			finalRstr = finalRstr + rStr+" ";
			
		}
		
	return finalRstr.trim();
	
	
	
	/** => O(n)
	 *  String[] words=s.split("\\ ");
        StringBuilder result=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String pre=new StringBuilder(words[i]).reverse().toString();
             result.append(pre);
             if (i < words.length - 1) {
                result.append(" ");
             }
        }
        return result.toString();
	 */
	}
}
