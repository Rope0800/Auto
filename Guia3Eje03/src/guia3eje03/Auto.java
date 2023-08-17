
package guia3eje03;


public class Auto {
    private String color;
    private String patente;
    private double combustible;
    private Rueda ruedaDelanteraIzquierda;
    private Rueda ruedaDelanteraDerecha;
    private Rueda ruedaTraseraIzquierda;
    private Rueda ruedaTraseraDerecha;

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
        this.combustible = 50.0;
        this.ruedaDelanteraIzquierda = new Rueda();
        this.ruedaDelanteraDerecha = new Rueda();
        this.ruedaTraseraIzquierda = new Rueda();
        this.ruedaTraseraDerecha = new Rueda();
    }

    public void avanzar(int metros) {
        double combustibleConsumido = metros / 10.0;
        if (combustible >= combustibleConsumido) {
            combustible -= combustibleConsumido;
            System.out.println("Avanzando " + metros + " metros. Combustible restante: " + combustible + " lts");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + metros + " metros");
        }
    }

    public void retroceder(int metros) {
        double combustibleConsumido = metros / 10.0;
        if (combustible >= combustibleConsumido) {
            combustible -= combustibleConsumido;
            System.out.println("Retrocediendo " + metros + " metros. Combustible restante: " + combustible + " lts");
        } else {
            System.out.println("No hay suficiente combustible para retroceder " + metros + " metros");
        }
    }

    public void llenarTanque() {
        combustible = 50.0;
        System.out.println("Tanque lleno. Combustible: " + combustible + " lts");
    }

    public void inflarRuedas() {
        ruedaDelanteraIzquierda.inflar();
        ruedaDelanteraDerecha.inflar();
        ruedaTraseraIzquierda.inflar();
        ruedaTraseraDerecha.inflar();
        System.out.println("Las ruedas están infladas");
    }

    public void desinflarRuedas() {
        ruedaDelanteraIzquierda.desinflar();
        ruedaDelanteraDerecha.desinflar();
        ruedaTraseraIzquierda.desinflar();
        ruedaTraseraDerecha.desinflar();
        System.out.println("Las ruedas están desinfladas");
    }
}
