package jaspreet;

public class findInArray {
	static boolean search(int arr[], int index, int element)
	{
		if(index == arr.length-1) {
			return false;
		}
		if(arr[index]==element) {
			return true;
		}
		return(search(arr,index+1,element));
	}
	public static void main(String args[])
	{	int arr[] = {23,45,35,65,67};
		System.out.print(search(arr,0,35)?"Element Found":"Not Found");
	}
}
