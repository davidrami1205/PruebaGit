package com.ejemploSpring.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
	//Crear los métodos para las rutas
	@GetMapping("/")// ruta raiz
	public String bienvenida() {
		return "<h1>Bienvenido a mi primer Spring!</h1>";
	}
	
	@GetMapping("/producto/{id}")
	public String leerProducto(@PathVariable int id) {
		String art;
		double precio;
		switch(id) {
		case 123:
			art="Computador";
			precio=25000000;
			break;
		case 124:
			art="Mouse";
			precio=30000;
			break;
		case 125:
			art="Impresora";
			precio=780000;
			break;
		default:
			art="El producto no existe: ";
			precio=0;
			break;
		}
		return "Código: " + id + "<br/>Producto: " + art + "<br/>Precio: " + precio;
	}
}
