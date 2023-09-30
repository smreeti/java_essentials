package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){
        System.out.println("Enter hours:");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Enter pay rate:");
        Scanner scanner1 = new Scanner(System.in);
        double payRate = scanner.nextDouble();

        double grossPay = hours * payRate;
        System.out.println("Total gross pay:::"+grossPay);
    }
}
