package in.dsa.string.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LeastFrequentStringInArray {

	public static void main(String[] args) {

		List<String> s = frequentString(new String[]{"hyy","hyy","hello","hyy","hello","by","sii"});
		System.out.println(s.toString());
	}
	
	
	public static ArrayList<String> frequentString(String s[]){
		
		Map<String, Integer> m = new TreeMap<>(); 
		for(int i = 0; i<s.length; i++){
			
			if( m.containsKey(s[i]) )
				m.put(s[i], m.get(s[i])+1);
			else
				m.put(s[i], 1);
		}
		
		int min = Integer.MAX_VALUE;
		ArrayList<String> al = new ArrayList<>();
		
		for(Map.Entry<String, Integer> entry : m.entrySet()){
			
			if(entry.getValue()<=min){
				al.add(entry.getKey());
				min = Math.min(entry.getValue(), min);
			}
		}
		
		
		return al;
	}
}
