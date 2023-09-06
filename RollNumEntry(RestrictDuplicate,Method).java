/*
 *Program to accept Roll no. , restrict duplicate entry.
*/
import java.util.Scanner;

public class RollNumEntry
   {
    public static void main(String[] args) 
      {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Total Number Of Students: ");
        int n=sc.nextInt();
        int[] rolls = new int[n];

       
        for (int i = 0; i < n; ) 
         {
            System.out.print("Enter Your Roll Number " + (i + 1) + ": ");
            int roll = sc.nextInt();

            int j;
            for (j = 0; j < i; j++) 
            {
                if (roll == rolls[j]) 
                {
                	System.out.println("------------------------");
                    System.out.println("Duplicate Entry Detected. ");
                    System.out.println("RE-TRY :( ");
                    System.out.println("------------------------");              
                   break; 
                }
            }

            if (j == i) 
            {
                rolls[i++] = roll;
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("Accpted all the Roll number. THANK YOU :)");
        System.out.println("----------------------------------------");
        
        sc.close();
    }
}