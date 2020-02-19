package Dominio;

public class Producto_Manufacturado {
	
	public Producto_Manufacturado(int id, String tipo, String descripcion, double costo, String nombre) {
		super();
		Id = id;
		Tipo = tipo;
		Descripcion = descripcion;
		Costo = costo;
		Nombre = nombre;
	}
	public Producto_Manufacturado() {
		// TODO Auto-generated constructor stub
	}
	private int Id;
	private String Tipo;
	private String Descripcion;
	private double Costo;
	private String Nombre;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id_Manufacturado) {
		Id = id_Manufacturado;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getCosto() {
		return Costo;
	}
	public void setCosto(double costo) {
		Costo = costo;
	}
	
}
