package HerenciaMultiple;
public class Camion extends Vehiculo {
	private int caballos;
	private int numNeumaticos;
	
	
	
	public Camion(String matricula, String marca, String modelo, int caballos, int numNeumaticos) {
		super(matricula, marca, modelo);
		this.caballos =caballos;
		this.numNeumaticos= numNeumaticos;
	}



	public String getTipo()
	{
		return "Camion";
	}
	
}
