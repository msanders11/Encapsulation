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
public class Business {
    
    private HumanResourceManager hrManager;

    public Business() {
        hrManager = new HumanResourceManager();
    }
    
    public void hireNewEmployee(String firstName, String lastName, String ssn){
        hrManager.hireNewEmployee( firstName, lastName, ssn);
    }

    public HumanResourceManager getHrManager() {
        return hrManager;
    }

    public void setHrManager(HumanResourceManager hrManager) {
        this.hrManager = hrManager;
    }
    
        
        
    
}
