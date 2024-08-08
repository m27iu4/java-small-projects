public class Customer {

    private String name = "Default";
    private int creditLimit = 50000;
    private String emailAddress = "default";

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer() {
        this("NoArgs", "NoArgs email");
    }

    public Customer(String name, String emailAddress) {
        this(name, 123456, emailAddress);
        this.name = name;
        this.emailAddress = emailAddress;
    }
}
