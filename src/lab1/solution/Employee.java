/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    private String firstName, lastName, ssn;
    private Date birthDate;
    private String cubeId;
    private Date currentDate;

    public Employee() {
        currentDate = new Date();
    }
    public Employee(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public void newEmployeeProcess(String cubeId){
       meetWithHrForBenefitAndSalryInfo();
       meetDepartmentStaff();
       reviewDeptPolicies();
       moveIntoCubicle(cubeId);  
       getStatus();
    }
    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() { 
        System.out.println("Met with Hr on " + getDate());
    }
    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        
            System.out.println("Met with Dept. Staff on " + getDate());
    }
    // Assume this must be performed third
    private void reviewDeptPolicies() {
            System.out.println("Reviewed Dept. Policies on " + getDate());
    }
    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
            System.out.println("Moved into cube on " + getDate());
            this.cubeId = cubeId;
    }
    public String getStatus() {
            return "Orientation is completed on: " + getDate();
    }
    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(currentDate);
        return fmtDate;
    }
}

