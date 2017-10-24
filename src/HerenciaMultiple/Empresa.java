package HerenciaMultiple;
import java.util.ArrayList;
import java.util.Scanner;


public class Empresa {
	private ArrayList<Clientes>  arrayClientes;
	private ArrayList<Vehiculo> arrayVStock;
	private ArrayList<Vehiculo> arrayVendidos;
	Scanner sc = new Scanner(System.in);
	
	private Clientes buscarCliente(String DNI) {
			int i=0;
			boolean encontrado=false;
			Clientes clienteEncontrado=null;
			while(i<arrayClientes.size() && !encontrado){
				if(arrayClientes.get(i).getDNI().equalsIgnoreCase(DNI)){
					encontrado=true;
					clienteEncontrado=arrayClientes.get(i);
				}
				i++;
			}
			return clienteEncontrado;
	}
	
	public void AltaCliente(Clientes cliente)
	{
		Clientes ClienteAux = buscarCliente(cliente.getDNI());
		if (ClienteAux!=null)
		{
			System.out.println("El cliente ya existe");
		}
		else
		{
			arrayClientes.add(cliente);
		}
	}
	public void ModificarCliente(String DNI, String Nombre, String Apellidos, String Direccion)
	{
		Clientes Cliente = buscarCliente(DNI);
		Cliente=buscarCliente(DNI);
		if (Cliente != null)
		{
			Cliente.setNombre(Nombre);
		}
		else 
		{
			System.out.println("El cliente no existe");
		}
	}
	
	public ArrayList<Clientes> listaClientes(){
		return this.arrayClientes;		
	}
	
	public ArrayList<Sedan> listaSedanEnStock(){
		ArrayList<Sedan> liSedan=new ArrayList<>();
		for(int i=0;i<arrayVStock.size();i++){
			Vehiculo v = arrayVStock.get(i);
			if( v instanceof Sedan){
				liSedan.add((Sedan)v);
			}
		}
		return liSedan;
	}
	//listarCamion,...
	
	public void agregarVehiculo(Vehiculo vehiculo)
	{
		Vehiculo vehiculoAux = buscarEnStock(vehiculo.getMatricula());
		if (vehiculoAux !=null)
		{
			System.out.println("YA EXISTE ESA MATRICULA");
		}
		else
		{
			arrayVStock.add(vehiculo);
		}
	}

	private Vehiculo buscarEnStock(String matricula) {
		int i=0;
		boolean encontrado=false;
		Vehiculo vehiculoEncontrado=null;
		while(i<arrayVStock.size() && !encontrado){
			if(arrayVStock.get(i).getMatricula().equalsIgnoreCase(matricula)){
				encontrado=true;
				vehiculoEncontrado=arrayVStock.get(i);
			}
			i++;
		}
		return vehiculoEncontrado;
	}
	
	private void venderVehiculo(String matricula,String dni){
		Clientes c= buscarCliente(dni);
		Vehiculo v= buscarEnStock(matricula);
		
		if(c!=null && v!=null){
			//Se agrega el vehiculo al inventario
			this.arrayVendidos.add(v);
			c.agregarVehiculo(v);
		}
		
	}
}
