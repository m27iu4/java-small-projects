// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Customer x = new Customer();
        System.out.println(x.getName() + " " +  x.getCreditLimit() + " " + x.getEmailAddress());


        Customer y = new Customer("3ParamsCons", 6000, "3ParamsCons");
        System.out.println(y.getName() +" " +  y.getCreditLimit() +" " + y.getEmailAddress());

        Customer z = new Customer("2ParamsCons", "2ParamsCons");
        System.out.println(z.getName() +" " +  z.getCreditLimit() +" " + z.getEmailAddress());

    }
}