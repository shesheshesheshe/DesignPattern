package CreationalType.PrototypePattern;

public class NARUTO implements Cloneable {
    NARUTO() {
        System.out.println("NARUTO create success！");
    }
    public Object clone() throws CloneNotSupportedException{
        System.out.println("NARUTO clone success");
        return (NARUTO)super.clone();
    }
}
