package instagram;

public class Main {

	public static void main(String[] args) {

		Usuario horacio = new Usuario("Horacio", "Calleja", "callejah@hotmail.com", "asdasd123123", "horacito");
		Usuario carlos = new Usuario("Carlos", "Lopez", "carlos@hotmail.com", "asdasd123123", "carlitos");


		carlos.seguir(horacio);
		horacio.seguir(carlos);

		Publicacion publicacion = horacio.crearPublicacion();

		horacio.subirPublicacion(publicacion);

		publicacion.darMeGusta(carlos);

		publicacion.comentar(carlos, "Linda foto horacito");

		System.out.println(publicacion.verComentarios());

		System.out.println(carlos.getFeed());

	}

}
