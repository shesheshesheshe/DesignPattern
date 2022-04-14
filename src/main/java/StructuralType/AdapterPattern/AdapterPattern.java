package StructuralType.AdapterPattern;

public class AdapterPattern {

    public static void main(String[] args) {
        NewTarget grandma = new ConcreteNewTarget();

        OldAdaptee wolf = new ConcreteOldAdaptee();
        NewTarget wolfAdapter = new Adapter(wolf);

        GrandmaHome grandmaHome = new GrandmaHome();
        grandmaHome.greeting(grandma);
        grandmaHome.greeting(wolfAdapter);
    }
}

class GrandmaHome {
    void greeting(NewTarget grandma){
        System.out.println("Red Hat is in her grandma's home.");
        grandma.sleep();
        System.out.println("Her grandma is lying on the bed and says......");
        grandma.loveRedHat();
    }
}