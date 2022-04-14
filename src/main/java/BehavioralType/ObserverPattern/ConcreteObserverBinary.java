package BehavioralType.ObserverPattern;

public class ConcreteObserverBinary implements Observer {

    private int observerState;

    private ConcreteObservable concreteObservable; // 持有指向 ConcreteSubject 物件的 reference

    public ConcreteObserverBinary(ConcreteObservable concreteObservable) {
        this.concreteObservable = concreteObservable;
    }

    @Override
    public void update() {
        this.observerState = concreteObservable.getState();
        System.out.println(getClass().getSimpleName() + " 收到更新");
        System.out.println( "Binary String: " + Integer.toBinaryString(observerState));
        System.out.println();
    }
}

