
package ejer5_prog5;

class Calculadora {
public void operar(double num1, double num2, String clave) {

        switch (clave) {

            case "+" -> System.out.println("Resultado: " + (num1 + num2));

            case "-" -> System.out.println("Resultado: " + (num1 - num2));

            case "*" -> System.out.println("Resultado: " + (num1 * num2));

            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre 0.");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
        }

            case "R", "r" -> {
                if (num1 < 0 || num2 < 0) {
                    System.out.println("Error: No se puede obtener raiz cuadrada de números negativos.");
                } else {
                    System.out.println("Raiz cuadrada del primero: " + Math.sqrt(num1));
                    System.out.println("Raiz cuadrada del segundo: " + Math.sqrt(num2));
                }
        }
            case "E", "e" -> {
                double potencia = Math.pow(num1, num2);
                potencia = Math.round(potencia * 1000.0) / 1000.0;
                System.out.println("Resultado: " + potencia);
        }

            default -> System.out.println("Clave no valida.");
        }
    }    
}
