public class Date {
    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    int getDay() {
        return day;
    }

    int getMonth() {
        return month;
    }

    int getYear() {
        return year;
    }

    void setDay(int day) {
        this.day = day;
    }

    void setMonth(int month) {
        this.month = month;
    }

    void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return day + " " + month + " " + year;

    }

    public static void main(String[] args) {

        // Create Date objects
        Date date1 = new Date(20, 9, 2023);
        Date date2 = new Date(15, 3, 2022);

        // Display the dates
        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);

        // Modify a date
        date1.setDay(25);
        date1.setMonth(12);
        date1.setYear(2023);
    }

}
