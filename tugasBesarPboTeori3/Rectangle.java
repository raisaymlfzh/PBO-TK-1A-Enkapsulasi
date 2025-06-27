/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasBesarPboTeori3;

/**
 *
 * @author MyBook Z Series
 */
public class Rectangle implements GeometricObject {
    private double width;
    private double length;
    
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override
    public String toString(){
        return "Rectangle[width="+width+", length="+length+", area="+getArea()+", perometer="+getPerimeter();
    }
   
}

