/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio0;

/**
 *
 * @author Alumno
 */
public class Ejercicio0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean finalizar;
        do {
            String entrada = leerEntrada();
            if (!(finalizar =finalDeJuego())) {
                logica();
                escribirSalida();
            }
        } while (!finalizar);
        
    }
    //jugador1
    private static String leerEntrada() {
        throw new UnsupportedOperationException("N funciona nada"); //To change body of generated methods, choose Tools | Templates.
    }
    //2
    private static boolean finalDeJuego() {
        throw new UnsupportedOperationException("holii"); //To change body of generated methods, choose Tools | Templates.
    }
    //3
    private static void logica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void escribirSalida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
