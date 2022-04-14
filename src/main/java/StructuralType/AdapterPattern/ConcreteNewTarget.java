package StructuralType.AdapterPattern;

public class ConcreteNewTarget implements NewTarget {
        @Override
        public void loveRedHat()
        {
            System.out.println("Oh Red Hat you are so cute!");
        }

        @Override
        public void sleep()
        {
            System.out.println("Grandma snore");
        }
}
