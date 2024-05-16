package learningjavabasics;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int i = 1;
//		
//		while(i<=10) { //1<=10 T, 2<=10 T, 3<=10 T, 4 
//			System.out.println("Value of i: "+ i);
//			i++; //2 , 3
//		}
//	



	// Print a series -> starting from 1 till 10
	// display 1 2 3 4 5 6 7 8 9 10
	
	int i = 11;
	System.out.println("While Loop");
	while(i<=11) { //1<=10 T, 2<=10 T, 3<=10 T, 4 
		System.out.println("Value of i: "+ i);
		i++; //2 , 3
	}

	System.out.println("Do While Loop");
	i = 1;
	// in do - while loop all the statments in the do block is executed atleast 1 time
	do {
		System.out.println("Value of i: "+ i);
		i++; 
	} while (i <= 10);


	
int l = 1 ;
while (l<=10) { //1<=10 T, 2<=10 T... 5<=10T
	
	if(l==5) { //1==5 F, 5==5 T
		System.out.println("Break condition reached value of l is now: "+l);
		break;
	}

	System.out.println("Value of I is: "+l);
	l= l+1; //2 3  i++ == i= i+1 
}

System.out.print("Out of While Loop");




int t= 1;
while (t <= 10) { //1<=10 T 2<=10 T 3<=10 T 4<=10 T
	if (t == 3) { //1==3 F 2==3 F 3==3 T 4==4 F
		System.out.println("I will skip below code when I get executed for t = 3");
		t++ ;
		continue;	
	}
	System.out.println("value of t "+ t);
	t++;
}
	}
}



