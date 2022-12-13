
package EntidadesA;

/**
 *
 * @author Damian
 */
public class Pajaro {
      
    private double peso;
    private double altura;
    private String tipoPlumaje;    
    private boolean vuela; 

    public Pajaro() {
    }

    public Pajaro(double peso, double altura, String tipoPlumaje, boolean vuela) {
        this.peso = peso;
        this.altura = altura;
        this.tipoPlumaje = tipoPlumaje;
        this.vuela = vuela;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTipoPlumaje() {
        return tipoPlumaje;
    }

    public void setTipoPlumaje(String tipoPlumaje) {
        this.tipoPlumaje = tipoPlumaje;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    
}
