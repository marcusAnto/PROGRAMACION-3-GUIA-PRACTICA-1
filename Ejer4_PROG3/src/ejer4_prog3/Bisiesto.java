
package ejer4_prog3;

class Bisiesto {
        public void mostrarBisiestos(int inicio, int fin) {

        System.out.println("Años bisiestos en el rango:");

        for (int año = inicio; año <= fin; año++) {

            if ((año % 4 == 0 && año % 100 != 0) || 
                (año % 100 == 0 && año % 400 == 0)) {

                System.out.println(año);
            }
        }
    }
}
