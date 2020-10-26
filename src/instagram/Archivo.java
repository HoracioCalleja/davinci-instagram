package instagram;

public abstract class Archivo {

	String peso;
	String nombre;
	String ubicacion;
	String extension;

	Archivo(String nombre, String ubicacion, String extension, String peso) {
		this.nombre = nombre;
		this.extension = extension;
		this.peso = peso;
		this.ubicacion = ubicacion;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	
	@Override
	public String toString() {
		return "Archivo: \nNombre: " + this.getNombre() + this.getExtension() + " - Peso: " + this.getPeso();
	}
}
