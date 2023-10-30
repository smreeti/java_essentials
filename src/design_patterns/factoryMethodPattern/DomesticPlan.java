package design_patterns.factoryMethodPattern;

public class DomesticPlan extends Plan {
    @Override
    void getRate() {
        rate = 3.5;
    }
}
