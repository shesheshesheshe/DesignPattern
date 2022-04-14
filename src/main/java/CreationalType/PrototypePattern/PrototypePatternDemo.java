package CreationalType.PrototypePattern;

public class PrototypePatternDemo {
    public static void main(String[] args)throws CloneNotSupportedException
    {
        NARUTO naruto = new NARUTO();
        NARUTO cloneNaruto=(NARUTO)naruto.clone();
        System.out.println("NARUTO == clone NARUTO : " + (naruto==cloneNaruto));
    }
}
