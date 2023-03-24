package factory;

public class AnimalFactory {

	public static Animal crearAnimal(String tipoAnimal) {
		Animal newAnimal = null;

		if(tipoAnimal.equalsIgnoreCase("M")) {
			return new Mono();
		} else 
			
		if(tipoAnimal.equalsIgnoreCase("P")) {
				return new Perro();
			} else 
				
		if(tipoAnimal.equalsIgnoreCase("T")) {
					return new Tortuga();
				} else 
		return null;
	}

}
