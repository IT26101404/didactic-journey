import java.util.Scanner;

public class IT26101404Lab3Q4{
	public static void main(String[] args){
		int number;
        String output,nbstringg;
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        number = input.nextInt();
        input.close();
        nbstringg = "" + number;
        

        char c1 = nbstringg.charAt(0);
        char c2 = nbstringg.charAt(1);
        char c3 = nbstringg.charAt(2);
        char c4 = nbstringg.charAt(3);
        char c5 = nbstringg.charAt(4);
        System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5);
	}

}