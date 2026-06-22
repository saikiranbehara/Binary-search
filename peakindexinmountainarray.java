
public class peakindexinmountainarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,3,6,7,8,9,10,15,6,5,4,3,2,0};
		System.out.println(peakIndex(arr));

	}
	static int peakIndex(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
				end=mid;
			else 
				start=mid+1;
				
		}
		return start;
	} 

}
