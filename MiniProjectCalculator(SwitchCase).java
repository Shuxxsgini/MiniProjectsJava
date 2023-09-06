import java.util.*;
public class MiniProject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("                M E N U               ");
		System.out.println("--------------------------------------");
		System.out.println("1. Calulator");
		System.out.println("2. Finder");
		System.out.println("3. Greater");
		System.out.println("4. Exit");
		System.out.println("--------------------------------------");
		System.out.print("Choice [1-4] : ");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			int calculation;
			int num1,num2,add,sub,pro,div;
			System.out.println("--------------------------------------");
			System.out.println("        C A L C U L A T O R           ");
			System.out.println("--------------------------------------");
			System.out.println("11. Addition");
			System.out.println("12. Subtraction");
			System.out.println("13. Product");
			System.out.println("14. Division");
			System.out.println("15.. Exit");
			System.out.println("--------------------------------------");
			System.out.print("Choice [1-4] : ");
		    calculation=sc.nextInt();
		   
			
			System.out.println("Enter 1st Number:");
			System.out.println("Enter 2nd Number: ");
			num1=sc.nextInt();
			num2=sc.nextInt();
			add=num1+num2;
			sub=num1-num2;
			pro=num1*num2;
			div=num1/num2;
			
			switch(calculation)
			{
			case 11:
				System.out.println("Sum of the number is= "+ add);
				System.out.println("THANK YOU :)");
			break;
			case 12:
				System.out.println("Diffrence of the number is= "+sub);
				System.out.println("THANK YOU :)");
			break;
			case 13:
				System.out.println("Product of the number is= "+pro);
				System.out.println("THANK YOU :)");
			break;
			case 14:
				System.out.println("Division of the number is= "+div);
				System.out.println("THANK YOU :)");
			break;
			case 15:
				System.out.println("Bye");
				System.out.println("THANK YOU :)");
			break;	
			
			default:
				System.out.println("Invalid Input");
				System.out.println("THANK YOU :)");
			
			}
			break;
			
		case 2:
			       int finder;
			System.out.println("--------------------------------------");
			System.out.println("   AMONGST WHICH YOU WANT TO FIND     ");
			System.out.println("--------------------------------------");
			System.out.println("21. Age finder: ");
			System.out.println("22. Weight finder: ");
			 finder=sc.nextInt();
			 
			 switch(finder)
			 {
			 case 21:
				 int age;
					System.out.print("Eneter your age=");
					age=sc.nextInt();
					if(age>18)
					{
						System.out.println("Person is ADULT");
						System.out.println("THANK YOU :)");
					}
					else
					{
						System.out.println("Person is MINOR");
						System.out.println("THANK YOU :)");
					}
				break;
					
			 case 22:
				 int w;
				 System.out.print("Enter your weight[in kgs]=");
				 w=sc.nextInt();
				 if(w>70)
				 {
					System.out.println("You are OVERWEIGHT."); 
					System.out.println("THANK YOU :)");
				 }
				 else if(w<40)
				 {
					 System.out.println("You are UNDERWEIGHT.");
					 System.out.println("THANK YOU :)");
				 }
				 else
				 {
					 System.out.println("You are NORMALWEIGHT.");
					 System.out.println("THANK YOU :)");
				 }
			 default:
					System.out.println("Invalid Input");
					System.out.println("THANK YOU :)");
				 
				 
			 }
			 break;
			
			
			case 3:
			int greatest;
			System.out.println("--------------------------------------");
			System.out.println("   AMONGST WHICH YOU WANT TO FIND     ");
			System.out.println("--------------------------------------");
			System.out.println("41. Greatest between 2 numbers: ");
			System.out.println("42. Greatest between 3 numbers: ");
			           greatest=sc.nextInt();
			            
			    switch(greatest)
			    {
			    case 31:
			    	int a,b;
					System.out.print("Enter Number 1= ");
			        a=sc.nextInt();
			        System.out.print("Enter Number 2= ");
			        b=sc.nextInt();
			        
			        if(a>b) {
			        	System.out.println("Greater is= "+ a);
			        	System.out.println("THANK YOU :)");
			        }
			        else {
			        	System.out.println("Greater is= "+ b);
			        	System.out.println("THANK YOU :)");
			        }
			        
			      break;
			    case 32:
			    
					int x , y , z;
					System.out.print("Enter num1: ");
			        x=sc.nextInt();
			        System.out.print("Enter num2: ");
			        y=sc.nextInt();
			        System.out.print("Enter num3: ");
			        z=sc.nextInt();
			        
			        if(x>y) {
			        	if (x>z)
			        	{
			        		System.out.println("Greater is= "+x);
			        		System.out.println("THANK YOU :)");
			            	
			        	}
			        	else 
			        	{
			        		System.out.println("Greater is= "+z);
			        		System.out.println("THANK YOU :)");
			        	}
			        	
			        	
			        }
			        else if (y>z)
			        {
			        	System.out.println("Greatest is= "+y);
			        	System.out.println("THANK YOU :)");
			        }
			        else if(y>z)
			        {
			        	System.out.println("Greater is= "+z);
			        	System.out.println("THANK YOU :)");
			        }
			        else 
			        {
			        	System.out.println("Greatest is= "+z);
			        	System.out.println("THANK YOU :)");
			        }
			    }
			    break;
		case 4:
				
		{
			System.out.println("EXIT");
			System.out.println("THANK YOU :)");
		}
		break;
		default:
			System.out.println("Invalid Input");
			System.out.println("THANK YOU :)");
		
		
		}
		sc.close();
	}

}
