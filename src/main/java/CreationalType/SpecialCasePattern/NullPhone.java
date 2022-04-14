package CreationalType.SpecialCasePattern;

public class NullPhone extends AbstractPhone{

    @Override
    public boolean outOfStock() {
        return true;
    }

    @Override
    public String getPhone() {
        return "We don't sell this brand's phones!";
    }
}
