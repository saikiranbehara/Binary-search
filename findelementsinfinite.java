
public class findelementsinfinite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int ans[]= {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
       System.out.println(findingRange(ans,10));
	}
	static int findinfinite(int arr[],int target,int start,int end) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			
		    if(target<arr[mid]) { 
			      end=mid-1;
		    } else if(target>arr[mid]) {
			     start=mid+1;
		    } else { 
			  return mid;
		    }
		}
		return -1;
	} 
	static int findingRange(int nums[],int target) {
		int start=0;
		int end=1;
		while(target>nums[end]) {
			int newstart=end+1;
			end=(end+(end-start+1)*2);
			start=newstart;
		}
		return findinfinite( nums,target,start,end);
	}

}
