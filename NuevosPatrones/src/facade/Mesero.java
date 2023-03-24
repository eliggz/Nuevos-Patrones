package facade;

public class Mesero {
	public static String entregarComida(Platos plato) {
		Ingredientes ingrediente = new Ingredientes();
		
		switch(plato) {
		case MILANESA:
			Comida milanesa = new Milanesa();
			String milanesaIngredientes = Ingredientes.getMilanesaIngredientes();
			milanesa.prepararComida(milanesaIngredientes);
			return milanesa.entregaDeComida();
			

		case NIOQUISCONTUCO:
			Comida nioquis = new Nioquis();
			String nioquisIngredientes = Ingredientes.getNioquisIngredientes();
			nioquis.prepararComida(nioquisIngredientes);
			return nioquis.entregaDeComida();
		
		}
		return null;
	}
}
