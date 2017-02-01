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
public class InvoiceItem {
    private String id;
    private String des;
    private int qty;
    private double unitPrice;
    
    public InvoiceItem(String id, String des, int qty, double unitPrice){
        this.id= id;
        this.des= des;
        this.qty= qty;
        this.unitPrice= unitPrice;
        
    }
    public String getId(){
        return this.id;
        
    }
    
    public String getDes(){
        return this.des;
    }
    
    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public double getUnitPrice(){
        return this.unitPrice;
    }
    public void setUnitprice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return this.unitPrice*this.qty;
    }
    @Override
    public String toString (){
        return "InvoiceItem [id = " + this.id + "desc= " + this.des + "qty= " + this.qty + "unitPrice= " + this.unitPrice + "]";
    }
}
