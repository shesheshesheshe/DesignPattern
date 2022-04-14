package BehavioralType.ObserverPattern;

public class ConcreteObserverOctal implements Observer {

    private int observerState;

    private ConcreteObservable concreteObservable; // 持有指向 ConcreteSubject 物件的 reference

    public ConcreteObserverOctal(ConcreteObservable concreteObservable) {
        this.concreteObservable = concreteObservable;
    }

    @Override
    public void update() {
        this.observerState = concreteObservable.getState();
        System.out.println(getClass().getSimpleName() + " 收到更新");
        System.out.println( "Octal String: " + Integer.toOctalString(observerState));
        System.out.println();
    }
}
