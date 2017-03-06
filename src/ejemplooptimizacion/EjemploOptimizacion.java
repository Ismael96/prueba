/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplooptimizacion;

/**
 *
 * @author francis
 */
public class EjemploOptimizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Numeros primos menores de 100");
        System.out.println("-----------------------------");
        System.out.println("");
        
        for (int numero = 1; numero <= 100; numero++)
        {
            boolean primo = esPrimo(numero);
            if(primo)
                System.out.println("\tNumero primo -> " + numero);
        }
    }

    public static boolean esPrimo(int numero) {
        // Comprobamos si el numero es primo
        boolean primo = true;
        for(int divisor = 2; divisor <= numero/2; divisor++)
        {
            if(numero%divisor == 0)
                primo = false;
        }
        return primo;
    }
    
}
