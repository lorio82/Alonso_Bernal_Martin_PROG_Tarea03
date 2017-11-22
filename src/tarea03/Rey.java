
package tarea03;

/**
 * Clase Rey que define objetos rey determinados por su color y su posición
 * @author: Martín Alonso Bernal
 * @version: 11/2017
 */
public class Rey {
    private static Color color;
    private static Posicion posicion;
    
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
    
}
