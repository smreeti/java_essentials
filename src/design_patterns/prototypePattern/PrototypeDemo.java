package design_patterns.prototypePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter emp id");
        int eid = Integer.parseInt(br.readLine());
        System.out.println("\n");

        System.out.print("Enter Employee Name: ");
        String ename = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Designation: ");
        String edesignation = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Address: ");
        String eaddress = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double esalary = Double.parseDouble(br.readLine());
        System.out.print("\n");

        EmployeeRecord employeeRecord1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);
        employeeRecord1.showRecord();
        System.out.print("\n");

        EmployeeRecord employeeRecord2 = (EmployeeRecord) employeeRecord1.getClone();
        employeeRecord2.showRecord();

    }
}
