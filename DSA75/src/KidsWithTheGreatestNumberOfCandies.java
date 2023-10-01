import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author amansingh
 * leetcode link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
 *
 */

public class KidsWithTheGreatestNumberOfCandies {

	static class Solution {
	    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        int maxCandies=-1;
	        for(int i=0;i<candies.length;i++){
	            maxCandies=Math.max(maxCandies,candies[i]);
	        }
	        List<Boolean> output=new ArrayList<>(candies.length);
	        for(int i=0;i<candies.length;i++){
	            if(candies[i]+extraCandies>=maxCandies){
	                output.add(true);
	            }else{
	                output.add(false);
	            }
	        }
	        return output;
	    }
	}
	
	public static void main(String[] args) {
		
		Solution solution=new Solution();
		System.out.println(solution.kidsWithCandies(new int[] {2,3,5,1,3}, 3));
		
		System.out.println(solution.kidsWithCandies(new int[] {4,2,1,1,2}, 1));

		System.out.println(solution.kidsWithCandies(new int[] {12,1,12}, 10));
	}

}
