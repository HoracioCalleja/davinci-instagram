package instagram;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Mensaje {
	private Usuario enviadoPor;
	private String mensaje;
	private LocalDateTime fechaEnviada;
	private List<Usuario> meGustas = new ArrayList<Usuario>();

	public Mensaje(Usuario enviadoPor, String mensaje) {
		this.fechaEnviada = LocalDateTime.now();
		this.enviadoPor = enviadoPor;
	}

	public String getMensaje() {
		return "Enviado por: " + getEnviadoPor() + "\nMensaje : " + this.mensaje + "\n fecha enviada :"
				+  getFechaEnviada();
	}

	public String getEnviadoPor() {
		return enviadoPor.getNombreUsuario();
	}

	public String getFechaEnviada() {
		return fechaEnviada.toString();
	}

	public int getMeGustas() {
		return this.meGustas.size();
	}

	public void sumarMeGusta(Usuario usuario) {
		this.meGustas.add(usuario);
	}

	public String getUsuariosConMegusta() {
		String likesDeUsuarios = "";
		this.meGustas.stream().forEach(user -> likesDeUsuarios.concat("" + user.getNombre() + "\n"));
		return likesDeUsuarios;
	}

}
