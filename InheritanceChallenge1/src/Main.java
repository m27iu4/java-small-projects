// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
            System.out.println(tim);
            System.out.println("Age: " + tim.getAge());
            System.out.println("Pay: " + tim.collectPay());

            SalariedEmployee joe = new SalariedEmployee("Joe", "11/12/1990", "01/01/2020", 80000);
            System.out.println(joe);
            System.out.println("Joe's paycheck: " + joe.collectPay());

            joe.retire();
            System.out.println("Joe's pension: " + joe.collectPay());



    }
}