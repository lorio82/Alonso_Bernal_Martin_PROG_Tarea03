
package tarea03;

import java.util.regex.*;

 /**
 * Clase Poscion que define objetos posicion caracterizados por un número de fila y un carácter de columna
 * @author: Martín Alonso Bernal
 * @version: 11/2017
 */

public class Posicion {
    
    static int fila;
    static char columna;

    /**
     * Método constructor Posicion que recibe los parámetros fila y columna. Comprueba que éstos sean correctos
     * y en caso afirmativo crea un objeto posicion con los valores que se le han pasado como parámetros. 
     * De lo contrario se le asigna unos valores predeterminados. 
     * @param fila Número Entero
     * @param columna Carácter
    */
    public Posicion(int fila, char columna) {
        Pattern pat = Pattern.compile("[a-h]");
        Matcher mat = pat.matcher(String.valueOf(columna));
        Pattern patFila = Pattern.compile("[1-8]");
        Matcher matFila = patFila.matcher(String.valueOf(fila));

        

        if (mat.find() && matFila.find()) {
            this.fila = fila;
            this.columna = columna;  
        } else {
            this.fila = 1;
            this.columna = 'a';         
        }
    } //Cierre del constructor
}