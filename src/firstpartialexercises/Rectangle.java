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
public class Rectangle {
    private float lenght;
    private float width;
    
    public Rectangle(){
        this(1.0f, 1.0f);
    }
    
    public Rectangle(float lenght, float width){
      this.lenght=lenght;
      this.width=width;
      
    }
    
    public float getLength (){
        return this.lenght;
    }
    
    public void setLength (float length){
        this.lenght=length;
    }
    
    public float getWidth (){
        return this.width;
    }
    
    public void setWidth (float width){
        this.width= width;
        
    }
    
   public double getArea(){
       return this.lenght * this.width;
   }
   
   public double getperimeter(){
       return ((this.lenght*2) + (this.width*2));
   }
   
   @Override
   public String toString (){
       return "Rectangle [ length= " + this.lenght + "width= " + this.width + "]";
   }
}
