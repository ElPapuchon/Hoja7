import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.jupiter.api.Test;


/**
 * 
 */

/**
 * @author jiio2
 *15/04/2021 - 00:52:43
 * 
 */
class BSTTest {
	
	private BST arbol = new BST();
	
	String oracion = "The woman asked me to do my homework about my town";
	
	String [] data = oracion.split(" ");
	
	String palabra_ingles = "homework";
	String palabra_espanol = "tarea";
	String palabra_frances = "devoirs";
	
	public BSTTest() {
    }
	
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void tearDown() {
    }
    
    @Test
    public void traducir_espanol_test() {
    	
    	arbol.Insertar(1, palabra_ingles, palabra_espanol, palabra_frances);
    	
    	assertEquals("tarea",  arbol.Find_spanish(palabra_ingles));
    	
    }
    
    @Test
    public void traducir_frances_test() {
    	
    	arbol.Insertar(1, palabra_ingles, palabra_espanol, palabra_frances);
    	
    	assertEquals("devoirs",  arbol.Find_french(palabra_ingles));
    	
    }
    
    @Test
    public void traducir_ingles_test() {
    	
    	arbol.Insertar(2, palabra_ingles, palabra_espanol, palabra_frances);
    	
    	assertEquals("homework",  arbol.Find_english(palabra_espanol));
    	
    }
        


}
