public class Iniciar {

	public static void main(String[]args) {
		
		Editora gerador = new Editora();
		gerador.addObserver(new Jose());
		gerador.addObserver(new Maria());
		gerador.addObserver(new Joao());
	}
	
}
