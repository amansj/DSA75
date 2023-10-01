/**
 * 
 * @author amansingh
 * leetcode link: https://leetcode.com/problems/greatest-common-divisor-of-strings
 *
 */


public class GreatestCommonDivisorOfStrings {
	
	static class Solution {
		public int gcd(int x, int y) {
	        if (y == 0) {
	            return x;
	        } else {
	            return gcd(y, x % y);
	        }    
	    }
	    
	    public String gcdOfStrings(String str1, String str2) {
	        // Check if they have non-zero GCD string.
	        if (!(str1 + str2).equals(str2 + str1)) {
	            return "";
	        }
	        
	        // Get the GCD of the two lengths.
	        int gcdLength = gcd(str1.length(), str2.length());
	        return str1.substring(0, gcdLength);
	    }
	}

	public static void main(String[] args) {
		Solution solution=new Solution();
		System.out.println(solution.gcdOfStrings("ABCABC", "ABC"));
		System.out.println(solution.gcdOfStrings("ABABAB", "ABAB"));
		System.out.println(solution.gcdOfStrings("LEET", "CODE"));

	}

}
