package HerenciaMultiple;

public class Colectivo extends VehiculoGrande {
	private String ba�o;
	private int numAsientos;
	

	public Colectivo(String matricula, String marca, String modelo, String ba�o, int numAsientos,double l,double a) {
		super(matricula, marca, modelo,l,a);
		this.ba�o=ba�o;
		this.numAsientos=numAsientos;
	}



	public String getTipo()
	{
		return "Colectivo";
	}
}
