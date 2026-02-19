//Cree un programa que solicite 2 datos por teclado, estos serán el usuario y
//contraseña, para este ejercicio solo se tienen 3 oportunidades para el ingreso de
//estas credenciales, al realizar las 3 oportunidades el programa se cerrará, debe
//considerar lo siguiente:
//➢ Debe validar que el contenido ingresado no este vacío.
//➢ Se sabe que las credenciales son:
//Usuario: PROGRA3
//Password: 123.
package ejer2_pro3;

import java.util.Scanner;

public class Ejer2_PRO3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Login sistema = new Login();
        sistema.validarCredenciales(entrada);
    }
    
}
