package jaspreet;
import java.util.ArrayList;
import java.util.*;

public class keypad {
	static String first_alpha,second_alpha;
	
	//---------------using void--------------------
		static void keypad1(int num) {
			int first = num/10;
			int second = num%10;
			
			Hashtable<Integer, String> hm = new Hashtable<Integer, String>(); 

			hm.put(2, "abc"); 
			hm.put(3, "def"); 
			hm.put(4, "ghi"); 
			hm.put(5, "jkl"); 
			hm.put(6, "mno"); 
			hm.put(7, "pqrs"); 
			hm.put(8, "tuv"); 
			hm.put(9, "wxyz"); 
			//System.out.print(hm.get(2));
			
			first_alpha = hm.get(first);
			second_alpha = hm.get(second);
			for(int i=0;i<first_alpha.length();i++) {
				for(int j=0;j<second_alpha.length() ;j++) {
					
					StringBuilder sb = new StringBuilder();
					sb. append(first_alpha.charAt(i));
					sb. append(second_alpha.charAt(j));
					System.out.print(sb + " ");
				}
			}
			
		}

		
		//-------------------------------using ArrayList-------------------
		
		static String keys [] = {" 1","!","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		static ArrayList<String> keypad2(String str){
			
			if(str.length()==0) {
				ArrayList<String> tempresult = new ArrayList<>();
				tempresult.add(" ");
				return tempresult;
				
			}
			
			char first = str.charAt(0);
			String remaining = str.substring(1);
			int index = first-'0';
			String atFirst = keys[index];
			//System.out.print(atFirst);
			ArrayList<String> result = new ArrayList<>();
			
			for(char temp: atFirst.toCharArray()) {
					ArrayList<String> tempResult = keypad2(remaining);
					for(String str1 : tempResult) {
					result.add(temp+str1);
					}			
			}
			
			return result;
		}
		public static void main(String[] args) {
			keypad1(23);
			System.out.println();
			ArrayList <String> result2 = keypad2("234");
			//System.out.println(result1);
			System.out.println();
			System.out.println(result2);
		}

}

