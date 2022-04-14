package StructuralType.AdapterPattern;

public class ConcreteOldAdaptee implements OldAdaptee {

    @Override
    public void killRedHat()
    {
        System.out.println("Oh Red Hat you are so delicious!");
    }

    @Override
    public void sleep()
    {
        System.out.println("BigWildWolf imitate Grandma snore");
    }
}
