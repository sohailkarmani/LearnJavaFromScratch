import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Average a1 = new Average();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers to get average :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        a1.averageNum(n1, n2, n3);

        sc.close();

    }

    // define method to get average
    public void averageNum(int n1, int n2, int n3) {
        int avg = (n1 + n2 + n3) / 3;

        System.out.println(avg);

    }
}
