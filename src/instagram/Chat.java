package instagram;

import java.util.ArrayList;
import java.util.List;

public class Chat {

	private String nombre;
	private List<Usuario> integrantes = new ArrayList<>();
	private List<Mensaje> mensajes = new ArrayList<>();

	public Chat(String nombre, Usuario usuario, Mensaje mensaje) {
		this.nombre = nombre;
		this.integrantes.add(usuario);
		this.mensajes.add(mensaje);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarUsuario(Usuario usuario) {
		this.integrantes.add(usuario);
	}
	
	public void eliminarUsuario(Usuario usuario) {
		this.integrantes.remove(usuario);
	}

	public Mensaje crearMensaje (Usuario usuario, String mensaje) {
		return new Mensaje(usuario,mensaje);
	}
	
}
