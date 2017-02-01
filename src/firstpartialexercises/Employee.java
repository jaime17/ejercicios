/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexercises;

/**
 *
 * @author Alumno
 */
public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public int salary;
    
    
   public Employee (int id, String firstName, String lastName, int salary){
       this.id = id;
       this.firstName = firstName;
       this.lastName = lastName;
       this.salary = salary;
   }
   
   public int getId(){
       return this.id;
   }
   
   public String getFirstName(){
       return this.firstName;
       
   }
   
   public String getLastName(){
       return this.lastName;
   }
   
   public String getName(){
       return this.firstName + " " + this.lastName;
   }
   
   public int getSalary(){
       return this.salary;
       
   }
   
   public void setSalary(int salary){
       this.salary = salary;
   }
   
   public int getAnnualSalary(){
       return this.salary*12;
   }
   
   public int raiseSalary (int porcent){
       this.salary += this.salary + porcent / 100;
       return this.salary;
   }
   
   @Override
   public String toString(){
       return "Employee [Id= " + this.id + "name: " + this.getName() + "salary= " + this.salary  + "]";
}
}
