/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsRaisa2401081018;

/**
 *
 * @author MyBook Z Series
 */
public class Gaming extends Laptop{
    private String kartuGrafis;
    private int refreshRate;

    public Gaming() {
    }

    public Gaming(int refreshRate, String kartuGrafis) {
        this.refreshRate = refreshRate;
        this.kartuGrafis = kartuGrafis;
    }

    public void setkartuGrafis(String kartuGrafis) {
        this.kartuGrafis = kartuGrafis;
    }

    public String getkartuGrafis() {
        return kartuGrafis;
    }

    public void setrefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public int getrefreshRate() {
        return refreshRate;
    }
    
    @Override
    public String toString() {
        return "Pc gaming dengan jumlah kartu Grafis = " + getkartuGrafis() +
               ", refresh Rate = " + getrefreshRate () ;
    }

    public void setMerek(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
