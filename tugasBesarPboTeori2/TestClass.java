/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasBesarPboTeori2;

/**
 *
 * @author MyBook Z Series
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape s1 = new Circle("RED", false, 5.5); // s1 adalah class Circle
        System.out.println(s1); // Menampilkan toString()
        System.out.println(s1.getArea()); 
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius());
        
        // getRadius merupakan method class Shape sedangkan object s1 berasal dari kelas Circle
        // Cast object ke Circle
        System.out.println(((Circle) s1).getRadius());
        
        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        
        // Shape s2 = new Shape();
        
        // Object s2 tidak dapat dibuat karena class yang digunakan (Shape) adalah abstract class
        
        Shape s3 = new Rectangle("RED",false ,1.0, 2.0);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength());
        
        // s3 adalah object dari class Shape sementara getLength() adalah method dari class Rectangle
        // Cast object ke Rectangle
        System.out.println(((Rectangle) s3).getLength());
        
        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide());
        
        // s4 adalah object dari class Shape sementara getSide() adalah method dari class Square
        // Cast object ke Square
        System.out.println(((Square) s4).getSide());
        
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide());
        
        // r2 adalah object dari class Rectangle sementara getSide() adalah method dari class Square
        // Cast object ke Square
        System.out.println(((Square) r2).getSide());
        System.out.println(r2.getLength());
        
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
    }
    

