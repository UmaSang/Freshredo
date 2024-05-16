
package assignment2arrays;

public class DuplicateinArray {

	public static void main(String[] args) {
	int arr[]= new int[] {9,7,5,7,4,2,1};
	System.out.println("Duplicate element in given array:");
	for (int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
			}
		}
	}
	}

}
