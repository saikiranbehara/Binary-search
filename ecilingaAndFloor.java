
public class ecilingaAndFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {2,3,5,9,14,16,18};
         int t1=8;
         System.out.println(findceiling(arr,t1));
         System.out.println(findFloor(arr,t1));
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
	static int findceiling(int arr[],int target ) {
		   int start=0;
			int end=arr.length-1;
			//int mid=first+(first+end)/2;
			while(start<=end) {
				int mid=start+(end-start)/2;
				
			    if(target<arr[mid]) { 
				      end=mid-1;
			    } else if(target>arr[mid]) {
				     start=mid+1;
			    } else { 
				  return arr[mid];
			    }
			}
			return arr[start];
	   }

}
