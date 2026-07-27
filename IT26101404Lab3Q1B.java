import java.util.Scanner;
//Import System.out
public class IT26101404Lab3Q1B {

    public static void main(String[] args) {
        double price, amount, total, discount,bill;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter price of one unit");
		price = input.nextDouble();
		System.out.println("Enter amout of kg to buy");
		amount = input.nextDouble();
		total = price*amount;
		discount= (total/100)*10;
		bill = total-discount;
		System.out.println("the total amount with 10% discount" + bill );
		
    }
}
