package CreationalType.SpecialCasePattern;

public class PhoneFactory {
    public static final String[] brandNames = {"Apple", "google", "Samsung"};

    public static AbstractPhone getPhone(String brandName){

        for (int i = 0; i < brandNames.length; i++) {
            if (brandNames[i].equalsIgnoreCase(brandName)){
                return new Phone(brandName);
            }
        }
        return new NullPhone();
    }
}
