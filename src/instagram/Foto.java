package instagram;

public class Foto extends Archivo {

	private int ancho;
	private int alto;

	Foto(String nombre, String ubicacion, String extension, int peso, int ancho, int alto) {
		super(nombre, ubicacion, extension, peso);
		this.ancho = ancho;
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	@Override
	public void cargarArchivo() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "FOTO: \n" + "Nombre: " + this.getNombre() + this.getExtension() + " - Peso: " + super.getPeso() + " - Alto: " + this.getAlto() + " - Ancho: " + this.getAncho() ;
	}

}
