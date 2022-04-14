package BehavioralType.ObserverPattern;

public class ConcreteObserverHexa implements Observer {

    private int observerState;

    private ConcreteObservable concreteObservable; // 持有指向 ConcreteSubject 物件的 reference

    public ConcreteObserverHexa(ConcreteObservable concreteObservable) {
        this.concreteObservable = concreteObservable;
    }

    @Override
    public void update() {
        this.observerState = concreteObservable.getState();
        System.out.println(getClass().getSimpleName() + " 收到更新");
        System.out.println( "Hexa String: " + Integer.toHexString(observerState));
        System.out.println();
    }
}
