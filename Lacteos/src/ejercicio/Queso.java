package ejercicio;

public class Queso {
	
	private String tipo;
	private int cantidad_leche;
	private double peso;
	public Queso() {
		
	}
	public Queso(String tipo_leche, int cantidad_leche, double peso) {
		this.setTipo(tipo_leche);
		this.setCantidad_leche(cantidad_leche);
		this.setPeso(peso);
	}
	
	public void imprimir_cabecera () {
		System.out.println("QUESOS ENTREPINARES");
		System.out.println("Registro Sanitario No 52/38751");
		System.out.println("Para consultar el lote del producto revise la etiqueta");
		imprimir_detalle(); }
	
	public void imprimir_detalle() {
		System.out.println("Peso: " + this.peso);
		System.out.println("Tipo de leche: " +this.tipo);
		System.out.println("Cantidad de leche: " + this.cantidad_leche);
	}
	
	String getTipo() {
		return tipo;
	}
	void setTipo(String tipo_leche) {
		this.tipo = tipo_leche;
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
