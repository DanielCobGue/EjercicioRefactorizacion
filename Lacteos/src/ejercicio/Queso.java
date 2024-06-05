package ejercicio;

public class Queso {
	
	private String tipo_leche;
	private int cantidad_leche;
	private double peso;
	public Queso() {
		
	}
	public Queso(String tipo_leche, int cantidad_leche, double peso) {
		this.setTipo_leche(tipo_leche);
		this.setCantidad_leche(cantidad_leche);
		this.setPeso(peso);
	}
	String getTipo_leche() {
		return tipo_leche;
	}
	void setTipo_leche(String tipo_leche) {
		this.tipo_leche = tipo_leche;
	}
	int getCantidad_leche() {
		return cantidad_leche;
	}
	void setCantidad_leche(int cantidad_leche) {
		this.cantidad_leche = cantidad_leche;
	}
	double getPeso() {
		return peso;
	}
	void setPeso(double peso) {
		this.peso = peso;
	}
	
}
