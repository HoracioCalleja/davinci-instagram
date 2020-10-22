package instagram;

public class Historia {
	//atributos
	private Usuario usuario;
	private Archivo contenido;
	private int tiempoActivo;
	private String fechaSubida;
	private boolean  mejoresAmigos;
	
	
	//constructor
	Historia(Usuario usuario, int tiempoActivo, String fechaSubida, boolean mejoresAmigos){
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
	public void subirHistoria(Archivo contenido, String fechaSubida) {
		System.out.println("Historia subida!");
		
	}
	
	public void crearHistoria() {
		System.out.println("Historia creada!");
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
