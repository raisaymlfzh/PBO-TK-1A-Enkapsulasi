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
public class anjing extends Hewan{
    
    public anjing(String nama) {
        super(nama);
    }
    @Override
    public void bersuara(){
        System.out.println(nama+"berkata guk!! guk!");
    }
    
}
