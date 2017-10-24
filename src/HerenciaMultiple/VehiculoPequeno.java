package HerenciaMultiple;

public class VehiculoPequeno extends Vehiculo{
	protected int numPuertas;
	protected int numAsientos;
	
	public VehiculoPequeno(String matricula, String marca, String modelo,int np,int na) {
		super(matricula, marca, modelo);
		this.numAsientos=na;
		this.numPuertas=np;
	}
	
}
