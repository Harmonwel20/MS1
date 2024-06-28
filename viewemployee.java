/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

/**
 *
 * @author vidal
 */
public class viewemployee {
    private employee[] employees;
    public viewemployee(){
        employees = employee.readEmployeesFromCSV("src/Files/EmployeeDetails1.csv");
         for(employee emp: employees) {
           String employeeNo = emp.getEmployee_No();
System.out.println(employeeNo);
        }
    }
}
          


