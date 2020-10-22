package instagram;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Publicacion {

	private Usuario usuario;
	private int id;
	private Archivo contenido;
	private String titulo;
	private String descripcion;
	private List<Usuario> etiquetas;
	private String ubicacion;
	private Date fechaPublicada;
	private List<String> hashtags;
	private List<Usuario> meGustas;
	private List<Comentario> comentarios;

	Publicacion(Usuario usuario, Archivo contenido) {
		this.usuario = usuario;
		this.etiquetas = new ArrayList<Usuario>();
		this.hashtags = new ArrayList<String>();
		this.meGustas = new ArrayList<Usuario>();
		this.comentarios = new ArrayList<Comentario>();
		this.id = new Random().nextInt(255);
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Publicacion de " + usuario.getNombreUsuario() + "\nContenido: " + this.contenido.toString()
				+ "\nTitulo : " + this.getTitulo() + "\nDescripcion : " + this.getDescripcion()
				+ "\nCantidad de 'me gusta': " + this.getMeGustas().size() + "\nCantidad de comentarios: "
				+ this.getComentarios().size();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Archivo getContenido() {
		return contenido;
	}

	public void setContenido(Archivo contenido) {
		this.contenido = contenido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Usuario> getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(List<Usuario> etiquetas) {
		this.etiquetas = etiquetas;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Date getFechaPublicada() {
		return fechaPublicada;
	}

	public void setFechaPublicada(Date fechaPublicada) {
		this.fechaPublicada = fechaPublicada;
	}

	public List<String> getHashtags() {
		return hashtags;
	}

	public void setHashtags(List<String> hashtags) {
		this.hashtags = hashtags;
	}

	public List<Usuario> getMeGustas() {
		return meGustas;
	}

	public void setMeGustas(List<Usuario> meGustas) {
		this.meGustas = meGustas;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void configurarPublicacion() {
		String opcion = "";
		do {
			opcion = JOptionPane.showInputDialog(
					"Elija entre las siguientes opciones:\n1 - Titulo\n2 - Descripcion\n3 - Ubicacion\n4 para finalizar la creación de la publicacion");
			if (!opcion.equalsIgnoreCase("4")) {
				switch (opcion) {
				case "1":
					String titulo = JOptionPane.showInputDialog("Ingrese el titulo: ");
					this.setTitulo(titulo);
					break;
				case "2":
					String descripcion = JOptionPane.showInputDialog("Ingrese una descripcion: ");
					this.setDescripcion(descripcion);
					break;
				case "3":
					String ubicacion = JOptionPane.showInputDialog("Ingrese una ubicación: ");
					this.setUbicacion(ubicacion);
					break;

				default:
					break;
				}
			}

		} while (!opcion.equals("4"));

	}


	public void subirPublicacion() {
		this.usuario.getPerfil().subirPublicacion(this);
	}
	
	

}
