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

	public void setUpFeed() {
		setUpHistorias();
		this.setUpPublicaciones();
	}

	private void setUpPublicaciones() {
		for (Usuario seguidos : this.usuario.getSeguidos()) {
			seguidos.getPerfil().getPublicaciones().stream()
					.forEach(publicacion -> this.publicaciones.add(publicacion));
		}
	}

	private void setUpHistorias() {
		for (Usuario seguidos : this.usuario.getSeguidos()) {
			if (seguidos.getPerfil().isHistoriaActiva()) {
				this.historias.add(seguidos.getPerfil().getHistoria());
			}
		}
	}

	public List<Publicacion> getPublicaciones() {
		return this.publicaciones;
	}

	public String getFeed() {
		setUpFeed();
		System.out.println("Estás en el feed");
		return "Hisitorias : " + this.historias.toString() + "\nPublicaciones: " + this.publicaciones.toString();
	}

}
