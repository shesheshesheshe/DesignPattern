package CreationalType.SpecialCasePattern;

public class Phone extends AbstractPhone{

    public Phone(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public boolean outOfStock() {
        return false;
    }

    @Override
    public String getPhone() {
        return this.brandName;
    }
}
