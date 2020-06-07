package jaspreet;

public class nQueen {
	static boolean isQueenPlace(boolean [][]board, int row, int col) {
		// Case - 1 Check Above the Row
		for(int i = row ; i>=0; i--) {
			if(board[i][col]) {
				return false;
			}
		}
		// Case - 2 Check the Left Diagonal
		for(int i = row, j= col; i>=0 && j>=0 ;i--,j--) {
			if(board[i][j]) {
				return false;
			}
		}
		// Case -3 Check the Right Diagonal
		for(int i = row, j= col; i>=0 && j<board.length ;i--,j++) {
			if(board[i][j]) {
				return false;
			}
		}
		return true;
	}

	
	static int getCount(boolean board[][]) {
		int countDown = 0;
		System.out.println();
		for(int row = 0; row<board.length; row++) {
		for(int col = 0; col<board[row].length; col++) {
			System.out.print(board[row][col]+"\t");
			if(board[row][col]) {
				countDown++;
		}
		}
		System.out.println();
		
	}
		System.out.println();
		return countDown;
	}
	
	static void countQueens(boolean [][]board, int currentRow) {
		
		if(currentRow==board.length) {
			
			System.out.println("Total Queen Placed "+getCount(board));
			return ;
		}
		for(int col = 0 ; col<board[currentRow].length; col++) {
			if(isQueenPlace(board, currentRow, col)) {
				board[currentRow][col] = true; // Queen is Placed
				countQueens(board, currentRow+1);
				
				// after fall 
				board[currentRow][col] = false ; // Queen UnPlace
				
			}
			}
		
		
	}
	/*

	
	static void countQueens(boolean [][] board, int currentRow) {
		
		if(currentRow==board.length) {		
			
			System.out.println("Total Queen Placed "+getCount(board));
			return ;
		}
		for(int col = 0 ; col<board[currentRow].length; col++) {
			if(isQueenPlaced(board, currentRow, col)) {
				board[currentRow][col] = true; // Queen is Placed
				countQueens(board, currentRow+1);
				
				// after fall 
				board[currentRow][col] = false ; // Queen UnPlace
				
			}
			}
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[][] = new boolean[4][4];
		countQueens(board, 0);

	}

}
