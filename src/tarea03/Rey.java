
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
     * Método que crea una cadena de caracteres con los valores de color y posicion. 
     * @return String  Devuelve una cadena de caracteres con los valores de color y
     * posicion.
     */
    @Override
    public String toString() {  
        
            return "Rey " + color + "," + posicion + "%n";
      
    }//Cierre del método
}
