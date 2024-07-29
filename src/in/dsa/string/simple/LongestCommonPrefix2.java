package in.dsa.string.simple;

import java.util.Arrays;

public class LongestCommonPrefix2{

	public static void main(String[] args) {
		
		String[] arr = {"flower","flow","flight"};
		String prefix = longestCommonPrefix(arr);
		System.out.println(prefix);
	}

	public static String longestCommonPrefix(String[] a) {

	     
        int size = a.length;

        /* if size is 0, return empty string */
        if (size == 0)
            return "";

        if (size == 1)
            return a[0];

        /* sort the array of strings */
        Arrays.sort(a);

        /* find the minimum length from first and last string */
        int end = Math.min(a[0].length(), a[size-1].length());

        /* find the common prefix between the first and last string */
        int i = 0;
        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
            i++;

        String pre = a[0].substring(0, i);
        return pre;
    
 
    }
}
