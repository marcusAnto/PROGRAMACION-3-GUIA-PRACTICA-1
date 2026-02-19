// Cree un programa que solicite un numero entero por medio de teclado.
//Haciendo uso del operador ternario determine lo siguiente:
//➢ Si el numero ingresado es positivo.
//➢ Si el numero ingresado es negativo.
//➢ Si el numero ingresado es cero.
package eje3_prog3;

import java.util.Scanner;


public class Eje3_PROG3 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        NumeroEvaluador evaluador = new NumeroEvaluador();
        evaluador.evaluar(numero);
    }
    
}
