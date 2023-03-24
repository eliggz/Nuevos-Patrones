package facade;

public class Cliente {

	
	public static void main(String[] args) {
		
		//CÓMO QUEDA USANDO EL PATRÓN FACHADA:
				System.out.println("****************FACHADA****************");
				System.out.println(Mesero.entregarComida(Platos.NIOQUISCONTUCO));
				System.out.println(Mesero.entregarComida(Platos.MILANESA));
				
				
				
				
				
				
				
				
				
				
				//CÓMO QUEDARÍA SIN USAR EL PATRÓN FACADE
				
		/*	Ingredientes ingredient =  new Ingredientes();
	
	Comida nioquis = new Nioquis();
	String nioquisIngredientes = Ingredientes.getNioquisIngredientes();
	nioquis.prepararComida(nioquisIngredientes);
	System.out.println(nioquis.entregaDeComida());
	
	
	Comida milanesa = new Milanesa();
	String milanesaIngredientes = Ingredientes.getMilanesaIngredientes();
	milanesa.prepararComida(milanesaIngredientes);
	System.out.println(milanesa.entregaDeComida());
	*/
	
	
	
	}

	
}
