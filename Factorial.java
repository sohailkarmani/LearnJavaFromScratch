

// The program is give the factorial of positive numbers 


import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter  number  : ");
        int num=scan.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            //fact=fact*i;
            fact*=i;


        }
        System.out.println("Factorial is  : "+fact);

         scan.close();
    }
}
