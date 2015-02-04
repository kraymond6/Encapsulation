/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author Kallie
 */
public class HRmanager {
    Employee employee = new Employee();
    String cubeId;
    public void hireEmployee(String fName, String lName, String ssn){
        employee.setFirstName(fName);
        employee.setLastName(lName);
        employee.setSsn(ssn);
        employee.newEmployeeProcess(cubeId);    
    }
    
    public String getEmployeeStatus(){
       return employee.getStatus();
    }
    
    /*Declare employee inside this class, then use hire employee and put the
    information for employee inside of it. There should be no reference to the 
    employee class in the startup*/
    
}
