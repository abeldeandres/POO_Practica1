package HerenciaMultiple;
import java.util.Scanner;
import java.util.Vector;

import SobrecargSobreasignacion.*;

public class Main {
	public static void mostrarMenu(){
		System.out.println("Menu principal");
		System.out.println("______________");
		System.out.println("1.- Gestionar Clientes");
		System.out.println("2.- Gestionar Almacen");
		System.out.println("0.- Salir");
		
		System.out.println("Elija la opción:");
	}
	
	public static void opGestionarClientes()
	{
		int opcion =0;
		Scanner sc = new Scanner(System.in);
		boolean salir=false;

		do
		{
			System.out.println("Menu Gestionar Clientes");
			System.out.println("______________");
			System.out.println("1.- Dar de alta a un cliente");
			System.out.println("2.- Modificar datos de un cliente");
			System.out.println("3.- Mostrar datos de un cliente");
			System.out.println("4.- Mostrar todos los clientes");
			System.out.println("0.- Volver al menu principal");
			
			System.out.println("Elija la opción:");
			opcion= sc.nextInt();
			switch (opcion)
			{
			case 1:
				//Cliente c=new Cliente......
				//empresa.altaCliente(c);
				break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 0: salir=true; break;
			}
		} while (salir =true);
	}
	
	public static void opGestionarAgregarVehiculoStock()
	{
		Scanner sc = new Scanner(System.in);
		int opcion =0;
		do
		{
			System.out.println("Agregar un nuevo vehiculo al Stock");
			System.out.println("______________");
			System.out.println("1.- Agregar Furgoneta");
			System.out.println("2.- Agregar Camión");
			System.out.println("3.- Agregar Sedan");
			System.out.println("4.- Agregar Colectivo");
			System.out.println("0.- Volver al menu principal");
			
			System.out.println("Elija la opción:");
			opcion= sc.nextInt();
			switch (opcion)
			{
				case 1:
					//Furgoneta f=new Furgoneta......
					//empresa.altaVehiculo(f);
					break;
				case 2:
					//Camion c=new Camion......
					//empresa.altaVehiculo(f);					
					break;
				case 3: 
					//Colectivo f=new Colectivo......
					//empresa.altaVehiculo(f);
					break;
				case 4:
					
					
					
					break;
					
			}
		} while (opcion !=0);
	}
	
	public static void opGestionarVehiculos()
	{
		Scanner sc = new Scanner(System.in);
		int opcion =0;
		do
		{
			System.out.println("Menu Gestionar Vehiculos");
			System.out.println("______________");
			System.out.println("1.- Agregar un nuevo vehiculo al Stock");
			System.out.println("2.- Vender un vehiculo");
			System.out.println("3.- Mostrar datos de un vehiculo");
			System.out.println("4.- Mostrar todos los vehiculos");
			System.out.println("0.- Volver al menu principal");
			
			System.out.println("Elija la opción:");
			opcion= sc.nextInt();
			switch (opcion)
			{
			case 1: opGestionarAgregarVehiculoStock(); break;
			case 2: break;
			case 3: break;
			case 4: break;
			}
		} while (opcion !=0);
	}
	
	
	public static void main(String[] args) {
		
		Vehiculo v=new Sedan("XXXXM","Toyota", "algo", 3,5,"Verde");
		
		//No se puede, se puede castear
		//Sedan s=new VehiculoPequeño("sss","asdasd", "asdasd", 4,3);
		
		
		//Si VehiculoGrande fuera abstract
		//Primero, Vechiculo tendria por obligacion que ser abstract
		//y No podria hacer:
		VehiculoGrande vg = new VehiculoGrande("sss", "sss", "ssss", 32,32);
		
		// TODO Auto-generated method stub
		boolean salir= false;
		int opcion=0;
		Scanner sc = new Scanner(System.in);
		do{
			mostrarMenu();
			opcion= sc.nextInt();
			
			
			switch (opcion)
			{
			case 1: opGestionarClientes(); break;
			case 2: opGestionarVehiculos(); break;
			case 0:
				System.out.println("Gracias por utilizar la aplicación");
				salir=true;
				break;
			default:
				System.out.println("Por favor, introduzca una opcion correcta, del 0 al 10, ambos inclusive.");
				break;	
			}
		} while (salir=true);
	}

}
