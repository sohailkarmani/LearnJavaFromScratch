//Write a do-while loop that asks the user to enter two numbers. The numbers should be 
//added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. 
//If so, the loop should repeat;
// otherwise it should terminate. 

import java.util.Scanner;

public class SumDoWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int choice;
        do{
        System.out.println("Enter numbers  :");
        int num1 =scan.nextInt();
        int num2=scan.nextInt();
        int sum= num1+num2;
        System.out.println("The sum is "+sum);


        System.out.print("Do you want to continue y/n? ");
        choice = scan.next().charAt(0);
        
        System.out.println();
        
    }while(choice=='y' || choice == 'Y');


    scan.close();


        
    }
}
