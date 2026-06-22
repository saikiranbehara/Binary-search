
public class firstcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,5,6,9,11,12,14,16,19,20,26};
		int ans=findNum(arr,20);
		System.out.println(ans);

	}
	static int findNum(int arr[],int target) {
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
			  return mid;
		    }
		}
		
		return -1 ;
	}

}
