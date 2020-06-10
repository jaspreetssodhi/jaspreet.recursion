package jaspreet;

public class ratVoidMaze {
	static void rat(int x, int y, String result) {
		if(x==2 && y==2) {
			System.out.println(result);
			return;
		}
		if(x>2 || y>2) {
			return;
		}
		int x1= x+1;
		rat(x1,y,result+'H');
		int y1= y+1;
		rat(x,y1,result+'V');
		rat(x1,y1,result+'D');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rat(0,0," ");
	}

}
