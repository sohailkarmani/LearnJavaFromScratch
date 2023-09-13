//Write a program that prompts the user to input an integer and then 
//outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        
        int reverse=0;
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number  : ");
        num=scan.nextInt();

        int temp = num;
        int remainder = 0;
        
        while(temp>0)
        {
	    remainder = temp % 10;
	    reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        System.out.println("Reverse of " + num + " is " + reverse);

        scan.close();

    }
    
}
