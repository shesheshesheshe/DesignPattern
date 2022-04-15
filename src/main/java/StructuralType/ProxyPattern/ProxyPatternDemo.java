package StructuralType.ProxyPattern;

public class ProxyPatternDemo {
    public static void main(String args[]) {
        System.out.println("[Shopping in Japan by yourself]");
        Purchasing purchasing = new Purchasing();
        purchasing.Request();

        System.out.println("[Shopping in Japan through ProxyBuyer]");
        ProxyBuyer proxy = new ProxyBuyer();
        proxy.Request();
    }
}