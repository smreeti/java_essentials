package design_patterns.abstractFactoryPattern;

public class BusinessLoan extends Loan {
    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
