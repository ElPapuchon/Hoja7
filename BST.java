// TODO: Auto-generated Javadoc
/**
 * The Class BST.
 */

/**
 * @author jiio2
 *13/04/2021 - 15:07:00
 * 
 */
public class BST{
    
    /** The root. */
    Nodo root;

    /**
     * Find french.
     *función para encontrar una palabra en francés
     * @param key the key
     * @return the string
     */
    public String Find_french(String key) {
        Nodo node = root; // hacemos un nodo raíz
        while (node != null) { // mientras no lleguemos al final del árbol entonces
            int comp = key.compareToIgnoreCase(node.getEntrada().key); //comparamos la "key" ingresada con la "key" del nodo
            // la función compareTo regresa los siguientes valores
            // Positivo si key > node.key
            //  Negativo si key < node.key
            // 0 si son iguales
            if (comp < 0) {
                node = node.izquierdo;
            } else if (comp > 0) {
                node = node.derecho;
            } else {
            
                return node.visit_french(key); // en el caso de que sean iguales vamos a traer la palabra linkeada a la "key"
            }

        }
        return "*" + key + "*"; // si no encuentra ninguna palabra con esa "key" regresa la "key" entre asteriscos como se solicitaba 

    }

    /**
     * Find spanish.
     *función para encontrar una palabra en español
     * @param key the key
     * @return the string
     */
    public String Find_spanish(String key) {
        Nodo node = root;// hacemos un nodo raíz
        while (node != null) {// mientras no lleguemos al final del árbol entonces
            int comp = key.compareToIgnoreCase(node.getEntrada().key); //comparamos la "key" ingresada con la "key" del nodo
            
            // la función compareTo regresa los siguientes valores
            // Positivo si key > node.key
            //  Negativo si key < node.key
            // 0 si son iguales
            if (comp < 0) { 
                node = node.izquierdo;
            } else if (comp > 0) {
                node = node.derecho;
            } else {

                return node.visit_spanish(key); // en el caso de que sean iguales vamos a traer la palabra linkeada a la "key"
            }

        }
        return "*" + key + "*"; // si no encuentra ninguna palabra con esa "key" regresa la "key" entre asteriscos como se solicitaba 


    }

    /**
     * Find english.
     *función para encontrar una palabra en inglés
     * @param key the key
     * @return the string
     */
    public String Find_english(String key) {
        Nodo node = root;// hacemos un nodo raíz
        while (node != null) {// mientras no lleguemos al final del árbol entonces
            int comp = key.compareToIgnoreCase(node.getEntrada().key); //comparamos la "key" ingresada con la "key" del nodo
            
            // la función compareTo regresa los siguientes valores
            // Positivo si key > node.key
            //  Negativo si key < node.key
            // 0 si son iguales
            if (comp < 0) { 
                node = node.izquierdo;
            } else if (comp > 0) {
                node = node.derecho;
            } else {

                return node.visit_english(key); // en el caso de que sean iguales vamos a traer la palabra linkeada a la "key"
            }

        }
        return "*" + key + "*"; // si no encuentra ninguna palabra con esa "key" regresa la "key" entre asteriscos como se solicitaba 


    }

    /**
     * Insertar.
     *
     * @param turno the turno
     * @param key the key
     * @param value1 the value 1
     * @param value2 the value 2
     * @return the entrada
     */
    public Entrada Insertar(int turno, String key, String value1, String value2) {
        if (root == null) {
            root = new Nodo();
            root.setEntrada(new Entrada(turno, key, value1, value2)); //generamos una nueva entrada con los parámetros necesarios
            return root.getEntrada();
        }
        Nodo node = root;
        Nodo newNode = new Nodo();
        newNode.setEntrada(new Entrada(turno, key, value1, value2));

        while (node != null) {
            int comp =  key.compareToIgnoreCase(node.getEntrada().key);
            if (comp < 0) {
            	// si la key < node.key entonces lo guardamos en el nodo izquierdo
                if (node.izquierdo == null) {
                    node.izquierdo = newNode;
                    newNode.padre = node;
                    return newNode.getEntrada();
                } else {
                    node = node.izquierdo;
                }
            } else if (comp > 0) { // si la key > node.key entonces lo guardamos en el nodo derecho

                if (node.derecho == null) {

                    node.derecho = newNode;
                    newNode.padre = node;
                    return newNode.getEntrada();
                } else {
                    node = node.derecho;
                }
            } else {
            // si son iguales las reingresamos en el nodo izquierdo 
                node = node.izquierdo;
            }
        }
        return null;
    }


    /**
     * Imprimir ordenado.
     */
    public void ImprimirOrdenado() { // función para imprimir ordenado con la palabra inglés
        root.ordenar();
    }

    /**
     * Traducir.
     *funcion traducir 
     * @param arbol the arbol
     * @param turno the turno
     * @param data the data
     */
    public void traducir(BST arbol, int turno, String [] data){
        String resultado = ""; // para almacenar el resultado
        if(turno == 0){
            for(int i = 0; i < data.length; i++){

                resultado = resultado + " " +  arbol.Find_english(data[i]); // buscamos las palabras de la oracion  
            }
        System.out.println("\nLa traducción en ingles es: ");
        System.out.println(resultado);// mostramos el resultado

        }else if(turno == 1){
            for(int i = 0; i < data.length; i++){

                resultado = resultado + " " + arbol.Find_french(data[i]);// buscamos las palabras de la oracion  
            }
            System.out.println("\nLa traducción en frances es: ");
            System.out.println(resultado);// mostramos el resultado

        }else if (turno == 2){
            for(int i = 0; i < data.length; i++){

                resultado = resultado + " " + arbol.Find_spanish(data[i]);// buscamos las palabras de la oracion 
            }
            
            System.out.println("\nLa traducción en espaniol es: ");
            System.out.println(resultado);// mostramos el resultado

        }

    }

}

