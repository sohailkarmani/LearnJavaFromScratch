

import java.util.Scanner;

public class Student{
   public static void main(String args[]) {
      //Reading values from user
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the name of the student: ");
      String name = sc.nextLine();
      System.out.println("Enter the age of the student: ");
      int age = sc.nextInt();
      Data obj1 = new Data(name, age);
      obj1.display();
      Data obj2 = new Data();
      obj2.display();

      sc.close();
   }
}

