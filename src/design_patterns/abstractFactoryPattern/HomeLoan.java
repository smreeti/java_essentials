package design_patterns.abstractFactoryPattern;

public class HomeLoan extends Loan{
    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
