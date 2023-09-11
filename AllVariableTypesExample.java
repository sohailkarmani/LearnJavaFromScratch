public class AllVariableTypesExample {
    public static void main(String[] args) {
        // Primitive data types
        int integerVariable = 42;
        double doubleVariable = 3.14159;
        char charVariable = 'A';
        boolean booleanVariable = true;

        // non Primitive data types
        String stringVariable = "Hello, World!";
        int[] arrayVariable = {1, 2, 3, 4, 5};
        Object objectVariable = new Object();

        System.out.println("Integer Variable: " + integerVariable);

        System.out.println("Double Variable: " + doubleVariable);
        System.out.println("Char Variable: " + charVariable);

        System.out.println("Boolean Variable: " + booleanVariable);
        System.out.println("String Variable: " + stringVariable);
        
        System.out.println("Array Variable: " + java.util.Arrays.toString(arrayVariable));
        System.out.println("Object Variable: " + objectVariable);
    }
    
}
