/*
 * Classe Utils per fer operacions amb strings i enters.
 */
package mostra;

/**
 *
 * @author mjimenez.
 * 
 */
public class Utils {
    /**
     * Atribut públic Marcos.
     */
    public final static int MARCOS = 0;
    
    /** Constructor buit */
    public Utils() {
    }

    /**
     * Calcula la suma de dos números enters.
     * @param a primer element suma
     * @param b segon element suma
     * @return int suma total
     */    
    public static int calculSuma(int a, int b){
        return a + b;
    }
    
    /**
     * Calcula el factorial d'un número enter.
     * @param number int número que calcularem el factorial 
     * @return factorial int calculat 
     * @throws IllegalArgumentException Illegal Argument Exception
     */
    public static int calculFactorial(int number)
            throws IllegalArgumentException {
        if (number < 1) {
            throw new IllegalArgumentException("cero o paràmetre negatiu (" + number + ')');
        }
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }
    
    /**
     * Validem que el valor màxim no supera 5.
     * @param maxim int màxim 
     * @return max boolean 
     */
    public static boolean validarMaxim(int maxim){
     boolean max = true;
     if (maxim > 5){
         max = false;
     }
     return max;
    }
}
