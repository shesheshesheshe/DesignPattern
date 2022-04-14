package CreationalType.BuilderPattern;

public class HotGreenTea extends GreenTea {
    @Override
    public String name() {
        return "Hot Green Tea";
    }

    @Override
    public Packing packing() {
        return new PaperCup();
    }
}
