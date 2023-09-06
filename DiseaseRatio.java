/*
 * A java program which will conduct a survey and will take record of disease
 * in those states and show the percentage:
 */
 import java.util.Scanner;

public class DiseaseRatio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalPeople = 5;
        int[][] diseaseCount = new int[5][3]; 

        for (int i = 0; i < totalPeople; i++) {
            System.out.println("Enter Your name " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.println("Choose Your disease for " + name + ": ");
            System.out.println("--------------------------------------");
            System.out.println("1. Diabetes");
            System.out.println("2. Thyroid");
            System.out.println("3. Sugar");
            System.out.println("4. Exit");
            System.out.println("--------------------------------------");
            System.out.print("Choice [1-4] : ");
            int diseaseChoice = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Choose Your State for " + name + ": ");
            System.out.println("--------------------------------------");
            System.out.println("1. Jharkhand");
            System.out.println("2. Delhi");
            System.out.println("3. Mumbai");
            System.out.println("4. Odisha");
            System.out.println("5. Bangalore");
            System.out.println("6. Exit");
            System.out.println("--------------------------------------");
            System.out.print("Choice [1-6] : ");
            int stateChoice = sc.nextInt();
            sc.nextLine(); 
            
           
       //if we choose any state or disease it'll increment the value 
            if (diseaseChoice >= 1 && diseaseChoice <= 3 && stateChoice >= 1 && stateChoice <= 5)
            {
                 diseaseCount[stateChoice - 1][diseaseChoice - 1]++;
            } 
            else if (diseaseChoice == 4 || stateChoice == 6)
            {
                System.out.println("Exiting input for " + name);
            }
            else 
            {
                System.out.println("Invalid Input");
            }
        }

        //disease by State--
        System.out.println("Disease percentages by State:");
        String[] states = {"Jharkhand", "Delhi", "Mumbai", "Odisha", "Bangalore"};
        String[] diseases = {"Diabetes", "Thyroid", "Sugar"};

        for (int i = 0; i < 5; i++)
        {
            System.out.println(states[i] + ": ");
            for (int j = 0; j < 3; j++)
            {
                double percentage = (double) diseaseCount[i][j] / totalPeople * 100;
                System.out.println(diseases[j] + ": " + percentage + "%");
            }
            System.out.println("------------------------");
        }
        sc.close();
    }
}
