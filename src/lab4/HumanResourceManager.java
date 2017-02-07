/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Mike
 */
public class HumanResourceManager {

    private Employee employee;

    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee employee = new Employee(firstName, lastName, ssn);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setSsn(ssn);
        this.startOrientationForNewEmployee(employee);
    }

    public void startOrientationForNewEmployee(Employee employee) {
        employee.doFirstTimeOrientation("L110");
    }

    public void outputReport() {
        if (employee.isMetWithHr() && employee.isReviewedDeptPolicies() && employee.isMetDeptStaff() && employee.isMovedIn()) {
         employee.getReportService().outputReport();
        }
     }
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
