import java.util.Scanner;

public class If_Else {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int largest;
        System.out.println("Enter three numbers ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        // checks if n1 is greater than or equal to n2
        if (n1 >= n2) {

            // if...else statement inside the if block
            // checks if n1 is greater than or equal to n3
            if (n1 >= n3) {
                largest = n1;
            }

            else {
                largest = n3;
            }
        } else {

            // if..else statement inside else block
            // checks if n2 is greater than or equal to n3
            if (n2 >= n3) {
                largest = n2;
            }

            else {
                largest = n3;
            }
        }

        System.out.println("Largest Number: " + largest);

        sc.close();
    }
}