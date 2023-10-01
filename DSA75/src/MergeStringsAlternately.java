/**
 * 
 * @author amansingh
 * leetcode link: https://leetcode.com/problems/merge-strings-alternately
 *
 */


public class MergeStringsAlternately {
	
	static class Solution {
	    public String mergeAlternately(String word1, String word2) {
	        
	        char[] input1=word1.toCharArray();
	        char[] input2=word2.toCharArray();
	        StringBuffer output=new StringBuffer();
	        int i=0;
	        while(i<input1.length && i< input2.length){

	            output.append(input1[i]);
	            output.append(input2[i]);
	            i++;
	        }
	        while(i<input1.length ){

	            output.append(input1[i]);
	            i++;
	        }

	        while(i<input2.length ){

	            output.append(input2[i]);
	            i++;
	        }



	        return output.toString();


	    }
	}

	public static void main(String[] args) {
		Solution solution=new Solution();
		System.out.println(solution.mergeAlternately("abc", "pqr"));
		System.out.println(solution.mergeAlternately("abcd", "pq"));

	}

}

