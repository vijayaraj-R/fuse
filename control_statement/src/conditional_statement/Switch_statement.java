package conditional_statement;
import java.util.*;

public class Switch_statement {    // Main class
	public static void main(String[] args) {
		Scanner smc=new Scanner(System.in); 
		System.out.println("             ***** Hotal Menu *****");
		
	
			  System.out.println("                  1.Parota---------------10");
			  System.out.println("                  2.Chapathi-------------10"); 
			  System.out.println("                  3.Fried-Rice-----------60");
			  System.out.println("                  4.Chicken-Noodles------80");
			  System.out.println("                  5.Mutton-Biriyani------150");
			  System.out.println("                  6.Chicken-Biriyani-----130");
				
			  System.out.println("----------------------------------------------:");		
		System.out.println("Enter Menu NO:");int Menu=smc.nextInt();
		
		switch(Menu)
		{
		case 1:
			   System.out.println("    Parota is Ordered");
			   System.out.println("                                 ");
			   System.out.println("    Enter How many PAROTA you need?  ");
			   int PR=smc.nextInt();	
			   PR=PR*10;
			   System.out.println("    OK  Done");
			   System.out.println("                                 ");
			   System.out.println("   This is your Bill:  "+PR);
			   break;
		case 2:
			   System.out.println("Chapathi is Ordered");
			   System.out.println("                                 ");
			   System.out.println("    Enter How many CHAPATHI you need?  ");
			   int CH=smc.nextInt();	
			   CH=CH*10;
			   System.out.println("    OK  Done");
			   System.out.println("                                 ");
			   System.out.println("   This is your Bill:  "+CH);
			   break;
		case 3:
			   System.out.println("Fried-Rice is Ordered");
			   System.out.println("                                 ");
			   System.out.println("    Enter How many PLATES you need?  ");
			   int FR=smc.nextInt();
			   FR=FR*60;
			   System.out.println("    OK  Done");
			   System.out.println("                                 ");
			   System.out.println("   This is your Bill:  "+FR);
			   break;
		case 4:
			   System.out.println("Chicken-Noodles is Ordered");
			   System.out.println("                                 ");
			   System.out.println("    Enter How many PLATES you need?  ");
			   int CN=smc.nextInt();			   
			   CN=CN*80;
			   System.out.println("    OK  Done");
			   System.out.println("                                 ");
			   System.out.println("   This is your Bill:  "+CN);
			   break;
		case 5:
			   System.out.println("Mutton-Biriyani is Ordered");
			   System.out.println("                                 ");
			   System.out.println("    Enter How many PLATES you need?  ");
			   int MB=smc.nextInt();
			   MB=MB*150;
			   System.out.println("    OK  Done");
			   System.out.println("                                 ");
			   System.out.println("   This is your Bill:  "+MB);
			   break;
		case 6:
			   System.out.println("Chicken-Biriyani is Ordered");
			   System.out.println("                                 ");
			   System.out.println("    Enter How many PLATES you need?  ");
			   int CB=smc.nextInt();			   
			   CB=CB*130;
			   System.out.println("    OK  Done");
			   System.out.println("                                 ");
			   System.out.println("   This is your Bill:  "+CB);
			   break;
	   default:
		   System.out.println("  Number "+Menu+" is not valid");
		   System.out.println("                                 ");
		   System.out.println(" Try Again");
		}
     
		
	}

}
