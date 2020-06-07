package jaspreet;

public class reverseTriange {
	static int printGen(int n, char strtype) {
		if(n==0) {
			if(strtype=='*')
				System.out.println();
			return 0;
		}
		if(strtype == '*') {
			System.out.print('*');
		}
		if(strtype=='\t') {
			System.out.print(" ");
		}
		return printGen(n-1,strtype);
	}
	static int printPattern(int line, int n,int m) {
		if(n>line) {
			return 0;
		}
		printGen(n,'*');
		printGen(m,'\t');
		return printPattern(line,n+1,m-1);
	}
	public static void main(String args[]) {
		printPattern(5,0,5);
	}
}
