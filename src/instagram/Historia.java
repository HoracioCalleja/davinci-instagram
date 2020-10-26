package instagram;

public class Historia {

	private Usuario usuario;
	private Archivo contenido;
	private int tiempoActivo;
//	private String fechaSubida;
	private boolean mejoresAmigos;

	Historia(Usuario usuario, Archivo contenido) {
		this.usuario = usuario;
		this.contenido = contenido;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public Archivo getContenido() {
		return this.contenido;
	}

	public void subirHistoria() {

		System.out.println("Subiendo...");
		String nombre = usuario.getNombreUsuario();
		System.out.println("El usuario: " + nombre + " subió nuevo contenido en sus historias.");

	}

	public void crearHistoria() {
		String fecha = "18/10/2020";
		String cont = contenido.toString();
		System.out.println("¡Historia creada!\n" + cont);
	}

	public void contestarHistoria() {
		System.out.println("Historia respondida!");
	}

	public void compartirHistoria() {
		System.out.println("Historia compartida!");
	}

	public void guardarHistoria() {
		System.out.println("Historia guardada");
	}

	public void verHistoria() {
		System.out.println("Ver historia");
	}

	public void borrarHistoria() {
		System.out.println("");
	}

	public int getTiempoActivo() {
		return tiempoActivo;
	}

	public void setTiempoActivo(int tiempoActivo) {
		this.tiempoActivo = tiempoActivo;
	}

	public boolean isMejoresAmigos() {
		return mejoresAmigos;
	}

	public void setMejoresAmigos(boolean mejoresAmigos) {
		this.mejoresAmigos = mejoresAmigos;
	}

}
