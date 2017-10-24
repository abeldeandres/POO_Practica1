package HerenciaMultiple;
public class Sedan extends VehiculoPequeno {
	private String color;
	
	public Sedan(String matricula, String marca, String modelo, int numPuertas, int numAsientos,String color) {
		super(matricula, marca, modelo,numPuertas,numAsientos);
		this.color=color;
	}


	public String getTipo()
	{
		return color;
	}
	
	@Override
	public boolean equals(Object obj){
		
		return true;
	}
	
	
	
}
