package in.dsa.string.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MostFrequentStringInArray {

	public static void main(String[] args) {

		String s = frequentString(new String[]{"hyy","hyy","hello","hyy","hello","by","sii"});
		System.out.println(s);
	}
	
	
	public static String frequentString(String s[]){
		
		Map<String, Integer> m = new TreeMap<>(); 
		for(int i = 0; i<s.length; i++){
			
			if( m.containsKey(s[i]) )
				m.put(s[i], m.get(s[i])+1);
			else
				m.put(s[i], 1);
		}
		
		int max = Integer.MIN_VALUE;
		String maxStr = "";
		for(Map.Entry<String, Integer> entry : m.entrySet()){
			if(entry.getValue()>max){
				max = Math.max(entry.getValue(), max);
				maxStr = entry.getKey();
			}
		}
		
		
		return maxStr;
	}
}
