
class EmployeeData {
    private int ID;
    private String FName;
    private String LName;
    private int Salary;

    EmployeeData(int id, String fName, String lName, int salary) {
        this.FName = fName;
        this.ID = id;
        this.LName = lName;
        this.Salary = salary;

    }

    public int getID() {
        return ID;
    }

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public String getName() {
        return FName+" "+LName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }

    public int getAnnualSalary() {
        return Salary * 12;
    }

}

public class Employee {

    public static void main(String[] args) {
        EmployeeData e1 = new EmployeeData(16, "Sohail", "Karmani", 50000);

        System.out.println("The employee ID is  :" + e1.getID());
        System.out.println("The employee first name is  :" + e1.getFName());
        System.out.println("The employee last name is :" + e1.getLName());
        System.out.println("The employee full name is :" + e1.getName());
        System.out.println("Salary  :" + e1.getSalary());
        System.out.println("Annual salary is :" + e1.getAnnualSalary());

    }
}
