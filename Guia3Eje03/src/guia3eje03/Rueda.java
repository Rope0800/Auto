
package guia3eje03;

public class Rueda {
    private String marca;
    private double presion;

    public Rueda() {
        this.presion = 28.0;
    }

    public void inflar() {
        presion = 28.0;
    }

    public void pinchar() {
        presion = 0.0;
    }

    public void desinflar() {
        presion -= 0.5;
    }
}
