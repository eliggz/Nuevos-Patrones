package facade;

public class Nioquis implements Comida{
	public String comidaPreparada;
	
	public void prepararComida(String ingredientesRequeridos) {
	comidaPreparada="Nioquis con tuco - "+ ingredientesRequeridos;
		
	}

	@Override
	public String entregaDeComida() {
		// TODO Auto-generated method stub
		return comidaPreparada;
	}
	
}
