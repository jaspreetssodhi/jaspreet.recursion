package jaspreet;
import java.util.ArrayList;

public class bracket {
	//---------------------using ArrayList----------------------
	static void bracket_pattern1(char str[], int n, int open , int close ,int pos) {
		if(close ==  n && open==n) {
			for(int i=0;i<2*n;i++) {
				System.out.print(str[i]);
			}
			//ArrayList<String> resultTemp = new ArrayList<String>();
			//resultTemp.add(" ");
			System.out.println();
			//return resultTemp;
		}
		//ArrayList<String> result = new ArrayList<String>();
		if(open<n) {
			//ArrayList<String> temp = bracket_pattern(str,n,open+1,close,pos+1);
			//for(String tempstr : temp)
				//result.add(tempstr+'(');		
			str[pos] = '(';
			bracket_pattern(str,n,open+1,close,pos+1);
			//result.add("(");
			
		}
		if(close<open) {
			//ArrayList<String> temp1 = bracket_pattern(str,n,open,close+1,pos+1);
			//for(String tempstr : temp1)
				//result.add(tempstr+')');	
			str[pos] = ')';
			bracket_pattern(str,n,open,close+1,pos+1);
			//result.add(")");
			
		}
		//return result;
		
	}
	
	//---------------using void--------------
	static void bracket_pattern(ArrayList<String> result,char str[], int n, int open , int close ,int pos) {
		if(close ==  n && open==n) {
			for(int i=0;i<2*n;i++) {
				System.out.print(str[i]);
			}
			System.out.println();
		}
		if(open<n) {
			str[pos] = '(';
			result.add("(");
			bracket_pattern(result, str,n,open+1,close,pos+1);
			
		}
		if(close<open) {
			str[pos] = ')';
			result.add(")");
			bracket_pattern(result, str,n,open,close+1,pos+1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		char str[] =  new char[2*n];
		ArrayList<String> result = new ArrayList<String>();
		bracket_pattern(result,str,n,0,0,0);
	}

}
