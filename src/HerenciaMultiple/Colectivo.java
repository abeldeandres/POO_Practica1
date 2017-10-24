package HerenciaMultiple;

public class Colectivo extends VehiculoGrande {
	private String baño;
	private int numAsientos;
	

	public Colectivo(String matricula, String marca, String modelo, String baño, int numAsientos,double l,double a) {
		super(matricula, marca, modelo,l,a);
		this.baño=baño;
		this.numAsientos=numAsientos;
	}



	public String getTipo()
	{
		return "Colectivo";
	}
}
