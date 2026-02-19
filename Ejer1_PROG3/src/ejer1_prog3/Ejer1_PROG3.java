//Haciendo uso de la entrada de datos, indíquele al usuario que ingrese 2 números,
//almacénelos en sus respectivas variables y determine lo siguiente:
//➢ Cuál de ellos es el número mayor (No puede hacer uso de estructuras de
//datos).
//➢ Obtenga la raíz cubica del número mayor encontrado.


package ejer1_prog3;

import java.util.Scanner;

public class Ejer1_PROG3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = entrada.nextDouble();

        Operaciones op = new Operaciones();
        op.calcularMayorYRaiz(num1, num2);
    }
    
}
