/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum17042025;

/**
 *
 * @author MyBook Z Series
 */
public class kucing extends Hewan {
    
    public kucing(String nama) {
        super(nama);
    }
    @Override
    public void bersuara(){
        super.bersuara();//mengakses method super class
          System.out.println(nama+"berkata meow!! meow!");
    }
    
}
