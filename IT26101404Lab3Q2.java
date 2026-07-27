import java.util.Scanner;

public class IT26101404Lab3Q2{
	public static void main(String[] args){
		double salary,othour,otrate,totalsalary,ot;
		Scanner input = new Scanner(System.in);
		System.out.println("input your salary");
		salary = input.nextDouble();
		System.out.println("input your ot hour");
		othour = input.nextDouble();
		System.out.println("enter ot hourly rate");
		otrate = input.nextDouble();
		ot = othour*otrate;
		totalsalary = salary+ot;
		System.out.println("The total salary including ot is= "+totalsalary);
	}

}