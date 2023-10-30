package design_patterns.abstractFactoryPattern;


public class HDFC implements Bank {
    private final String B_NAME;

    public HDFC() {
        B_NAME = "HDFC";
    }

    @Override
    public String getBankName() {
        return B_NAME;
    }
}
