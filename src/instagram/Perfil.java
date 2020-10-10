package instagram;

import java.util.ArrayList;
import java.util.List;

public class Perfil {

	private String nombre;
	private List<Publicacion> publicaciones = new ArrayList<Publicacion>();
	private boolean esPrivado = false;
	private String descripcion;
	private String estado;
	private String sitioWeb;
	private String presentacion;
	private int telefono;
	private String genero;
	private List<Publicacion> publicacionesGuardadas = new ArrayList<Publicacion>();;
	private List<Historia> historiasGuardadas = new ArrayList<Historia>();

	Perfil(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(List<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}

	public boolean esPrivado() {
		return esPrivado;
	}

	public void setEsPrivado(boolean esPrivado) {
		this.esPrivado = esPrivado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSitioWeb() {
		return sitioWeb;
	}

	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Publicacion> getPublicacionesGuardadas() {
		return publicacionesGuardadas;
	}

	public void setPublicacionesGuardadas(List<Publicacion> publicacionesGuardadas) {
		this.publicacionesGuardadas = publicacionesGuardadas;
	}

	public List<Historia> getHistoriasGuardadas() {
		return historiasGuardadas;
	}

	public void setHistoriasGuardadas(List<Historia> historiasGuardadas) {
		this.historiasGuardadas = historiasGuardadas;
	}

}
