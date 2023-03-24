package factory;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		
		Animal elAnimal = null;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Qué animal quieres visitar? M / P / T");
		String animal = userInput.nextLine();
		elAnimal = animalFactory.crearAnimal(animal);
		
		if(elAnimal != null) {
			elAnimal.hacerSonido();
			elAnimal.comer();
			elAnimal.dormir();
	} else {
		System.out.println("Introduce un animal que esté disponible!");
	}

	
}
}
