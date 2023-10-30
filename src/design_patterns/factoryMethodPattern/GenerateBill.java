package design_patterns.factoryMethodPattern;

import java.util.Scanner;

public class GenerateBill {

    public static void main(String[] args) {
        GetPlanFactory getPlanFactory = new GetPlanFactory();

        System.out.println("Enter plan");
        Scanner scanner = new Scanner(System.in);
        String planType = scanner.next();
        Plan plan = getPlanFactory.getPlanType(planType);

        System.out.println("Enter units");
        Scanner scanner1 = new Scanner(System.in);
        int units = scanner1.nextInt();

        System.out.println("Bill amount for " + planType + " of units " + units + "is: ");
        plan.getRate();
        plan.calculateBill(units);
    }
}
