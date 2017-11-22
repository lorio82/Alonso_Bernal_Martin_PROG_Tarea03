
package tarea03;

/**
 * Clase Rey que define objetos rey determinados por su color y su posición
 * @author: Martín Alonso Bernal
 * @version: 11/2017
 */
public class Rey {
    private static Color color;
    private static Posicion posicion;
    
    final String ERROR = "Movimiento incorrecto se sale de los límites del tablero";
    String errorPosicion;

    
    /**
     * Método constructor Rey que recibe el parámetro color. Crea un objeto posición con unos parámetros 
     * predeterminados dependiendiendo del valor del atributo color. 
     * @param color Color Puede ser blanco o negro.
    */
    public Rey(Color color) {            
        this.color = color;
        switch (color) {
            case BLANCO:
                posicion = new Posicion(1, 'e');
                break;
            case NEGRO:
                posicion = new Posicion(8, 'e');
                break;
        }
    }//Cierre del constructor
    
    /**
     * Método constructor por Defecto que asigna por defecto
     * el color blanco y crea un objeto posicion
     * con los parámmetros predeterminados para éste.
    */
    public Rey() {   
        this.color = Color.BLANCO;
        posicion = new Posicion(1, 'e');
    }//Cierre del constructor por defecto
    
    /**
     * Método para obtener el valor del enumerado Color almacenado en el atributo color
     * @return color Color enum 
    */
    public Color getColor() {
        return color;
    }//Cierre del método

    /**
     * Método para obtener el valor de la posicion almacenada en el atributo posicion.
     * @return posicion String 
    */
    public Posicion getPosicion() {
        return posicion;
    }//Cierre del método
    
        /**
     * Método mueve recibe una dirección como parámetro y si la nueva posicion es válida,
 modifica los atributos del objeto posicion según este parámetro,
 de lo contrario lanza un mensaje de error.
     * @param direccion Direccion
    */
    public void mueve(Direccion direccion) {  

        // El siguiente if determinará la modificación a realizar según el valor del parámetro color del método constructor.
        if (color == Color.NEGRO) {
            /**
             * En el siguiente switch indicamos al programa como proceder según la dirección recibida como parámetro.
             * En el caso de que el movimiento no esté permitido (por salirse de los límites del tablero)
             * asignaremos el valor del literall ERROR a la variable errorPosicion
             */ 
            switch (direccion) {
                case NORTE:
                    if (Posicion.fila == 1) {
                        errorPosicion = ERROR;
                    }
                    else {
                    posicion.setFila(--Posicion.fila);
                    }
                    break;
                case NORESTE:
                    if (Posicion.fila == 1 || Posicion.columna == 'a') {
                         errorPosicion = ERROR;
                    }
                    else {
                    posicion.setFila(--Posicion.fila);
                    posicion.setColumna(--Posicion.columna);
                    }
                    break;
                case ESTE:
                    if (Posicion.columna == 'a') {
                         errorPosicion = ERROR;
                    }
                    else {
                    posicion.setColumna(--Posicion.columna);
                    }
                    break;
                case SURESTE:
                    if (Posicion.fila == 8 || Posicion.columna == 'a') {
                        errorPosicion = ERROR;
                    }
                    else {
                    posicion.setFila(++Posicion.fila);
                    posicion.setColumna(--Posicion.columna);
                    }
                    break;
                case SUR:
                    if (Posicion.fila == 8) {
                        errorPosicion = ERROR;
                    }
                    else {
                    posicion.setFila(++Posicion.fila);
                    }
                    break;
                case SUROESTE:
                    if (Posicion.fila == 8 || Posicion.columna == 'h') {
                        errorPosicion = ERROR;
                    }
                    else {
                    posicion.setFila(++Posicion.fila);
                    posicion.setColumna(++Posicion.columna);
                    }
                    break;
                case OESTE:
                    if (Posicion.columna == 'h') {
                        errorPosicion = ERROR;
                    }
                    else {
                    posicion.setColumna(++Posicion.columna);
                    }
                    break;
                case NOROESTE:
                    if (Posicion.fila == 1 || Posicion.columna == 'h') {
                        errorPosicion = ERROR;
                    }
                    else {
                    posicion.setFila(--Posicion.fila);
                    posicion.setColumna(++Posicion.columna);
                    }
                    break;
            }
        } 
        
        else {
            switch (direccion) {

                case NORTE:
                    if (Posicion.fila == 8) {
                        
                    }
                    else {
                    posicion.setFila(++Posicion.fila);
                    }
                    break;
                case NORESTE:
                    if (Posicion.fila == 8 || Posicion.columna == 'h') {
                        errorPosicion = ERROR;
                    }
                    else {
                    posicion.setFila(++Posicion.fila);
                    posicion.setColumna(++Posicion.columna);
                    }
                    break;
                case ESTE:
                    if (Posicion.columna == 'h') {
                        errorPosicion = ERROR;
                    }
                    else {
                    posicion.setColumna(++Posicion.columna);
                    }
                    break;
                case SURESTE:
                    if (Posicion.fila == 1 || Posicion.columna == 'h') {
                        errorPosicion = ERROR;
                    }
                    else {
                    posicion.setFila(--Posicion.fila);
                    posicion.setColumna(++Posicion.columna);
                    }
                    break;
                case SUR:
                    if (Posicion.fila == 1) {
                        errorPosicion = ERROR;
                    }
                    else {
                    posicion.setFila(--Posicion.fila);
                    }
                    break;
                case SUROESTE:
                    if (Posicion.fila == 1 || Posicion.columna == 'a') {
                        errorPosicion = ERROR;
                    }
                    else {
                    posicion.setFila(--Posicion.fila);
                    posicion.setColumna(--Posicion.columna);
                    }
                    break;
                case OESTE:
                    if (Posicion.columna == 'a') {
                        errorPosicion = ERROR;
                    }
                    else {
                    posicion.setColumna(--Posicion.columna);
                    }
                    break;
                case NOROESTE:
                    if (Posicion.fila == 8 || Posicion.columna == 'a') {
                         errorPosicion = ERROR;
                    }
                    else {
                    posicion.setFila(++Posicion.fila);
                    posicion.setColumna(--Posicion.columna);                   
                    }
                    break;
            }
        }
    }//Cierre del método
    /**
     * Método que crea una cadena de caracteres con los valores de color y posicion.
     * Si la direccion pasada como parámetro no es correcta informará del error
     * junto a la información anteriormente descrita. 
     * @return String  Devuelve una cadena de caracteres con los valores de color y
     * posicion, e informa del error si es necesario.  
     */
    @Override
    public String toString() {  
        /**
         * En el caso de que el contenido de la variable errorPosicion sea igual al del literal ERROR el resultado
         * de este método devolverá na cadena de caractéres informando del error junto la información relativa al
         * color y la posicion, si por el contrario la nueva dirección es correcta devolverá una cadena de 
         * caractéres informando del color y la nueva posición.
         */
        if (errorPosicion == ERROR) {
            return  errorPosicion + "%n" + "Rey " + color +"," + posicion + "%n";
        }
        else {
            return "Rey " + color + "," + posicion + "%n";
        }       
    }//Cierre del método
}//Cierrre de la clase
