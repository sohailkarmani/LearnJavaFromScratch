
// This program gives the power of number which is enter by user 


import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int result=1;
        System.out.print("Enter base number and power number  : ");
        int base =scan.nextInt();
        int power=scan.nextInt();

        for(int i=1;i<=power;i++){
            result*=base;
            //result=result*base
        }
        System.out.println(result);
        scan.close();
    }
}
