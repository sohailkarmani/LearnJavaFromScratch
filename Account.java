public class Account {
    private String id;
    private String name;
    private int balance;

    // constructor to initialize the account
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    // Getter method for account number

    String getID() {
        return id;
    }

    String getName() {
        return name;
    }

    int getBalance() {
        return balance;
    }

    // methid to add funds to the account
    int credit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Credited $" + amount);
        } else {
            System.out.println("Invalid credit amount. Amount must be greater than 0.");
        }
        return balance;
    }

    // method to withdraw funds from the account
    int debit(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Debited $" + amount);
        } else {
            System.out.println(
                    "Invalid debit amount. Amount must be greater than 0 and less than or equal to the balance.");
        }

        return balance;
    }

    int transferTo(Account a2, int amount) {

        if (amount > 0 && balance >= amount) {
            balance -= amount;
            a2.credit(amount);
            System.out.println(amount + " transferred to " + a2.getName() +
                    "'s account (" + a2.getID() + "). New balance: " + balance);
        } else {
            System.out.println("Invalid transfer amount or insufficient balance.");
        }
        return amount;

    }

    public String toString() {
        return id + " " + name + " " + balance;
    }

    public static void main(String[] args) {
        Account a1 = new Account("16", "Sohail", 500);

        Account a2 = new Account("15", "Ali", 500);

        // test credit and debit
        System.out.println();
        a1.credit(500);
        System.out.println();
        System.out.println(a1);
        System.out.println();
        a1.debit(1000);
        System.out.println();
        System.out.println(a1);
        System.out.println();

        a1.transferTo(a2, 100);

        // display account information
        System.out.println();
        System.out.println("Account 1 details");
        System.out.println("Account ID :" + a1.getID());
        System.out.println("Account Holder name :" + a1.getName());
        System.out.println("Balance : $" + a1.getBalance());
        System.out.println();
        System.out.println("Account 2 details");
        System.out.println("Account ID :" + a2.getID());
        System.out.println("Account Holder name :" + a2.getName());
        System.out.println("Balance : $" + a2.getBalance());

    }

}
