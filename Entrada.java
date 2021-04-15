

// TODO: Auto-generated Javadoc
/**
 * The Class Entrada.
 *
 * @author jiio2
 * 13/04/2021 - 15:05:58
 */
public class Entrada {
    
    /** The key. */
    public String key;
    
    /** The value english. */
    public String valueEnglish;
    
    /** The value spanish. */
    public String valueSpanish;
    
    /** The value french. */
    public String valueFrench;


    /**
     * Instantiates a new entrada.
     *
     * @param turno the turno
     * @param key the key
     * @param value1 the value 1
     * @param value2 the value 2
     */
    public Entrada(int turno, String key,String value1, String value2) {// hacemos un costructor con 3 casos para los 3 tipos de árboles (español, ingles, frances)
		if (turno == 1) {
			this.key = key;
			this.valueEnglish = key;
			this.valueSpanish = value1;
			this.valueFrench = value2;
		} else if (turno == 2){
			this.key=value1;
			this.valueEnglish = key;
			this.valueSpanish = value1;
			this.valueFrench = value2;
		}else if (turno == 3){
			this.key=value2;
			this.valueEnglish = key;
			this.valueSpanish = value1;
			this.valueFrench = value2;
		}
	}


	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Sets the key.
	 *
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Gets the value english.
	 *
	 * @return the valueEnflish
	 */
	public String getValueEnglish() {
		return valueEnglish;
	}

	/**
	 * Sets the value english.
	 *
	 * @param valueEnglish the valueEnglish to set
	 */
	public void setValueEnglish(String valueEnglish) {
		this.valueEnglish = valueEnglish;
	}

	/**
	 * Gets the value spanish.
	 *
	 * @return the valueSpanish
	 */
	public String getValueSpanish() {
		return valueSpanish;
	}

	/**
	 * Sets the value spanish.
	 *
	 * @param valueSpanish the valueSpanish to set
	 */
	public void setValueSpanish(String valueSpanish) {
		this.valueSpanish = valueSpanish;
	}

	/**
	 * Gets the value french.
	 *
	 * @return the valueFrench
	 */
	public String getValueFrench() {
		return valueFrench;
	}

	/**
	 * Sets the value french.
	 *
	 * @param valueFrench the valueFrench to set
	 */
	public void setValueFrench(String valueFrench) {
		this.valueFrench = valueFrench;
	}
    

}