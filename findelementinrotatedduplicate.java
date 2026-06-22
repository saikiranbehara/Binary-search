
public class findelementinrotatedduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int ans[]= {2,2,2,2,2,9,2,2};
      System.out.println(findpivot(ans));
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
			  if(arr[start]==arr[mid]&&arr[end]==arr[mid]) {
				  if(arr[start]>arr[start+1]) {
					  return start;
				  }
				  start++;
			      if(arr[end]<arr[end-1]) {
					  return end-1;
			      }
				   end--;
			  }
			  else if(arr[start]<arr[mid]||arr[start]==arr[mid]&&arr[mid]>arr[end]) {
				  start=mid+1;
			  }else {
				 end=mid-1; 
			  }
				  
		 }
		 return -1;
	}
}

