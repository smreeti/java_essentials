package design_patterns.factoryMethodPattern;

public class GetPlanFactory {

    public Plan getPlanType(String planType){
        if(planType == null){
            return null;
        }
        switch (planType){
            case "DOMESTICPLAN":
                return new DomesticPlan();
            case "COMMERCIALPLAN":
                return new CommercialPlan();
            case "INSTITUTIONPLAN":
                return new InstitutionPlan();
        }
        return null;
    }
}
