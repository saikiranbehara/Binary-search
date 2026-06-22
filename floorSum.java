
public class floorSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,9,14,15,16};
		int t=8;
		System.out.println(findFloor(arr,t));

	}
	static int findFloor(int []nums,int target) {
		int start=0,end=nums.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target>nums[mid])
				start=mid+1;
			else if(target<nums[mid])
				end=mid-1;
			else 
				return nums[mid];
		}
		return nums[end];
		
	} 

}
