package instagram;

public class Video extends Archivo {

	private String duracion;

	Video(String nombre, String ubicacion, String extension, String peso, String duracion) {
		super(nombre, ubicacion, extension, peso);
		this.duracion = duracion;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return super.toString() + "\nVIDEO" + "\nDuracion: " + this.getDuracion();
	}

}
