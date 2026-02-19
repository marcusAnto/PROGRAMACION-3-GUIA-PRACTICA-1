
package eje3_prog3;

class NumeroEvaluador {
        public void evaluar(int numero) {

        String resultado = (numero > 0) ? "El numero es positivo."
                          : (numero < 0) ? "El numero es negativo."
                          : "El numero es cero.";

        System.out.println(resultado);
    }
}
