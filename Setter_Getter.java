import java.util.Scanner;

public class Setter_Getter {

    private String name;
    private int age;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    void display() {
        System.out.println("Name  :" +this.name);
        System.out.println("Age :" + this.age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        Setter_Getter o1 = new Setter_Getter();
        o1.setName("Sohail");
        o1.setAge(20);
        o1.display();
        sc.close();

    }

}
