package library;

import java.util.Arrays;

//import java.util.*;

public class findtargetinmatrix {
	public static void main(String args[]) {
		int ans[][]= {{10,20,30,40,50},
				      {15,25,35,45,55},
				      {16,26,36,46,56},
				      {18,28,38,48,58},
				      {19,29,39,49,59}};
		System.out.print(Arrays.toString(matrix(ans,55)));
		
	}
  static int[] matrix(int nums[][],int target) {
	int row=0;
	int column=nums.length-1;
	while(row<nums.length&&column>=0) {
		if(nums[row][column]==target)
			return new int[] {row,column};
		if( nums[row][column]<target) {
			row++;
		}else {
			
			column--;
		}
	}
	return new int[] {-1,-1};
}
}

