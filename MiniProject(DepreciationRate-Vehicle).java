import java.util.Scanner;

public class Manufacture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year of manufacturing: ");
        int m_year = sc.nextInt();

        System.out.print("Enter the initial price of the vehicle: ");
        double i_price = sc.nextDouble();

        int c_year = 2023;


        double Rate = 0.10;
        double c_price = i_price; //initial price(i_price) ,current price (c_price)

        for (int year = m_year; year <= c_year; year++) {
            double down = c_price * Rate;
            System.out.println(year + "  " + (Rate * 100) + "  ₹" + c_price);
            c_price -= down;
        }

        sc.close();
    }
}
