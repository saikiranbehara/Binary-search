
public class splittheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int ans[]= {8,4,6,7,9,11,12};
       System.out.println(splitArray(ans,2));
	}
     static  int splitArray(int[] nums, int k) {
	      int start=0;
	      int end=0;
	      for(int n:nums) {
	    	  start=Math.max(start,n);
	    	  end+=n;
	      }
	      while(start<end) {
	    	  int mid =start+(end-start)/2;
	    	  int sum=0;
	    	  int pieces=1;
	    	  for(int num:nums) {
	    		  if(sum+num>mid) {
	    			  sum=num;
	    			  pieces++;
	    		  }else {
	    			  sum+=num;
	    		  }
	    			  
	    	  }
	    	  if(pieces>k)
	    		  start=mid+1;
	    	  else
	    		  end=mid;
	      }
	      return start;
        
    }


}
