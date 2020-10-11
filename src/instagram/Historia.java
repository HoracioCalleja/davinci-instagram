package instagram;

public class Historia {
	//atributos
	private Usuario usuario;
	private Archivo contenido;
	private int tiempoActivo;
	private String fechaSubida;
	private boolean  mejoresAmigos;
	
	
	//constructor
	Historia(Usuario usuario, Archivo contenido, int tiempoActivo, String fechaSubida, boolean mejoresAmigos){
		this.usuario = usuario;
		this.contenido = contenido;
		this.tiempoActivo = tiempoActivo;
		this.fechaSubida = fechaSubida;
		this.mejoresAmigos = mejoresAmigos;
	}
	
	//metodos
	public void subirHistoria() {
		System.out.println("Historia subida!");
	}
	
	public void crearHistoria() {
		//quizás se puede crear un objeto "camara" que tenga de metodos grabar o sacar foto
		//luego lo usamos de parametro, resolveria varias cosas
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
