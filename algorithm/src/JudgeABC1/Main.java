package JudgeABC1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
//		System.out.print(n);
		
		 if(n==1) {
			 System.out.println("A");
		 }else if (n==2){
			 System.out.println("B");
			 
		 }else {
			 System.out.print("C");
		 }
	}
}
