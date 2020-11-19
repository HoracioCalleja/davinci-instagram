package instagram;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Usuario {

	private String nombre;
	private String apellido;
	private String email;
	private String contrasenia;
	private String nombreUsuario;
	private List<Usuario> mejoresAmigos;
	private List<Usuario> seguidores;
	private List<Usuario> seguidos;
	private Perfil perfil;
	private List<Actividad> actividades;
	private Explorador explorador;
	private Feed feed;
	private List<Chat> chats;
	private List<Historia> historias;

	Usuario(String nombre, String apellido, String email, String contrasenia, String nombreUsuario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.contrasenia = contrasenia;
		this.nombreUsuario = nombreUsuario;
		this.mejoresAmigos = new ArrayList<Usuario>();
		this.seguidores = new ArrayList<Usuario>();
		this.seguidos = new ArrayList<Usuario>();
		this.perfil = new Perfil(this.nombreUsuario);
		this.actividades = new ArrayList<Actividad>();
		this.explorador = new Explorador(this);
		this.feed = new Feed(this);
		this.chats = new ArrayList<Chat>();
		this.historias = new ArrayList<Historia>();
	}

	public List<Usuario> getMejoresAmigos() {
		return mejoresAmigos;
	}

	public void setMejoresAmigos(ArrayList<Usuario> mejoresAmigos) {
		this.mejoresAmigos = mejoresAmigos;
	}

	public List<Usuario> getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(ArrayList<Usuario> seguidores) {
		this.seguidores = seguidores;
	}

	public List<Usuario> getSeguidos() {
		return seguidos;
	}

	public void setSeguidos(ArrayList<Usuario> seguidos) {
		this.seguidos = seguidos;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public List<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(ArrayList<Actividad> actividades) {
		this.actividades = actividades;
	}

	public Explorador getExplorador() {
		return explorador;
	}

	public void setExplorador(Explorador explorador) {
		this.explorador = explorador;
	}

	public String getFeed() {
		return this.feed.getFeed();
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}

	public List<Chat> getChats() {
		return chats;
	}

	public void setChats(ArrayList<Chat> chats) {
		this.chats = chats;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public void seguir(Usuario usuario) {
		if (this.seguidos.contains(usuario)) {
			System.out.println("Ya sigue a este usuario");
		} else {
			this.seguidos.add(usuario);
			usuario.seguidores.add(usuario);
			System.out.println("Comenzando a seguir a " + usuario.getNombreUsuario());
		}
	}

	public void dejarDeSeguir(Usuario usuario) {
		if (!this.seguidos.contains(usuario)) {
			System.out.println("No puede dejar de seguir a alguien que no sigue");
		} else {
			this.seguidos.remove(usuario);
			usuario.seguidores.remove(usuario);
			System.out.println("Dejando de seguir a " + usuario);
		}
	}

	public void agregarMejorAmigo(Usuario usuario) {
		if (this.seguidores.size() < 1) {
			System.out.println("Aún no tiene seguidores para agregar a mejores amigos");
		} else if (!this.seguidores.contains(usuario)) {
			System.out.println("No puede agregar a alguien que no lo sigue");
		} else {
			this.mejoresAmigos.add(usuario);
		}
	}

	public void eliminarMejorAmigo(Usuario usuario) {
		if (this.mejoresAmigos.size() < 1) {
			System.out.println("Aún no tiene seguidores mejores amigos");
		} else if (!this.mejoresAmigos.contains(usuario)) {
			System.out.println("No puede eliminar a alguien que no lo está en mejores amigos");
		} else {
			this.mejoresAmigos.remove(usuario);
		}
	}

	private Archivo crearContenido() {

		String opcion;
		do {
			opcion = JOptionPane.showInputDialog("¿Foto o video? \n1 - Foto\n2 - Video\n3 - Salir");
			if (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3")) {
				JOptionPane.showMessageDialog(null, "Ingrese:\n1 -> para foto\n2 -> para video\n3 -> para salir");
			} else {
				if (opcion.equals("3")) {
					JOptionPane.showMessageDialog(null, "CANCELANDO LA CREACION DE CONTENIDO...");
					return null;
				}
				String nombre = JOptionPane.showInputDialog("Nombre del archivo: ");
				String ubicacion = JOptionPane.showInputDialog("Ubicacion (ej : galeria/amigos): ");
				String extension = JOptionPane.showInputDialog("Extension (ej: .jpg - .mp4): ");
				String peso = JOptionPane.showInputDialog("Peso (ej: 123kb): ");
				switch (opcion) {
				case "1":
					String alto = JOptionPane.showInputDialog("Alto (ej: 123px): ");
					String ancho = JOptionPane.showInputDialog("Ancho (ej: 123px): ");
					Archivo foto = new Foto(nombre, ubicacion, extension, peso, ancho, alto);
					System.out.println(foto.toString());
					return foto;
				case "2":
					String duracion = JOptionPane.showInputDialog("Duracion del video: ");
					Archivo video = new Video(nombre, ubicacion, extension, peso, duracion);
					System.out.println(video.toString());
					return video;

				default:
					break;
				}
			}
		} while (!opcion.equals("3"));

		return null;

	}

	public Publicacion crearPublicacion() {
		Archivo contenido = crearContenido();
		Publicacion publicacion = new Publicacion(this, contenido);
		publicacion.configurarPublicacion();
		System.out.println("PUBLICACION CREADA: \n" + publicacion.toString());
		return publicacion;
	}

	public void subirPublicacion(Publicacion publicacion) {
		this.perfil.subirPublicacion(publicacion);
	}

	public List<Historia> getHistorias() {
		return historias;
	}

	public void setHistorias(List<Historia> historias) {
		this.historias = historias;
	}

}
