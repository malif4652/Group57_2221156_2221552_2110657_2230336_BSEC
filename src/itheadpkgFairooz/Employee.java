/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itheadpkgFairooz;
public class Employee extends User{
    public String department;
   

    public Employee() {
    }

    public Employee( String department) {
        
        this.department = department;
    }

    public Employee(int id, String name, String gender, String department, String password) {
        super(id, name, gender, password);
        //this.id=id;
        
        this.departmet = department;
    }

    
    

    public String getdepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee" + super.toString() +", major=" + major + '}';
    }
    

/**
 *
 * @author ASUS
 */
public class Employee {
    
}
