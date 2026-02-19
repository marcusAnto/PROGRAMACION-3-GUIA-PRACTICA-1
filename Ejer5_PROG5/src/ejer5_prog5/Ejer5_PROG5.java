// Cree un programa que solicite 2 números reales y también una clave desde
//teclado.
//Según sea la clave deberá realizar la operación con los números solicitados
//Las claves disponibles son las siguientes:
//➢ La clave + realiza una suma.
//➢ La clave - realiza una resta.
//➢ La clave * realiza una multiplicación.
//➢ La clave / realiza una división (Debe validar el no hacer divisiones entre 0).
//➢ La clave R obtiene la raíz cuadra de ambos números.
//➢ La clave E eleva el primer número con el segundo (debe redondear
//decimales a máximo 3).

package ejer5_prog5;

import java.util.Scanner;


public class Ejer5_PROG5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = entrada.nextDouble();
        entrada.nextLine(); // limpiar buffer

        System.out.print("Ingrese la clave de operacion (+, -, *, /, R, E): ");
        String clave = entrada.nextLine();

        Calculadora calc = new Calculadora();
        calc.operar(num1, num2, clave);
    }
    
}
