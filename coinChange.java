package jaspreet;

public class coinChange {
	static void coins(int []c, int amount, String result,int lastIndex) {
		if(amount == 0) {
			System.out.println(result);
			//System.out.println();
			return;
		}
		for(int i = lastIndex ;i<c.length;i++) {
			if(amount>=c[i]) {
				coins(c,amount-c[i],result + c[i],i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[] = {2,3,5,6};
		coins(c, 10, " ",0);
	}

}
