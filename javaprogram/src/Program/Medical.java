package Program;
import java.util.Scanner;

public class Medical {
	
	int combi=5,paracetmol=10,multivit=5;
	int Result;
	
	Scanner sc=new Scanner(System.in);
	
	void Bill() {
		
		char option ='\0';
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\t\t\t***WelCome***\t\t\t");
		System.out.println("A. Combiflam ");
		System.out.println("B. Multivitamine ");
		System.out.println("C. Paracetmol ");
		System.out.println("D. Return ");
		System.out.println("E. Exit ");
		
		
		do {
			System.out.println("***************************************");
			System.out.println(" Enter an Option");
			System.out.println("---------------------------------------");
			option = sc.next().charAt(0);
			System.out.println("\n");
		
		switch(option) {
		
		case A:
		}
		}while(option != 'E');
			
	}

}
