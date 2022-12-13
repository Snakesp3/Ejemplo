
package EntidadesA;


public class Perro {
    
    private String nombre;
    private int edad;
    private String actividad;
    private String raza;

    public Perro() {
    }

    public Perro(String nombre, int edad, String actividad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.actividad = actividad;
        this.raza = raza;
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

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", actividad=" + actividad + ", raza=" + raza + '}';
    }
    
    
    
    
    
}
