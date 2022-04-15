package StructuralType.ProxyPattern;

class ProxyBuyer implements IPurchasing {
    private Purchasing purchasing;

    public void Request() {
        if (purchasing == null) {
            purchasing = new Purchasing();
        }
        preRequest();
        purchasing.Request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("Confirm shopping items");
    }
    public void postRequest() {
        System.out.println("Delivering");
    }
}