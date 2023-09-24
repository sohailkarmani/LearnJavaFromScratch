
public class Data{
   private String name;
   private int age;
   Data(){
      this.name = "Khushal";
      this.age = 21;
   }
   Data(String name, int age){
      this.name = name;
      this.age = age;
   }
   public void display() {
      System.out.println("name: "+this.name);
      System.out.println("age: "+this.age);
   }
}