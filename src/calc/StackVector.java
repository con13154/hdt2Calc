/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 2
 * Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 * StackVector.java
 */

package calc;

import java.util.Vector;

/**
 *
 * @author Konoha
 */
public class StackVector<E> implements Stack<E>{

    protected   Vector<E> data;
    protected   int indice   = 0;
    
    public StackVector()
	// post: constructs a new, empty stack
    {
            data = new Vector<E>();
    }
    
    public void push(E item) {
        data.add(item);
    }

    public E pop() {       
        E item = data.lastElement();
        data.remove(data.size()-1);
        return item;
    }

    
    public E peek() {
        return data.get(size() - 1);
    }

    
    public boolean empty() {
        return size() == 0;
    }

    public int size() {
        return data.size();
    }
    
}
