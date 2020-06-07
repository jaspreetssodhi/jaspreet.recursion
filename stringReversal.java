package jaspreet;

public class stringReversal {
	static String reverseString(String str) {
		if(str.length()==1) {
			return String.valueOf(str.charAt(0));
		}
		return(reverseString(str.substring(1))) + str.charAt(0);
	}
	public static void main(String args[]) {
		System.out.print(reverseString("tom"));
	}
}
