package instagram;



public class Main {

	public static void main(String[] args) {

	
	Usuario horacio = new Usuario("Horacio","Calleja","callejah@hotmail.com","asdasd123123","horacito");
	Usuario carlos = new Usuario("Carlos","Lopez","carlos@hotmail.com","asdasd123123","carlitos");
	
	carlos.seguir(horacio);
	System.out.println(horacio.getSeguidores());
	carlos.dejarDeSeguir(horacio);
	System.out.println(horacio.getSeguidores());
	}

}
