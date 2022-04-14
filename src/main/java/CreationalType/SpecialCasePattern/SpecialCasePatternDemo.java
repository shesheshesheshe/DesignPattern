package CreationalType.SpecialCasePattern;

public class SpecialCasePatternDemo {

    public static void main(String[] args) {

        System.out.println("Customer1 wants an iPhone 13 from Apple.");
        AbstractPhone customer1 = PhoneFactory.getPhone("Apple");
        System.out.println(customer1.getPhone());

        System.out.println("Customer2 wants a Pixel 6 from Google.");
        AbstractPhone customer2 = PhoneFactory.getPhone("Google");
        System.out.println(customer2.getPhone());

        System.out.println("Customer3 wants a Redmi Note 10 5G from 小米.");
        AbstractPhone customer3 = PhoneFactory.getPhone("小米");
        System.out.println(customer3.getPhone());
    }

}
