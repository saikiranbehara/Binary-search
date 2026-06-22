package library;

import java.util.Arrays;

public class searchinsortedmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans[][]= {{1,2,3,4,5},
			         {6,7,8,9,10},
			       {11,12,13,14,15},
			       {16,17,18,19,20},
			       {21,22,23,24,25}};
	System.out.println(Arrays.toString(searchSort(ans,8)));
	}
	static int []findbinary(int matrix[][],int target, int row,int cstart,int cend){
			while(cstart<=cend) {
				int mid =cstart+(cend-cstart)/2;
				if(matrix[row][mid]==target)
					return new int[] {row,mid};
				else if(target<matrix[row][mid]) 
				   cend=mid-1;
			    else 
			    	cstart=mid+1;
			
		}
			return new int [] {-1,-1};
		
	}
    static int[] searchSort(int matrix[][],int target) {
    	int column=matrix[0].length;
    	int row=matrix.length;
    	if(row==1) {
    		findbinary(matrix,target,0,0,column-1);
    	}
    	
    	   int rstart=0;
    	   int rend=row-1;
    	   int cmid=column/2;
    	 while(rstart<(rend-1)){
    		 int mid=rstart+(rend-rstart)/2;
    		if(target==matrix[mid][cmid]) {
    			return new int[] {mid,cmid};
    		}
    		if(target<matrix[mid][cmid]) {
    			     rend=mid;
    		}else {
    			rstart=mid+1;
    		}
    		
    	} 
    	 if(matrix[rstart][cmid]==target) {
   			return new int[] {rstart,cmid};
     	 }
     	 
   		if(matrix[rstart+1][cmid]==target) { 
   			return new int[] {rstart+1,cmid};
   		}
    	 if(target<=matrix[rstart][cmid-1]) {
         	return findbinary(matrix,target,rstart,0,column-1);
    	 }
    	 if(target>=matrix[rstart][cmid+1]&&target<=matrix[rstart][column-1]) {
         	 return findbinary(matrix,target,rstart,cmid+1,column-1);
         	}
    	 if(target<=matrix[rstart+1][cmid-1]) {
         	 return findbinary(matrix,target,rstart+1,0,column-1);
    	 }else {
            return findbinary(matrix,target,rstart+1,cmid+1,column-1);
    	 }
    	 
    }
}
