package instagram;

public class Historia {
	//atributos
	private Usuario usuario;
	private Archivo contenido;
	private int tiempoActivo;
	private String fechaSubida;
	private boolean  mejoresAmigos;
	
	
	//constructor
	Historia(Usuario usuario, int tiempoActivo, boolean mejoresAmigos){
		this.usuario = usuario;
		//this.contenido = contenido; -> metodo subirHistoria
		this.tiempoActivo = tiempoActivo; //en horas
		//this.fechaSubida = fechaSubida; -> metodo subirHistoria
		this.mejoresAmigos = mejoresAmigos;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public Archivo getContenido() {
		return this.contenido;
	}
	
	//metodos
	
	// subirHistoria pide un archivo del dispositivo, crearHistoria abre la camara en la app.
	public void subirHistoria(Usuario usuario, Archivo contenido, String fechaSubida) {
		
		System.out.println("Subiendo...");
		String nombre = usuario.getNombreUsuario();
		usuario.setHistorias(usuario, contenido);
		System.out.println("El usuario: "+nombre+" subió nuevo contenido en sus historias.");
		
	}
	
	public void crearHistoria(Usuario usuario, Archivo contenido) {
		String fecha = "18/10/2020"; //crear nueva fecha
		String cont = contenido.toString();
		System.out.println("¡Historia creada!\n"+cont);
		subirHistoria(usuario, contenido, fecha);
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
	
	//getter and setters	
	public int getTiempoActivo() {
		return tiempoActivo;
	}


	public void setTiempoActivo(int tiempoActivo) {
		this.tiempoActivo = tiempoActivo;
	}


	public String getFechaSubida() {
		return fechaSubida;
	}


	public void setFechaSubida(String fechaSubida) {
		this.fechaSubida = fechaSubida;
	}


	public boolean isMejoresAmigos() {
		return mejoresAmigos;
	}


	public void setMejoresAmigos(boolean mejoresAmigos) {
		this.mejoresAmigos = mejoresAmigos;
	}
	
	
}
