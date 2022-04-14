package CreationalType.SpecialCasePattern;

public class SpecialCasePatternDemo {

    public static void main(String[] args) {

        AbstractPhone customer1 = PhoneFactory.getPhone("Apple");
        AbstractPhone customer2 = PhoneFactory.getPhone("Google");
        AbstractPhone customer3 = PhoneFactory.getPhone("小米");

        System.out.println(customer1.getPhone());
        System.out.println(customer2.getPhone());
        System.out.println(customer3.getPhone());
    }

}
