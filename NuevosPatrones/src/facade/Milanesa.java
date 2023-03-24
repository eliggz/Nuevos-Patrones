package facade;

public class Milanesa implements Comida{
	public String comidaPreparada;
	
	public void prepararComida(String ingredientesRequeridos) {
	comidaPreparada="Milanesa al horno - "+ ingredientesRequeridos;
		
	}

	@Override
	public String entregaDeComida() {
		// TODO Auto-generated method stub
		return comidaPreparada;
	}
	
}
