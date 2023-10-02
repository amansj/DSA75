
/**
 * 
 * @author amansingh
 * leetcode link: https://leetcode.com/problems/reverse-vowels-of-a-string
 *
 */

public class ReverseVowelsOfAString {
	
	static class Solution {
	    public String reverseVowels(String s) {
	        char[] charArray=s.toCharArray();
	        for(int i=0,j=charArray.length-1;i<j;){
	            boolean isVowelI=isVowel(charArray[i]);
	            boolean isVowelJ=isVowel(charArray[j]);
	            if(!isVowelI){
	                i++;
	            }
	            if(!isVowelJ){
	                j--;
	            }
	            if(isVowelJ && isVowelI){
	                char temp=charArray[i];
	                charArray[i]=charArray[j];
	                charArray[j]=temp;
	                i++;
	                j--;
	                
	            }
	        }
	        
	        return String.valueOf(charArray);
	        
	    }
	    public boolean isVowel(char input){
	        return input=='a'||input=='e'||input=='i'||input=='o'||input=='u'||input=='A'||input=='E'||input=='I'||input=='O'||input=='U';
	    }
	}

	public static void main(String[] args) {
		Solution solution=new Solution();
		
		System.out.println(solution.reverseVowels("hello"));
		System.out.println(solution.reverseVowels("leetcode"));
		

	}

}
