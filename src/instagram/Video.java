package instagram;

public class Video extends Archivo {

	private int duracion;
	
	Video(String nombre, String ubicacion, String extension, int peso, int duracion) {
		super(nombre, ubicacion, extension, peso);
		this.duracion = duracion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public void cargarArchivo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Video - Peso: " + super.getPeso() + " - Duracion: " + this.getDuracion() + "\n Nombre: " + this.getNombre() + this.getExtension();
	}
	
	
	
	
	
}
