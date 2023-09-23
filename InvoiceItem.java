public class InvoiceItem {
    private int id;
    private String desc;
    private int qty;
    private double unitprice;

    // constructor to initialize the value
    public InvoiceItem(int id, String desc, int qty, double unitprice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitprice = unitprice;
    }

    // getter methods
    int getId() {
        return id;
    }

    String getDesc() {
        return desc;
    }

    int getQty() {
        return qty;
    }

    double getUnitprice() {
        return unitprice;
    }

    double getTotal() {
        return unitprice * qty;
    }

    // display itams
    void displayItams() {
        System.out.println(id);
        System.out.println(desc);
        System.out.println(qty);
        System.out.println(unitprice);
    }

    // toString methods
    public String toString() {
        return id + " " + desc + " " + qty + " " + unitprice;
    }

    public static void main(String[] args) {
        InvoiceItem a1 = new InvoiceItem(16, "hello", 4, 500);
        a1.toString();
        a1.displayItams();
        System.out.println("Total price is : " + a1.getTotal());
    }
}
