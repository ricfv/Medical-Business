package Negocio;

import java.util.ArrayList;

import Dominio.Producto_Manufacturado;

public interface ServicioProductoManufacturado {
	ArrayList<Producto_Manufacturado> productos();

	boolean generaRegistro(int id, String descripcion, String nombre, String tipo, double precio);

	ArrayList<Producto_Manufacturado> obtenerInformacionProductos();
	

}
