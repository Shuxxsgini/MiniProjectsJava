import java.util.*;
public class MiniProjectMethod
   {
void GreatestNumber(int a,int b,int c)
	
	{
	
    
    if(a>b) {
    	if (a>c)
    	{
    		System.out.println("Greater is= "+a);
        	
    	}
    	else 
    	{
    		System.out.println("Greater is= "+c);
    	}
    	
    	
    }
    else if (b>c)
    {
    	System.out.println("Greatest is= "+b);
    }
    else if(b>c)
    {
    	System.out.println("Greater is= "+c);
    }
    else 
    {
    	System.out.println("Greatest is= "+c);
    }
 }

void SecondGreatest(int a,int b,int c)

{

	if(a>b)
	{
		if(a>c)
		{
			if(a>c)
			{
				System.out.println("Greater is ="+c);
			}
			else
			{
				System.out.println(" Greater is ="+a);
			}
		
		if(b>a)
		{
			 if(b>c)
			 {
				 System.out.println("  Greater is= "+c);
			 }
			
		
		else 
		{
			System.out.println(" Greater is ="+b);
		}
		
	}

		if(c>a) 
		{
			if(c>b)
			{
				System.out.println("Greater is = "+b);
			}
			else
			{
				System.out.println("Greater is = "+c);
			}
		
		
			
		}
		
		}
	}
}

     void LowestNumber(int a,int b,int c)
    {
    	 if(a<b) {
         	if (a<c)
         	{
         		System.out.println("Lowest is= "+a);
             }
         	else 
         	{
         		System.out.println("Lowest is= "+c);
         	}
         }
         	else if(b<c)
         	{
         		System.out.println("Lowest is= "+b);
         	}
         	 else
         	 {
         		 System.out.println("Lowest is= "+c);
         	 }
     }
		

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int choice;
		System.out.println("------------------------");
		System.out.println("         M E N U        ");
		System.out.println("------------------------");
		System.out.println("   Enter Your choice:   ");
		System.out.println("1. Greatest of 3 Numbers.    ");
		System.out.println("2. Second Greatest of 3 Numbers. ");
		System.out.println("3. Lowest of 3 Numbers.  ");
		System.out.println("4.Exit");
		System.out.print("Choice [1-4] : ");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			MiniProjectMethod obj=new MiniProjectMethod();
			int num1,num2,num3;
			System.out.print("Enter 1st Number :");
			num1=sc.nextInt();
			System.out.print("Enter 2nd Number :");
			num2=sc.nextInt();
			System.out.print("Enter 3rd Number :");
			num3=sc.nextInt();
			
			obj.GreatestNumber(num1,num2,num3);
			break;
			
			
		case 2:
			MiniProjectMethod x=new MiniProjectMethod();
			int numb1,numb2,numb3;
			System.out.print("Enter 1st Number :");
			numb1=sc.nextInt();
			System.out.print("Enter 2nd Number :");
			numb2=sc.nextInt();
			System.out.print("Enter 3rd Number :");
			numb3=sc.nextInt();
			
			x.SecondGreatest(numb1,numb2,numb3);
			break;
			
		case 3:
			MiniProjectMethod y=new MiniProjectMethod();
			int n1,n2,n3;
			System.out.print("Enter 1st Number :");
			n1=sc.nextInt();
			System.out.print("Enter 2nd Number :");
			n2=sc.nextInt();
			System.out.print("Enter 3rd Number :");
			n3=sc.nextInt();
			
			y.LowestNumber(n1,n2,n3);
			break;
			
		case 4:
			System.out.println("EXIT");
			
		default:
			System.out.println("RE-TRY");
			
		}
		sc.close();	
	}

}
