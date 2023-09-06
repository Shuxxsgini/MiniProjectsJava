/*Interface:
 * -It is to achieve abstraction
 * -It can use multiple inheritance 
 * -It uses "implements" keyword and not "extends"
 * 
 */

import java.util.Scanner;

interface Calculator
{
    void calculateDown(int m_Year, double i_Price);
}

class Vehicle implements Calculator
{
    public void calculateDown(int m_Year, double i_Price)
    {
        int c_Year = 2023;
        double Rate = 0.10;
        double c_Price = i_Price;//current price and initial price

        for (int year = m_Year; year <= c_Year; year++)//manufacturing , current year
        {
            double depreciation = c_Price * Rate;//current price	
            c_Price -= depreciation;
            System.out.println("In "+year+" = $"+depreciation);
        }
    }
}

public class Manufacture
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year of manufacturing: ");
        int manu_Year = sc.nextInt();

        System.out.print("Enter the initial price of the vehicle: ");
        double i_Price = sc.nextDouble();

        Calculator calculator = new Vehicle();
        calculator.calculateDown(manu_Year, i_Price);

        sc.close();
    }
}
