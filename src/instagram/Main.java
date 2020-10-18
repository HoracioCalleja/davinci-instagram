package instagram;

public class Main {

	public static void main(String[] args) {

	
	Usuario horacio = new Usuario("Horacio","Calleja","callejah@hotmail.com","asdasd123123","horacito");
	Usuario carlos = new Usuario("Carlos","Lopez","carlos@hotmail.com","asdasd123123","carlitos");
	Archivo video005 = new Video("Vacaciones", "Pinamar", ".wav", "30mb", "35seg");
	Historia subirHist = new Historia(carlos, 24, "18/10/2020", true); // es la configuración con la cual inicia el objeto Historias
	
	System.out.println(video005.toString());
	
	
	subirHist.subirHistoria(video005, "18/10/2020"); //metodo para subirlo
			
	carlos.seguir(horacio);
	horacio.seguir(carlos);
	
	
	
	System.out.println(horacio.getFeed());
	
	Archivo contenido = horacio.crearContenido();
	
	Publicacion publicacion = horacio.crearPublicacion(contenido);
	
	horacio.subirPublicacion(publicacion);
	
	System.out.println(carlos.getFeed().getFeed()); 
	
	}

}
