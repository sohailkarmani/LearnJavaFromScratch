
//Java Program to demonstrate the example of Switch statement  
//where we are printing month name for the given number  


import java.util.Scanner;

public class SwitchMonthExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number a giver month   :  ");
        int num=scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
            System.out.println("Feb");
            break;
            case 3:
            System.out.println("March");
            break;
            case 4:
            System.out.println("April");
            break;
            case 5:
            System.out.println("May");
            break;
            case 6:
            System.out.println("June");
            break;
            case 7:
            System.out.println("July");
            break;
            case 8:
            System.out.println("August");
            break;
            case 9:
            System.out.println("September");
            break;
            case 10:
            System.out.println("Oct");
            break;
            case 11:
            System.out.println("Nov");
            break;
            case 12:
            System.out.println("December");
            break;

            default:
            System.out.println("invaild month");
                break;
        }
        scan.close();

    }
}
