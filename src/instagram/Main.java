package instagram;

public class Main {

	public static void main(String[] args) {

	
	//Usuario horacio = new Usuario("Horacio","Calleja","callejah@hotmail.com","asdasd123123","horacito");
	//Usuario carlos = new Usuario("Carlos","Lopez","carlos@hotmail.com","asdasd123123","carlitos");
	
	// flujo de historia
	Usuario cristian = new Usuario("Cristian","Del Canto","cristiandelcanto880@gmail.com","mipass22","Cris007");
	Archivo video005 = new Video("Vacaciones", "Pinamar", ".wav", "30mb", "35seg");
	Historia historia = new Historia(cristian, 24, true); // es la configuración con la cual inicia el objeto Historias
	
	

	
	historia.crearHistoria(cristian, video005); //se crea la historia para subirla.
	
	
	
	
	
	
	//carlos.seguir(horacio);
	//horacio.seguir(carlos);
	
	
	
	//System.out.println(horacio.getFeed());
	
	//Archivo contenido = horacio.crearContenido();
	
	//Publicacion publicacion = horacio.crearPublicacion(contenido);
	
	//horacio.subirPublicacion(publicacion);
	
	//System.out.println(carlos.getFeed().getFeed()); 
	
	}

}
