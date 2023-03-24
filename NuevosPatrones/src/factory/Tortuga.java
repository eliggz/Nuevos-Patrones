package factory;

public class Tortuga implements Animal {

	@Override
	public void hacerSonido() {
		System.out.println("Tortuga ha hecho un sonido: Ah ah ah ah");
		
	}

	@Override
	public void comer() {
		System.out.println("Tortuga se ha alimentado con lechuga");
		
	}

	@Override
	public void dormir() {
		System.out.println("Tortuga ha dormido 6 horas: z z z z... ah");

	}

}
