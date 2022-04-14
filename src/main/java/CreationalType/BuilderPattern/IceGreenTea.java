package CreationalType.BuilderPattern;

public class IceGreenTea extends GreenTea {
    @Override
    public String name() {
        return "Ice Green Tea";
    }

    @Override
    public Packing packing() {
        return new PaperCup();
    }
}
