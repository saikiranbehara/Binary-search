package library;

import java.util.Arrays;

public class smallestdivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr= {44,22,33,11,1}; 
         int t=5;
         System.out.println(smallestDivisor(arr,t));
         
	}
	 public static int smallestDivisor(int[] nums, int threshold) {
		 int start=1,end=Integer.MIN_VALUE;
         for(int n:nums) {
        	 end=Math.max(end,n);
         }
         while(start<=end) {
        	 int mid=start+(end-start)/2;
        	 int sum=sum(nums,mid);
        	 if(sum<=threshold) {
        		 return mid;
        	 }else {
        		 start=mid+1;
        	 }
         }
         return -1;
	}
   public static int sum(int arr[],int mid) {
	   int sumofarr=0;
	   for(int n:arr) {
		   sumofarr+=(n+mid-1)/mid;
	   }
	   return sumofarr;
   }
}

