package BehavioralType.ObserverPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {

        // 實例 具體主題
        ConcreteObservable concreteObservable = new ConcreteObservable();

        // 模擬 設置初始訊息 (此時尚無 觀察/訂閱者)
        concreteObservable.setState(11);
        concreteObservable.notifyObservers(); // 通知所有 觀察者

        /*
         * 下方的 concreteObservable.attach(XXX);
         * 需要的參數為 Observer
         * 因此，實例 抽象 或 具體觀察者皆可 (多型 polymorphism)
         */
        ConcreteObserverBinary observerA = new ConcreteObserverBinary(concreteObservable); // 實例 具體觀察者 A
        Observer observerB = new ConcreteObserverOctal(concreteObservable); // 實例 抽象觀察者 B
        Observer observerC = new ConcreteObserverHexa(concreteObservable); // 實例 抽象觀察者 C

        concreteObservable.attach(observerA); // 觀察者A 訂閱 主題
        concreteObservable.attach(observerB); // 觀察者B 訂閱 主題
        concreteObservable.attach(observerC); // 觀察者C 訂閱 主題

        concreteObservable.setState(16); // 變更主題狀態
        concreteObservable.notifyObservers(); // 通知所有 觀察者

        concreteObservable.setState(31); // 變更主題狀態
        concreteObservable.notifyObservers(); // 通知所有 觀察者
    }
}

