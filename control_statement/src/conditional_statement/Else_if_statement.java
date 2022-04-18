
// Find who is older of three persons
package conditional_statement;

import java.util.Scanner;

public class Else_if_statement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person1 age :");
		int a=sc.nextInt();
		System.out.println("Enter person2 age :");
		int b=sc.nextInt();
		System.out.println("Enter person3 age :");
		int c=sc.nextInt();
		if(a>b)
			{
			System.out.println("-----$$ Person `1 is Older $$-----");
			}
		else if(a>c) {
			System.out.println("-----$$ Person 2 is Older $$-----");
		}
         else {
        	 System.out.println("-----$$ Person 3 is Older $$-----");
         }
	}

}
