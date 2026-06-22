package library;

import java.util.Arrays;

public class booleanmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans[][]= {{10,20,30,40,50},{15,25,35,45,55},{16,26,36,46,56},{18,28,38,48,58},{19,29,39,49,59}};
		System.out.print(searchMatrix(ans,55));
		
	}
	 public static boolean searchMatrix(int[][] matrix, int target) {
		 int row=0,column=matrix[0].length-1;
		 while(row<matrix.length&&column>=0) {
			 if(matrix[row][column]==target) {
				 return true;
			 }if(matrix[row][column]<target) {
				 row++;
			 }else {
				 column--;
			 }
		 }
		 return false;
	 }

}
