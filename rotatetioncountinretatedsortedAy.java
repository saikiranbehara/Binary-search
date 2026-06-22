
public class rotatetioncountinretatedsortedAy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int ans[]= {2,3,4,5,6,7,8,9,12,33,44,55,64};
   System.out.println(findpivot(ans));
	}
	static int findcount(int arr[]) {
		int pivot=findpivot(arr);
		  return pivot+2;
	}
	static int findpivot(int arr[] ) {
		  int start=0;
		  int end=arr.length-1;
		 while(start<=end) {
			 int mid=start+(end-start)/2;
			 if(mid<end&&arr[mid]>arr[mid+1]) 
				   return mid;
		      if(mid>start&&arr[mid]<arr[mid-1]) 
					 return mid-1;
			  if(arr[mid]<arr[start]) 
					 end=mid-1;
			  if (arr[mid]>arr[start])
					 start=mid+1;
			 
		 }
		 return -1;
		 }
}
	/*static int findrotation(int arr[]) {
		int start =0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid]<arr[mid-1]&&start!=mid)
				 return mid;
			if(arr[mid]>arr[end])
				start=mid+1;
			if(arr[mid]<arr[end])
				end=mid-1;
		}
		return start;
	}*/


