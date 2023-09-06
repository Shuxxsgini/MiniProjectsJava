import java.util.*;
 class MiniProjectBANK 
 {
    void Deposit(double deposit)
    {
    	Scanner sc=new Scanner(System.in);
    	double fixed=5000.00;
     	System.out.print("Enter the amount you want to deposit: ");
    	deposit=sc.nextInt();
        double Total=fixed+deposit;	
        System.out.println("Your money has been deposited.");
        System.out.println("Previous money: ₹"+fixed+"Total Amount in your acct is: ₹"+Total);
        System.out.println("PLEASE VISIT AGAIN,THANK YOU :)");
    }
  
 }
   
 class WITHDRAW extends MiniProjectBANK
  {
    void Withdraw(double w_amt)
    {
	   Scanner sc=new Scanner(System.in);
       double Fixed=5000;
   	   System.out.println("Enter the amount you want to deposit: ");
   	   w_amt=sc.nextInt();
       double Savings=Fixed-w_amt;
       System.out.println("Money has been withdrawlled...");
       System.out.println("Your savings left is: ₹"+Savings);
       System.out.println("PLEASE VISIT AGAIN,THANK YOU :)");
   }
    
  }
  
 class S_Interest
 {
	 void SI(int p,int r,int t)
	 {
		 
			
			int SI=p*r*t/100;
			System.out.println("Your Simple Interest is: "+SI);
			System.out.println("PLEASE VISIT AGAIN,THANK YOU :)");
			
		 
	 }
	 
 }
 
 class GROSS extends WITHDRAW 
 {
	 void Gross()
	 {
		 int gross;
	 }
    
	public static void main(String[] args) 
	{
		MiniProjectBANK obj1=new MiniProjectBANK ();
		Scanner sc=new Scanner(System.in);
		double d;
		d=sc.nextDouble();
		obj1.Deposit(d);
		
		WITHDRAW obj2=new WITHDRAW();
		Scanner x=new Scanner(System.in);
		double w=sc.nextDouble();
		obj2.Withdraw(w);
		
		S_Interest obj3=new S_Interest();
		int p,r,t;
		Scanner y=new Scanner(System.in);
		System.out.print("Enter Principle: ");
		 p=sc.nextInt();
		System.out.print("Enter Rate     : ");
		 r=sc.nextInt();
		System.out.print("Enter Time     : ");
		 t=sc.nextInt();
		obj3.SI(p,r,t);
		
		sc.close();
	}


}
