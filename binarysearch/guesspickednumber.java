package binarysearch;

public class guesspickednumber extends GuessGame{
	public int guessNumber(int n) {
        int start=1,end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            int correctpick=guess(mid);
            if(correctpick==0){
                return mid;
            }else if(correctpick==1){
                   start=mid+1;
            }else{
                  end=mid-1;
            }
        }
        return -1;
        
    }
}
