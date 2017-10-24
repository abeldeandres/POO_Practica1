package HerenciaMultiple;
import java.util.ArrayList;


public class Clientes {
	private String DNI;
	private String Nombre;
	private String Apellido;
	private String Direccion;
	private ArrayList<Vehiculo> TieneVehiculos;

	
	public Clientes(String dNI, String nombre, String apellido,String direccion) {
		DNI = dNI;
		Nombre = nombre;
		Apellido = apellido;
		Direccion = direccion;
		TieneVehiculos = new ArrayList<>();//Vacio
	}


	public String getDNI()
	{
		return this.DNI;
	}
	
	public String ToString()
	{
		return DNI+""+Nombre+""+"\n";
	}


	public void setNombre(String nombre2) {
		this.Nombre=nombre2;
	}

	private Vehiculo buscaVehiculo(String matricula){
		int i=0;
		boolean encontrado=false;
		Vehiculo v=null;
		while(i<TieneVehiculos.size()){
			if(TieneVehiculos.get(i).getMatricula().equalsIgnoreCase(matricula)){
				encontrado=true;
				v=TieneVehiculos.get(i);
			}
			i++;
		}	
		return v;
	}
	public void agregarVehiculo(Vehiculo v) {
		Vehiculo vAux = buscaVehiculo(v.getMatricula());
		if(vAux==null){
			TieneVehiculos.add(v);
		}		
	}
	
	
	
}
