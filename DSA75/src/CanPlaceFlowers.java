
/**
 * 
 * @author amansingh
 * leetcode link: https://leetcode.com/problems/can-place-flowers
 *
 */


public class CanPlaceFlowers {
	static class Solution {
	    public boolean canPlaceFlowers(int[] flowerbed, int n) {
	    	 if(n==0){
	             return true;
	         }
	         if(n==1 && flowerbed.length==1){
	             return flowerbed[0]==0;
	         }
	         for(int i=0;i<flowerbed.length;i++){
	             if(flowerbed[i]==1){
	 	                 continue;
	 	             }
	 	             if(i==0   && flowerbed[i+1]!=1 ){
	 	                 n--;
	 	                 flowerbed[i]=-1;
	 	             } else if(i==flowerbed.length-1 && flowerbed[i-1]!=1 && flowerbed[i-1]!=-1){
	 	                 n--;
	 	                 flowerbed[i]=-1;
	 	             }else if(i>0 && i<flowerbed.length-1 && flowerbed[i-1]!=-1 && flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
	 	                 n--;
	                      flowerbed[i]=-1;
	 	             }

	 	             if(n==0){
	 	                 break;
	 	             }
	         }

	         return n==0;
	    }
	}

	public static void main(String[] args) {
		Solution solution=new Solution();
		System.out.println(solution.canPlaceFlowers(new int[] {1,0,0,0,1}, 1));
		System.out.println(solution.canPlaceFlowers(new int[] {1,0,0,0,1}, 2));
		System.out.println(solution.canPlaceFlowers(new int[] {1,0,0,0,0,0,1}, 2));

	}

}
