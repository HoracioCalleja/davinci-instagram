package instagram;

import java.util.ArrayList;
import java.util.List;

public class Feed {

	List<Publicacion> publicaciones = new ArrayList<Publicacion>();
	List<Historia> historias = new ArrayList<Historia>();
	Usuario usuario;

	public Feed(Usuario usuario) {
		this.usuario = usuario;

	}

	public void setUpFeed(Usuario usuario) {
		this.historias = setUpHistorias(usuario);
		this.publicaciones = setUpPublicaciones(usuario);
	}

	private List<Publicacion> setUpPublicaciones(Usuario usuarioSeguido) {
		List<Publicacion> publicacionesUsuario = new ArrayList<>();
		for (Usuario seguidos : usuarioSeguido.getSeguidores()) {
			seguidos.getPerfil().getPublicaciones().stream()
					.forEach(publicacion -> publicacionesUsuario.add(publicacion));
		}
		return publicacionesUsuario;
	}

	private List<Historia> setUpHistorias(Usuario usuarioSeguido) {
		List<Historia> historiasUsuario = new ArrayList<>();
		for (Usuario seguidos : usuarioSeguido.getSeguidores()) {
			if (seguidos.getPerfil().isHistoriaActiva()) {
				historiasUsuario.add(seguidos.getPerfil().getHistoria());
			}
		}
		return historiasUsuario;
	}
	
	public List<Publicacion> getPublicaciones (){
		return this.publicaciones;
	}
	
	public String getFeed () {
		return "";
	}

}
