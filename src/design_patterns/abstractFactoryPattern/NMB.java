package design_patterns.abstractFactoryPattern;

public class NMB implements Bank {
    private final String B_NAME;

    public NMB() {
        B_NAME = "NMB";
    }

    @Override
    public String getBankName() {
        return B_NAME;
    }
}
