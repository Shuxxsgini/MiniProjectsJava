import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c_type,c_unit;
		double pay,bill;
		System.out.println("------------------------------");
		System.out.println("      CONNECTION TYPE         ");
		System.out.println("------------------------------");
		System.out.println("1. Commercial");
		System.out.println("2. Domestic");
		System.out.println("3. Agriculture");
		System.out.println("------------------------------");
		c_type=sc.nextInt();
		System.out.print("Enter your unit of electricity consumed:");
		c_unit=sc.nextInt();
		
	   
		
		if(c_type==1)
		{
			if(c_unit>=0 && c_unit<=200)
			{
				bill=c_unit-50;
				pay=bill*3.50;
				System.out.print("You get 50 units electricity FREE. Please pay: $"+pay);
			}
			else if(c_unit>=201 && c_unit<=400)
			{
				bill=c_unit-100;
				pay=bill*4.50;
				System.out.print("You get 100 units electricity FREE. Please pay: $"+pay);
			}
			else if(c_unit>=400)
			{
				bill=c_unit-200;
				pay=bill*5.50;
				System.out.print("You get 200 units electricity FREE. Please pay: $"+pay);
			}
		}
			else if(c_type==2)
			{
				 pay=c_unit*2.80;
				System.out.println("Please pay: "+ "$"+pay);
			}
			else if(c_type==3)
			{
				    pay=c_unit*6.80;
					System.out.println("Please pay: "+ "$"+pay);
			}
			else
			{
				System.out.println("Invalid connection input Re-try.");
			}
			sc.close();
			
			
		

	}

}
