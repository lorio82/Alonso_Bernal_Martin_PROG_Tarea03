package tarea03;

import utilidades.Entrada;

/**
 * Clase Principal que contiene el método main que al ser ejecutado muestra un
 * un menú para la elección del color de la pieza. Si la entrada es correcta
 * muestra a continuacón un segundo menú en el que se da a elegir entre; obtener
 * información de la pieza, mover la pieza y salir del programa. En el caso de
 * elegir mover la pieza se muestra un nuevo menú en el que se ofrecen los
 * distintos movimientos posibles.
 *
 * @author: Martín Alonso Bernal
 * @version: 11/2017
 */
public class Principal {

    private static Rey rey;
    private static Direccion direccion;

    public static void main(String[] args) {

        final String ENUN_COLOR = "Elija el color de sus piezas:%n1.BLANCAS%n2.NEGRAS%n";
        final String ERROR_COLOR = "Introcuzca un número correcto.%n1 para jugar con el rey blanco o%n2 para jugar con el rey negro%n";
        final String MENU = "%n%nElija una acción:%n1.Informe posición. 2. Mover. 3. Salir.%n";
        final String ERROR_MENU = "%nElija una acción correcta.%n";

        final String ERROR_DIRECCION = "%nMovimiento no válido. Escoja una dirección válida%n";

        //Muestra el menú de selección de color
        System.out.printf(ENUN_COLOR);
        int eligeColor = Entrada.entero();

        // Si la entrada no es correcta muestra un mensaje de error y vuelve a mostrar el menú.
        while ((eligeColor != 1) && (eligeColor != 2)) {
            System.err.printf(ERROR_COLOR);
            eligeColor = Entrada.entero();
        }

        // Asignamos el color al objeto.
        switch (eligeColor) {
            case 1:
                rey = new Rey(Color.BLANCO);
                break;
            case 2:
                rey = new Rey(Color.NEGRO);
                break;
        }

        /**
         * Con el siguiente while el programa nos mostrará el menú para
         * seleccionar una acción mientras no elijamos la opción 3, que es que
         * la utilizada para salir del programa. Si la entrada no es correcta se
         * mostrará un mensaje de eeor y volverá a mostrar el menú de acciones
         * disponibles.
         */
        int eligeAccion = 0;
        while (eligeAccion != 3) {

            System.out.printf(MENU);
            eligeAccion = Entrada.entero();
            while ((eligeAccion < 1) || (eligeAccion > 3)) {
                System.err.printf(ERROR_MENU);
                System.out.printf(MENU);
                eligeAccion = Entrada.entero();
            }

            switch (eligeAccion) {
                case 1:
                    System.out.printf(rey.toString());
                    break;
                case 2:

                    /**
                     * Devuelve un array que contiene todas las constantes tipo direccion con el mismo 
                     * orden en el que fueron declarados.
                     * @return array Direccion
                     */
                    Direccion.values();

                    /**
                     *  Bucle for que devuelve los literales tipo direccion junto a un entero que indica su
                     *  posición en el array más uno. 
                     */
                    for (Direccion d : Direccion.values()) {
                        String nombreDireccion = d.toString();
                        int num = d.ordinal() + 1;
                        System.out.printf("%d.%s ", num, nombreDireccion);
                        num++;
                    }

                    int eligeDireccion = Entrada.entero();

                    while ((eligeDireccion < 1) || (eligeDireccion >= 9)) {
                        System.err.printf(ERROR_DIRECCION);
                        for (Direccion d : Direccion.values()) {
                            String nombreDireccion = d.toString();
                            int num = d.ordinal() + 1;
                            System.out.printf("%d.%s ", num, nombreDireccion);
                            num++;
                        }
                        eligeDireccion = Entrada.entero();
                    }

                    /**
                     * En el siguiente switch establecemos un valor determinado
                     * para la variable direccion según el número introducido en
                     * el menú de dirección
                     */
                    switch (eligeDireccion) {
                        case 1:
                            direccion = Direccion.NORTE;

                            break;
                        case 2:
                            direccion = Direccion.NORESTE;

                            break;
                        case 3:
                            direccion = Direccion.ESTE;

                            break;
                        case 4:
                            direccion = Direccion.SURESTE;

                            break;
                        case 5:
                            direccion = Direccion.SUR;

                            break;
                        case 6:
                            direccion = Direccion.SUROESTE;

                            break;
                        case 7:
                            direccion = Direccion.OESTE;

                            break;
                        case 8:
                            direccion = Direccion.NOROESTE;
                            break;
                    }

                    /**
                     * Invocamos el método mueve de la instancia rey pasándole
                     * el valor de la variable dirección como parámetro.
                     */
                    rey.mueve(direccion);

                    /**
                     * En el caso de que el movimiento elegido no sea correcto
                     * el programa muestra un mensaje de error informando del
                     * problema
                     */
                    if (rey.errorPosicion == rey.ERROR) {
                        System.err.printf(rey.toString());
                    }

                    rey.errorPosicion = "";

                    break;
            }
        }
    }
}
