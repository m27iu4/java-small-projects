public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {

        double salary = annualSalary / 26;
        double adjSalary = isRetired ? salary * 0.9 : salary;

        return (int)adjSalary;

    }

    public void retire() {

        terminate("12/12/2025");
        isRetired = true;
    }
}
