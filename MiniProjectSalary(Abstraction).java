import java.util.Scanner;

abstract class SalaryMiniProject {
    int salary;
     abstract void Cash();
     abstract void Sales();
     abstract void Purchase();
}

class A extends SalaryMiniProject {
     void Cash() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        salary = sc.nextInt();
        double g = 0.10 * salary;
        System.out.println("Your DA is 10%.");
        System.out.println("Your gross salary is: " + g);
        sc.close();
    }

     void Sales() {
       
    }

    void Purchase() {
        
    }
}

class B extends SalaryMiniProject {
     void Cash() {
        
    }

     void Sales() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        salary = sc.nextInt();
        double g = 0.20 * salary;
        System.out.println("Your DA is 20%.");
        System.out.println("Your gross salary is: " + g);
        sc.close();
    }

     void Purchase() {
        
    }
}

class C extends SalaryMiniProject {
     void Cash() {
        
    }

     void Sales() {
        
    }

     void Purchase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        salary = sc.nextInt();
        double g = 0.30 * salary;
        System.out.println("Your DA is 30%.");
        System.out.println("Your gross salary is: " + g);
        sc.close();
    }

    public static void main(String[] args) {
        C c = new C();
        c.Purchase();

        
    }
}

