
public class ceilingsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,9,14,16,18};
		int ans=findceiling(arr,15);
		System.out.println(ans);

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
