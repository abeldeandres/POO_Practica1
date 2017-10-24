package HerenciaMultiple;
public final class Furgoneta extends VehiculoGrande {
	private float peso;
	private final int numPuertas;
	
	public Furgoneta(String matricula, String marca, String modelo, double a, double l, float peso, int numPuertas) {
		super(matricula, marca, modelo,l,a);
		this.peso= peso;
		this.numPuertas=numPuertas;
	}
	
	
	
}
