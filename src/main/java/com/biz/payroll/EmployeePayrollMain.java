package com.biz.payroll;

public class EmployeePayrollMain {
    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        employeePayrollService.readEmployeeDataFromConsole();
        employeePayrollService.writeEmployeeDataInConsole();
    }
}
