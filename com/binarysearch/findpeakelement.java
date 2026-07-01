package com.binarysearch;

public class findpeakelement {

	public static void main(String[] args) {
	int ans[]= {2,4,5,6,7,8,9,10,13,13,3,1,0};	
	System.out.println(peakelement(ans));

	}
public static int peakelement(int nums[]) {
	int start=0,end=nums.length-1;
	while(start<end) {
		int mid=start+(end-start)/2;
		if(nums[mid]>nums[mid+1]) {
			end=mid;
		}else {
			start=mid+1;
		}
	}
	return start;
}
}
