package design_patterns.abstractFactoryPattern;

public class EducationLoan extends Loan {

    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
