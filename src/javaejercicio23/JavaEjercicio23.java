/*
 * Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
   elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación. 
 */
package javaejercicio23;

import java.util.Scanner;

public class JavaEjercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de A: ");
        a = scanner.nextDouble();

        System.out.println("Ingrese el valor de B: ");
        b = scanner.nextDouble();

        System.out.println("Ingrese el valor de C: ");
        c = scanner.nextDouble();

        // se cálcula el valor del discriminante 
        double discriminante = b * b - 4 * a * c;

        // Proceso y salida de resultados
        if (discriminante > 0) {
            // dos posibles soluciones distintas
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            // Solución doble (dos soluciones reales iguales)
            double x = -b / (2 * a);
            System.out.println("La solución doble es: x = " + x);
        } else {
            // Dos soluciones complejas conjugadas
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("Las soluciones complejas son: "
                    + "x1 = " + parteReal + " + " + parteImaginaria + "i"
                    + " y x2 = " + parteReal + " - " + parteImaginaria + "i");
        }
    }
    
}
