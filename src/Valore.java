import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Valore implements Serializable{
	
	//Attributi
	private int tipo;
	private String testo;
	private int numero;
	private Date giorno;
	private Boolean inserito;
	
	
	//Costruttori
	public Valore(int _tipo){
		tipo=_tipo;
		inserito= false;
	}
	
	//Metodi
	
	
	
	public void removeValore(){
		inserito=false;
	}
	
	
	// Getters and Setters 
	public Object getValore() {
		switch(tipo){
		case 0:
			return testo;
		case 1:
			return numero;
			
		case 2:
			return giorno;
		
		case 3:
			return testo;
			
		}
		return tipo;
		
		
	}
	
	
	
	
	public void setValore(String testo) {
		this.testo = testo;
		inserito=true;
	}
	public void setValore(int numero) {
		this.numero = numero;
		inserito=true;
	}
	public void setValore(Date giorno) {
		this.giorno = giorno;
		inserito=true;
	}

	public int getTipo() {
		return tipo;
		
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
		
	}

	public Boolean getInserito() {
		return inserito;
	}

	public void setInserito(Boolean inserito) {
		this.inserito = inserito;
	}
	
	
	
	
	
	
	
	
	

}