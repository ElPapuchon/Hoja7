
import javax.swing.*;
import java.io.*;
import java.util.*;

/**
 * @author jiio2
 *13/04/2021 - 15:07:47
 * 
 */


public class Main {

     public static void main(String [] args) {

		 
    	 		BST ingles = new BST();
    	 		
    	 		String oracion = "The woman asked me to do my homework about my town";
    	 		
    	 		String [] data = oracion.split(" ");
    	 		
    	 		ingles.Insertar(1, "house", "casa", "loger");
    	 		ingles.Insertar(1, "woman", "mujer", "femme");
    	 		ingles.Insertar(1, "town", "pueblo", "ville");
    	 		
    	 		System.out.println(ingles.Find_french("woman"));
    	 		System.out.println(ingles.Find_french(data[1]));
    	 		System.out.println(data[1].compareToIgnoreCase("woman"));
    	 		System.out.println(data[1].equalsIgnoreCase("woman"));

	 }
}
