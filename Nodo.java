public class Nodo {

    private Entrada entrada;
    Nodo padre;
    Nodo left;
    Nodo right;


    public void inorder() {
        if (left != null) {
        	left.inorder();
        }
        this.visit();
        if (right != null) {
        	right.inorder();
        }
    }

    public void visit()
    {
        String english = this.getEntrada().valueEnglish;
        String spanish = this.getEntrada().valueSpanish;
        String french = this.getEntrada().valueFrench;

        System.out.println( "(" + english + "," + spanish + "," + french + ")"  );
    }


    
    public String visit_english(String key){
    	
        if (entrada.getKey() == key) {
        	return  entrada.getValueEnglish();
        }else {
        	return "*" + key + "*";
        }
    }
    
    public String visit_spanish(String key)
    {
        if (entrada.getKey() == key) {
        	return  entrada.getValueSpanish();
        }else {
        	return "*" + key + "*";
        }
    }
    
    public String visit_french(String key)
    {
        if (entrada.getKey() == key) {
        	return  entrada.getValueFrench();
        }else {
        	return "*" + key + "*";
        }
    }

	/**
	 * @return the entrada
	 */
	public Entrada getEntrada() {
		return entrada;
	}

	/**
	 * @param entrada the entrada to set
	 */
	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}

}