package instagram;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comentario {

	private Usuario enviadoPor;
//	private Date fechaEnviada;
	private String mensaje;
	private List<Usuario> meGustas = new ArrayList<Usuario>();

	Comentario(Usuario enviadoPor, String mensaje) {
		this.mensaje = mensaje;
		this.enviadoPor = enviadoPor;
	}

	public Usuario getEnviadoPor() {
		return enviadoPor;
	}

	public void setEnviadoPor(Usuario enviadoPor) {
		this.enviadoPor = enviadoPor;
	}

//	public Date getFechaEnviada() {
//		return fechaEnviada;
//	}
//
//	public void setFechaEnviada(Date fechaEnviada) {
//		this.fechaEnviada = fechaEnviada;
//	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<Usuario> getMeGustas() {
		return meGustas;
	}

	public void setMeGustas(List<Usuario> meGustas) {
		this.meGustas = meGustas;
	}

	public String toString() {
		return "\nEnviado por: " + this.enviadoPor.getNombreUsuario() + "\nMensaje: " + this.mensaje + "\nMe gustas: " + meGustas.size();
	}

}
