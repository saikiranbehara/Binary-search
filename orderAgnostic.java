import java.util.*;
public class orderAgnostic {

	public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	for(int i=0;i<10;i++) {
		arr[i]=(int)(Math.random()*10);
	}
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
     System.out.println(agnostic(arr,5));
	}
     static int agnostic(int arr[],int target) {
    	 int start =0;
    	 int end=arr.length-1;
    	 boolean ans=arr[start]<arr[end];
    		 while(start<=end) {
    			 int mid =start+(end-start)/2;
    			 if(arr[mid]==target)
    				 return mid;
    			 
    			 if(ans) {
    				 if(target<arr[mid]) {
    					 end=mid-1;
    				 }else {
    					 start=mid+1;
    					 }
    				 
    			 }else {
    				 if(target>arr[mid]) {
    					 end=mid-1;
    				 } else {
    					 start=mid+1;
    				 }
    			 }
    	 }
    	 return -1;
     }
}
