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
public class Circle {
    private double radius =1.0;
    private String color ="red";
    
    
    
    public Circle(){
        radius= 1.0;
        color= "red";
    }
    
    public Circle (double radius){
        this.radius = radius;
        this.color= "red";
    }
    
    public Circle (String color){
        this.radius = 1.0;
        this.color = color;
    }
    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius (){
        return this.radius;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public String toString (){
        //String temp;
        //temp= "Circle [radius =" + this.radius + "color = " + this.color + "]";
        //return temp;
        
        return "Circle [radius =" + this.radius + "color = " + this.color + "]";
    }
    
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
}
