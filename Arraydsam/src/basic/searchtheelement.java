package basic;

public class searchtheelement {
	public static void main(String[] args) {
	
	//serach the elementx in the array
	int[] arr = {1,2,3,5,7,89};
	int x = 2;
	int ans =0;
	for (int j = 0; j < arr.length; j++) {
		if (arr[j] == x) {
			ans = j;
			System.out.println(ans);
			}
			}
	}
	
	

}