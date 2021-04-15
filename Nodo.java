// TODO: Auto-generated Javadoc
/**
 * The Class Nodo.
 */

/**
 * @author jiio2
 *13/04/2021 - 15:06:33
 * 
 */
public class Nodo {

    /** The entrada. */
    private Entrada entrada;
    
    /** The padre. */
    Nodo padre;
    
    /** The izquierdo. */
    Nodo izquierdo;
    
    /** The derecho. */
    Nodo derecho;


    /**
     * Ordenar.
     */
    public void ordenar() { //esta funci�n es recursiva para ordenar el �rbol
        if (izquierdo != null) {
            izquierdo.ordenar();
        }
        this.visitar();
        if (derecho != null) {
            derecho.ordenar();
        }
    }

    /**
     * Visitar.
     */
    public void visitar(){ // esta funci�n nos da el foramto de impresi�n del orden en ingl�s
        String english = this.getEntrada().valueEnglish;
        String spanish = this.getEntrada().valueSpanish;
        String french = this.getEntrada().valueFrench;

        System.out.println( "(" + english + "," + spanish + "," + french + ")"  );
    }
    
    /**
     * Visit english.
     *
     * @param key the key
     * @return the string
     */
    public String visit_english(String key) { // nos regresa el valor de la palabra en ingles asignado a "key"

        	return  entrada.getValueEnglish();

    }
    
    /**
     * Visit spanish.
     *
     * @param key the key
     * @return the string
     */
    public String visit_spanish(String key) { // nos regresa el valor de la palabra en ingles asignado a "key"

    	return  entrada.getValueSpanish();

}
    
    /**
     * Visit french.
     *
     * @param key the key
     * @return the string
     */
    public String visit_french(String key){ // nos regresa el valor de la palabra en frances asignado a "key"

        	return  entrada.getValueFrench();

    }

    /**
     * Gets the entrada.
     *
     * @return the entrada
     */
    public Entrada getEntrada() {
        return entrada;
    }

    /**
     * Sets the entrada.
     *
     * @param entrada the new entrada
     */
    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
}
