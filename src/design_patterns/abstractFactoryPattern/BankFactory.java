package design_patterns.abstractFactoryPattern;

public class BankFactory extends AbstractFactory {
    public Bank getBank(String bank) {
        if (bank == null) {
            return null;
        }
        if (bank.equalsIgnoreCase("HDFC")) {
            return new HDFC();
        } else if (bank.equalsIgnoreCase("NMB")) {
            return new NMB();
        }
        return null;
    }

    public Loan getLoan(String loan) {
        return null;
    }
}//End of the BankFactory class