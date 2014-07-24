/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 2
 * Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 * Calc.java
 */
package calc;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Isa
 */


public class Calc {

    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String> miStack = new StackArrayList<String>(); 
        int numero;
        double n1;
        double n2;
        String sCadenaSinBlancos = "";
        // TODO code application logic here
        
        File f = new File( "C:\\Users\\E. de Mata\\Desktop\\texto.txt" );
        
        BufferedReader entrada;
        
        try {
            
        entrada = new BufferedReader( new FileReader( f ) );
        String linea;
        
        while(entrada.ready()){
            linea = entrada.readLine();
            System.out.println(linea);
            linea = linea.substring(0);
            System.out.println(linea);
            numero = linea.length(); 
            System.out.println(numero); 
        
            for (int x=0; x < linea.length(); x++) {
                if (linea.charAt(x) != ' '){
                    sCadenaSinBlancos += linea.charAt(x);
                }
            }
            
            System.out.println(sCadenaSinBlancos);
            
            for(int x=0; x<sCadenaSinBlancos.length(); x++){
                String dato =  Character.toString(sCadenaSinBlancos.charAt(x));
                
                if( (dato.equals("+") || dato.equals("-") || dato.equals("*") || dato.equals("/")) != true){
                    miStack.push(dato);
                }
                    
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("+")){
                    n1 = Double.parseDouble(miStack.pop());
                    n2 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 + n2));
                }

                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("-")){
                    n1 = Double.parseDouble(miStack.pop());
                    n2 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 - n2));
                }

                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("*")){
                    n1 = Double.parseDouble(miStack.pop());
                    n2 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 * n2));
                }

                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("/")){
                    n1 = Double.parseDouble(miStack.pop());
                    n2 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 / n2));
                }
                
            }
            
            System.out.println(miStack.pop());
            
        }
        }catch (IOException e) {
        e.printStackTrace();
        }
    }
    
}
