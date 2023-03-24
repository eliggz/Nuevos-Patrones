package factory;

public class Perro implements Animal{

	@Override
	public void hacerSonido() {
		System.out.println("Perro ha hecho un sonido: Guau guau!");
		
	}

	@Override
	public void comer() {
		System.out.println("Perro se ha alimentado con Scooby-galletas");
		
	}

	@Override
	public void dormir() {
		System.out.println("Perro ha dormido 12 horas: z z z z...");
		
	}

}
