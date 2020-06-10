package jaspreet;

public class sudoku {
	static int board[][] =
					        {{5,3,0,0,7,0,0,0,0},
					        {6,0,0,1,9,5,0,0,0},
					        {0,9,8,0,0,0,0,6,0},
					        {8,0,0,0,6,0,0,0,3},
					        {4,0,0,8,0,3,0,0,1},
					        {7,0,0,0,2,0,0,0,6},
					        {0,6,0,0,0,0,2,8,0},
					        {0,0,0,4,1,9,0,0,5},
					        {0,0,0,0,8,0,0,7,9}};
	static void print() {
		for(int i = 0 ; i<board.length; i++) {
			for(int j = 0; j<board[i].length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static int max_length = board.length;
	static boolean inRow(int row, int data){
		for(int col=0;col<max_length;col++) {
			if(board[row][col]==data) {
				return true;
				}
			}
		return false;
		}
	
	static boolean inCol(int col, int data){
		for(int row=0;row<max_length;row++) {
			if(board[row][col]==data) {
				return true;
				}
			}
		return false;
		}
	
	static boolean inSubGrid(int row,int col, int data){
		int r = row - row %3;
		int c = col - col %3;
		for(int i = r ; i<r + 3 ; i++) {
			for(int j = c ; j<c + 3; j++) {
				if(board[i][j]==data) {
					return true;
				}
			}
		}
		return false;
		}
	
	static boolean isPossible(int row, int col, int data) {
		return !inRow(row,data) && !inCol(col,data) && !inSubGrid(row,col,data);
	}
	static boolean sudokuComplete(int currentRow,int col) {
		
		if(currentRow==board.length)
		{	print();
			return true;
		}
		if(col==8)
		{	currentRow = currentRow+1;
			col=0;
		}
		if(board[currentRow][col]!=0)
		{sudokuComplete(currentRow,col+1);
		}
		for(int i=1;i<=9;i++)
			{	
				if(isPossible(currentRow,col,i)) {
					board[currentRow][col] = i;
					boolean result = sudokuComplete(currentRow,col+1);
					if(result) 
					{
						return true;
					}
					board[currentRow][col] = 0;
				}			
			}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = sudokuComplete(0,0)?"Complete":"Not Complete";
		System.out.println(result);
	}
}
