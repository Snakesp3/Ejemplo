/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesA;

/**
 *
 * @author Johana
 */
public class Gato {
    
    private String nombre;
    private int edad;
    private int cantPatas;

    public Gato(String nombre, int edad, int cantPatas) {
        this.nombre = nombre;
        this.edad = edad;
        this.cantPatas = cantPatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantPatas() {
        return cantPatas;
    }

    public void setCantPatas(int cantPatas) {
        this.cantPatas = cantPatas;
    }
    
    public void ronronear(){
    
        System.out.println("Rrrrrrrrrrrrrr");
    }
    
}
