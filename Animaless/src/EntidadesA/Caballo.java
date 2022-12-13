/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesA;

/**
 *
 * @author Snakesp2
 */
public class Caballo {
    
    public String color;
    public int patas;
    public String sonido;

    public Caballo() {
    }

    public Caballo(String color, int patas, String sonido) {
        this.color = color;
        this.patas = patas;
        this.sonido = sonido;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return "Caballo" + "\ncolor:" + color + "\npatas:" + patas + "\nsonido=" + sonido + "";
    }
     
}
