package java.dsa.binarysearch;
import java.util.*;

public class findthefirstandlastindexofaelement {

	public static void main(String[] args) {
	 int[] ans= {5,6,6,6,6,7,7,7,7,7,7,7,7,8,9,10,11,12,12,14};  
      System.out.println(Arrays.toString(searchRange(ans,7)));
      }
	 public static int[] searchRange(int[] nums, int target) {
	      int ans[]=new int[]{-1,-1};
	        int st=0,end=nums.length-1;
	        while(st<=end){
	            int mid=st+(end-st)/2;
	            if(target>nums[mid]){
	                st=mid+1;
	            }else{
	                end=mid-1;
	            }
	             if(target==nums[mid]){
	                ans[0]=mid;
	             }
	        }
	        st=0;end=nums.length-1;
	        while(st<=end){
	            int mid=st+(end-st)/2;
	            if(target<nums[mid]){
	                end=mid-1;
	            }else{
	                st=mid+1;
	            }
	            if(target==nums[mid]){
	                ans[1]=mid;
	            }
	        }
	        return ans;
	    }

}
