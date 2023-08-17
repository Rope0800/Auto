
package guia3eje03;


public class Guia3Eje03 {

    
    public static void main(String[] args) {

  
        Auto tutu = new Auto("Rojo", "ABC123");

        tutu.inflarRuedas();
        tutu.avanzar(50);
        tutu.desinflarRuedas();
        tutu.retroceder(30);
        tutu.llenarTanque();
    }
}
