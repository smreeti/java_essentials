package design_patterns.factoryMethodPattern;

public class CommercialPlan extends Plan{
    @Override
    void getRate() {
        rate = 7.5;
    }
}
