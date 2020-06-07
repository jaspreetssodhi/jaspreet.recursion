package jaspreet;
import java.util.ArrayList;

public class diceDemo {
	static ArrayList<String> sum0f10(int startPoint, int endPoint) {
		if(startPoint==endPoint) {
			ArrayList<String> blankStringList = new ArrayList<>();
			blankStringList.add("\n");
			return blankStringList;
			
		}
		if(startPoint>endPoint) {
			ArrayList<String> blankList = new ArrayList<>();
			return blankList;			
		}
		ArrayList<String> result = new ArrayList<>();
		for(int i=1;i<=6;i++) {
			int newStartPoint = startPoint + i;
			ArrayList<String> temp = sum0f10(newStartPoint,endPoint);
			for(String tempstr : temp)
				result.add(tempstr+i);							
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(sum0f10(0,10));

	}

}
