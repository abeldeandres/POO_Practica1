package HerenciaMultiple;

public class VehiculoGrande extends Vehiculo {
	protected double longitud;
	protected double altura;
	
	public VehiculoGrande(String matricula, String marca, String modelo,double l,double a) {
		super(matricula, marca, modelo);
		this.altura=a;
		this.longitud=l;
	}
	
	
}
