package ejer2_pro3;

import java.util.Scanner;

class Login {
    private final String U_CORRECTO = "PROGRA3";
    private final String PASS_CORRECTO = "123";

    public void validarCredenciales(Scanner entrada) {

        int intentos = 0;

        while (intentos < 3) {

            System.out.print("Ingrese usuario: ");
            String usuario = entrada.nextLine();

            System.out.print("Ingrese contraseña: ");
            String password = entrada.nextLine();

            if (usuario.isEmpty() || password.isEmpty()) {
                System.out.println("Error: Los campos no pueden estar vacIos.");
                System.out.println("Intento " + (intentos + 1) + " de 3\n");
                intentos++;
                continue;
            }

            if (usuario.equals(U_CORRECTO) && 
                password.equals(PASS_CORRECTO)) {

                System.out.println("Bienvenido!");
                return;
            } else {
                System.out.println("Credenciales incorrectas.");
                System.out.println("Intento " + (intentos + 1) + " de 3\n");
                intentos++;
            }
        }

        System.out.println("Ha superado los 3 intentos. El programa se cerrara.");
    }
}
