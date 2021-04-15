

public class Entrada {
    public String key;
    public String valueEnglish;
    public String valueSpanish;
    public String valueFrench;

    public Entrada()
    {

    }

    public Entrada(int turno ,String key, String value1, String value2){
    	if(turno == 1) {
	        this.key=key;
	        this.valueEnglish=key;
	        this.valueSpanish = value1;
	        this.valueFrench = value2;
    	}else if(turno== 2) {
	        this.key=value1;
	        this.valueEnglish=key;
	        this.valueSpanish = value1;
	        this.valueFrench = value2;
    		
    	}else {
	        this.key=value2;
	        this.valueEnglish=key;
	        this.valueSpanish = value1;
	        this.valueFrench = value2;
    	}
    }


	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the valueEnglish
	 */
	public String getValueEnglish() {
		return valueEnglish;
	}

	/**
	 * @param valueEnglish the valueEnglish to set
	 */
	public void setValueEnglish(String valueEnglish) {
		this.valueEnglish = valueEnglish;
	}

	/**
	 * @return the valueSpanish
	 */
	public String getValueSpanish() {
		return valueSpanish;
	}

	/**
	 * @param valueSpanish the valueSpanish to set
	 */
	public void setValueSpanish(String valueSpanish) {
		this.valueSpanish = valueSpanish;
	}

	/**
	 * @return the valueFrench
	 */
	public String getValueFrench() {
		return valueFrench;
	}

	/**
	 * @param valueFrench the valueFrench to set
	 */
	public void setValueFrench(String valueFrench) {
		this.valueFrench = valueFrench;
	}

}