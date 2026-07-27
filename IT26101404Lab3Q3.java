import java.util.Scanner;

public class IT26101404Lab3Q3 {

    public static void main(String[] args) {
        int amount, remain, count;
        Scanner input = new Scanner(System.in);
        
        System.out.println("input amount");
        amount = input.nextInt();
        remain = amount;

        count = remain / 5000;
        remain = remain % 5000;
        System.out.println("5000 Notes - " + count);

        count = remain / 1000;
        remain = remain % 1000;
        System.out.println("1000 Notes - " + count);

        count = remain / 500;
        remain = remain % 500;
        System.out.println("500 Notes - " + count);

        count = remain / 200;
        remain = remain % 200;
        System.out.println("200 Notes - " + count);

        count = remain / 100;
        remain = remain % 100;
        System.out.println("100 Notes - " + count);

        count = remain / 50;
        remain = remain % 50;
        System.out.println("50 Notes - " + count);

        count = remain / 20;
        remain = remain % 20;
        System.out.println("20 Notes - " + count);

        count = remain / 10;
        remain = remain % 10;
        System.out.println("10 Notes - " + count);

        count = remain / 5;
        remain = remain % 5;
        System.out.println("5 Notes - " + count);

        count = remain / 2;
        remain = remain % 2;
        System.out.println("2 Notes - " + count);

        count = remain / 1;
        remain = remain % 1;
        System.out.println("1 Notes - " + count);
        
        input.close();
    }



    // public static void main(){
    //     int amount, count, remain;
    //     Scanner input = new Scanner(System.in);
    //     int [] notesarr ={5000,1000,500,200,100,50,20,10,5,2};
    //     System.out.println("Enter the amount");
    //     amount = input.nextInt();
    //     remain = amount;
    //         for(int i=0;i<notesarr.length; i++){
    //             count = remain / notesarr[i];
    //             remain = remain % notesarr[i];
    //             System.out.println(notesarr[i] + "notes - " + count );
    //         }

    // }

}
