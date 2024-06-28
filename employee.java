/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class employee {
    String Employee_No ;
    String Last_Name ;
    String First_Name ;
    String Birthday ;
    String Address ;
    String Phone_Number ;
    String SSS_No ;
    String Philhealth ;
    String TIN_No ;
    String Pagibig_No ;
    String Status ;
    String Position ;
    String Immediate_Supervisor ;
    double Basic_Salary ;
    double Rice_Subsidy ;
    double Phone_Allowance ;
    double Clothing_Allowance ;
    double Gross_SemimonthlyRate ; 
    double Hourly_Rate ;
    
    //getter method

    public String getEmployee_No() {
        return Employee_No;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public String getSSS_No() {
        return SSS_No;
    }

    public String getPhilhealth() {
        return Philhealth;
    }

    public String getTIN_No() {
        return TIN_No;
    }

    public String getPagibig_No() {
        return Pagibig_No;
    }

    public String getStatus() {
        return Status;
    }

    public String getPosition() {
        return Position;
    }

    public String getImmediate_Supervisor() {
        return Immediate_Supervisor;
    }


    public double getBasic_Salary() {
        return Basic_Salary;
    }

    public double getRice_Subsidy() {
        return Rice_Subsidy;
    }

    public double getPhone_Allowance() {
        return Phone_Allowance;
    }

    public double getClothing_Allowance() {
        return Clothing_Allowance;
    }

    public double getGross_SemimonthlyRate() {
        return Gross_SemimonthlyRate;
    }

    public double getHourly_Rate() {
        return Hourly_Rate;
    }
    
    //constructor method
    public employee (String [] records){
        this.Employee_No = records [0];
        this.Last_Name = records [1];
        this.First_Name = records [2];
        this.Birthday = records [3];
        this.Address = records [4];
        this.Phone_Number = records [5];
        this.SSS_No = records [6];
        this.Philhealth = records [7];
        this.TIN_No = records [8];
        this.Pagibig_No = records [9];
        this.Status = records [10];
        this.Position = records [11];
        this.Immediate_Supervisor = records [12];
        this.Basic_Salary = Double.parseDouble (records [13]);
        this.Rice_Subsidy = Double.parseDouble(records [14]);
        this.Phone_Allowance = Double.parseDouble(records [15]) ;
        this.Clothing_Allowance = Double.parseDouble(records [16]) ;
        this.Gross_SemimonthlyRate = Double.parseDouble(records [17]) ;
        this.Hourly_Rate = Double.parseDouble(records [18]) ;
        
    }
    public static employee[] readEmployeesFromCSV(String file) {
        String line = "";
        String csvSplitBy = ",";
        employee[] employees = null;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));

            // Skip the first line (column headers)
            br.readLine();

            // Determine number of lines (employees) in the CSV file
            int numEmployees = (int) br.lines().count();
            employees = new employee[numEmployees];

            // Reset BufferedReader to start of file
            br.close();
            br = new BufferedReader(new FileReader(file));

            // Skip the first line again before reading data
            br.readLine();

            int index = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                employees[index] = new employee(data);
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return employees;
    }
}


