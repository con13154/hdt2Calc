/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 2
 * Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 * StackEjemplo.java
 */

package calc;

/**
 *
 * @author Konoha
 */

public class StackEjemplo {
  public static void main(String[] args) {
    Stack<String> miStack = new StackArrayList<String>();
    miStack.push("Adios");  //1
	miStack.push("Hola");   //2

    String cadena = miStack.pop();
    System.out.println(cadena);
	cadena = miStack.pop();
	System.out.println(cadena);
  }
}
