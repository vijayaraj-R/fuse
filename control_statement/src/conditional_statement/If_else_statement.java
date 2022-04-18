package conditional_statement;

import java.util.Scanner;

public class If_else_statement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b)
			{
			System.out.println("condition is succeed");
			}
		else {
			System.out.println("condition is failed");
		}

	}

}
