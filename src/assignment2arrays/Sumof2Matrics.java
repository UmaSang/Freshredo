//Add two matrices using 2-dimensional array

package assignment2arrays;

public class Sumof2Matrics {
	int a[][],b[][];
	public static void main(String[] args) {
	
		int a[][]= {{30,80}};
		int b[][]= {{70,90}};
		for (int i=0;i<1;i++) {
			for(int j=0;j<1;j++) {
			int	sum=a[i][j]+b[i][j];
			System.out.println("The sum of 1st matrics:"+sum);
				
			}
		}
		for (int i=0;i<2;i++) {
			for(int j=1;j<2;j++) {
			int	sum=a[i][j]+b[i][j];
			System.out.println("The sum of 2nd matrics:"+sum);
				
	}

}
		
	}
	
}
