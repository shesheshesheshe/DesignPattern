package StructuralType.AdapterPattern;

public class ConcreteNewDataTarget implements NewDataTarget{
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
