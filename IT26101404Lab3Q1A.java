import java.util.Scanner;
//Import System.out
public class IT26101404Lab3Q1A {

    public static void main(String[] args) {
        double price, amount, total;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter price of one unit");
		price = input.nextDouble();
		System.out.println("Enter amout of kg to buy");
		amount = input.nextDouble();
		total = price*amount;
		System.out.println("total price is " + total );
		
    }
}
