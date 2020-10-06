package instagram;

public abstract class Archivo {

	int peso;
	String nombre;
	String ubicacion;
	String extension;

	Archivo(String nombre, String ubicacion, String extension, int peso) {
		this.nombre = nombre;
		this.extension = extension;
		this.peso = peso;
		this.ubicacion = ubicacion;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
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

	public abstract void cargarArchivo();

	public abstract String toString();
}
