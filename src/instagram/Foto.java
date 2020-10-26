package instagram;

public class Foto extends Archivo {

	private String ancho;
	private String alto;

	Foto(String nombre, String ubicacion, String extension, String peso, String ancho, String alto) {
		super(nombre, ubicacion, extension, peso);
		this.ancho = ancho;
		this.alto = alto;
	}

	public String getAncho() {
		return ancho;
	}

	public void setAncho(String ancho) {
		this.ancho = ancho;
	}

	public String getAlto() {
		return alto;
	}

	public void setAlto(String alto) {
		this.alto = alto;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTipo: FOTO" + "\nAlto: " + this.getAlto() + "\nAncho: " + this.getAncho();
	}

}
