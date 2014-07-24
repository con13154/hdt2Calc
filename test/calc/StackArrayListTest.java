/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        Object expResult = null;
        Object result = prueba.pop();
        assertEquals(dato, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    @Test
    public void testPeek() {
        System.out.println("JUnit Peek ArrayList");
        StackArrayList prueba = new StackArrayList();
        String esperado = "1";
        prueba.push(esperado);
        //Object expResult = null;
        Object result = prueba.peek();
        assertEquals(esperado, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
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
        int result = prueba.size();
        assertEquals(esperado, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEmpty() {
        System.out.println("JUnit ArrayList Vacia");
        StackArrayList instance = new StackArrayList();
        boolean resultado = true;
        boolean result = instance.empty();
        assertEquals(resultado, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
