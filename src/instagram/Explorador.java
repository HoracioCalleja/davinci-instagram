package instagram;

import java.util.ArrayList;
import java.util.List;

public class Explorador implements Buscador {

	List<Publicacion> publicaciones;
	Usuario usuario;

	Explorador(Usuario usuario) {
		this.usuario = usuario;
		this.publicaciones = setUpFeed(usuario);
	}

	@Override
	public void buscar(String input) {
		// TODO Auto-generated method stub
	}

	public List<Publicacion> setUpFeed(Usuario usuario) {
		List<Publicacion> publicacionesUsuario = new ArrayList<>();
		for (Usuario usuarioSeguido : usuario.getSeguidores()) {
			usuarioSeguido.getPerfil().getPublicaciones().stream()
					.forEach(publicacion -> publicacionesUsuario.add(publicacion));
		}
		return publicacionesUsuario;
	}

	public List<Publicacion> getPublicaciones() {
		return this.publicaciones;
	}

	public void setPublicaciones(List<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}

}
