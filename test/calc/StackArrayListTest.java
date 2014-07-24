/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 2
 * Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 * StackArrayListTest.java
 * 
 */
package calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isa
 */
public class StackArrayListTest {
    
    public StackArrayListTest() {
    }
    
   
    @Test
    public void testPop() {
        System.out.println("JUnit Pop ArrayList");
        StackArrayList prueba = new StackArrayList();
        String dato ="J";
        prueba.push(dato);
        dato = "A";
        prueba.push(dato);
        dato = "V";
        prueba.push(dato);
        dato = "A";
        prueba.push(dato);
        Object resultado = prueba.pop();
        assertEquals(dato, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testPeek() {
        System.out.println("JUnit Peek ArrayList");
        StackArrayList prueba = new StackArrayList();
        String esperado = "1";
        prueba.push(esperado);
        //Object expResult = null;
        Object resultado = prueba.peek();
        assertEquals(esperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    public void testSize() {
        System.out.println("JUnit Tamaño ArrayList");
        StackArrayList prueba = new StackArrayList();
        int esperado =4;
        String dato ="J";
        prueba.push(dato);
        dato = "A";
        prueba.push(dato);
        dato = "V";
        prueba.push(dato);
        dato = "A";
        prueba.push(dato);
        int resultado = prueba.size();
        assertEquals(esperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    public void testEmpty() {
        System.out.println("JUnit ArrayList Vacia");
        StackArrayList instance = new StackArrayList();
        boolean esperado = true;
        boolean resultado = instance.empty();
        assertEquals(esperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
