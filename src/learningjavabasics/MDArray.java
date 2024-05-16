package learningjavabasics;
import java.util.Scanner;
public class MDArray {

	public static void main(String[] args) {
	
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of Columns: ");
		int columns = sc.nextInt();
	
		int [][] arrayVar = new int[rows][columns];
		
		System.out.println("Eneter the elments of the array");
		for(int i = 0; i< rows ; i++) {    //i=0                               // i = 1
			for(int j = 0; j< columns ; j++) { // i = 0 -> j =0 j=1 j=2           // i=1 -> j=0 j=1 j=2
				arrayVar[i][j] = sc.nextInt();  //arrayvar[0][0] = 1 //arrayvar[0][1]=2 //arrayvar[0][2] =3
			}										//	arrayvar[1][0] = 4  //arrayvar[1][1]=5 //arrayvar[1][2] =5
		}											//	arrayvar[2][0] = 7  //arrayvar[2][1]=8 //arrayvar[2][2] =9
		// display the array:
		for(int i = 0; i< rows ; i++) {
			for(int j = 0; j< columns ; j++) {
				System.out.println("Row value : "+ i +" Column value: "+ j + " Element at this index :" + arrayVar[i][j]);
				
				
			}
		}
		sc.close();
	}

}
