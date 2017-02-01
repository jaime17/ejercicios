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
public class Circle1 {
    private double radius;
    
    
    public Circle1 (){
        this(1.0);
    }
    
    public Circle1(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius (double radius){
        this.radius=radius;
        
    }
    
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getCircumference(){
        return this.radius* Math.PI;
    }
    @Override
    public String toString(){
        return "Circle [radius= " + this.radius + "]"; 
    }
}
