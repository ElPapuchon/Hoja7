
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 *
 * @author jiio2
 * 13/04/2021 - 15:07:47
 */


public class Main {

     /**
      * The main method.
      *
      * @param args the arguments
      */
     public static void main(String [] args) {

		 Object[] options = {"Español - Inglés", "Espanol - Francés",// creamos un array de opciones
				 "Inglés - Francés", "Inglés - Español",
				 "Francés - Español", "Francés - Inglés"};
		 Object[] functions = {"Imprimir Inglés Ordenado", "Traducir una oración", "Salir"}; // creamos un array de funciones
		 
		// instanciamos los árboles
		 
		 BST ingles = new BST(); 
		 BST espanol = new BST();
		 BST frances = new BST();

		 try {// leemos el archivo de texto
			 File myObj = new File("diccionario.txt");
			 Scanner myReader = new Scanner(myObj);
			 while (myReader.hasNextLine()) {
				 String data = myReader.nextLine();
				 String[] values = data.split(","); // lo separamos por comas
				 
				 
				 //agregamos las palabras a los árboles 
				 
				 ingles.Insertar(1, values[0], values[1], values[2]); 
				 espanol.Insertar(2, values[0], values[1], values[2]);
				 frances.Insertar(3, values[0], values[1], values[2]);
			 }

		 } catch (FileNotFoundException e) {
			 System.out.println("An error occurred.");
			 e.printStackTrace();
		 }


		 int acciones = 0;

		 while (acciones != 2) {
			 int accion = JOptionPane.showOptionDialog(null,
					 "¿Qué acción desea realizar?",// preguntamos la acción
					 "Opciones",
					 JOptionPane.YES_NO_CANCEL_OPTION,
					 JOptionPane.QUESTION_MESSAGE,
					 null,
					 functions,
					 functions[0]);

			 if (accion == 0) {// imprimimos el árbol ordenado
				 System.out.println("\nEl Arbol ordenado en ingles es: \n");
				 ingles.ImprimirOrdenado();

			 } else if (accion == 1) {
				 int respuesta = JOptionPane.showOptionDialog(null,
						 "¿Qué traducción desea?",	// traducciones uqe puede escoger
						 "Traducciones Disponibles",
						 JOptionPane.YES_NO_CANCEL_OPTION,
						 JOptionPane.QUESTION_MESSAGE,
						 null,
						 options,
						 options[0]);

				 try {// leemos el archivo de la oracion
					 File myObj = new File("oracion.txt");
					 Scanner myReader = new Scanner(myObj);
					 while (myReader.hasNextLine()) {
						 String data = myReader.nextLine();
						 String[] values = data.split(" ");// lo separamos por espacio
						 
						 //traducimos según la la opcion ingresada por el usuario
						 if (respuesta == 0) {
							 //espanol-ingles

							 espanol.traducir(espanol, 0, values);

						 } else if (respuesta == 1) {
							 //espanol-frances

							 espanol.traducir(espanol, 1, values);


						 } else if (respuesta == 2) {
							 //ingles-frances

							 ingles.traducir(ingles, 1, values);

							 }


						  else if (respuesta == 3) {
							 //ingles-espanol

							 ingles.traducir(ingles, 2, values);

						 } else if (respuesta == 4) {
							 //frances-espanol

							 frances.traducir(frances, 2, values);

						 } else if (respuesta == 5) {
							 //frances-ingles
							 frances.traducir(frances, 0, values);
						 }
					 }
				 } catch (FileNotFoundException e) {
					 System.out.println("An error occurred.");
					 e.printStackTrace();
				 }

			 }else {
				 acciones = 2;// se finaliza el programa
			 }


		 }


	 }
}
