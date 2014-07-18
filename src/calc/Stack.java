/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 2
 * Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 * Stack.java
 * 
 */
package calc;

/**
 *
 * @author Konoha
 */
public interface Stack<E> 
{

   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   public int size();
   // post: returns the number of elements in the stack

}
