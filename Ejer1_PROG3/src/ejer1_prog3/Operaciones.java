/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1_prog3;

/**
 *
 * @author marco
 */
class Operaciones {
        public void calcularMayorYRaiz(double num1, double num2) {
        double mayor;

        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }

        double raizCubica = Math.cbrt(mayor);

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("La raiz cubica del numero mayor es: " + raizCubica);
    }
}
