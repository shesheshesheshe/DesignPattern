package BehavioralType.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements Observable {


    private int observableState;

    private List<Observer> observers;
//    private List<Observer> observers = new ArrayList<Observer>();


    public ConcreteObservable() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        System.out.println("-------------------------------------");
        System.out.println("| " + getClass().getSimpleName() + " 通知給所有觀察者更新 |");
        System.out.println("-------------------------------------");
        System.out.println("                 ▼");
        System.out.println();

        observers.forEach(Observer::update); // 尋訪並通知所有 觀察者 進行更新
    }

    public int getState() {
        return observableState;
    }

    public void setState(int state) {
        this.observableState = state;
        System.out.println(getClass().getSimpleName() + " 變更狀態");
        System.out.println(observableState);
        System.out.println();

//        notifyObservers(); // 不一定由此做通知
    }

}