package Excepciones;

public class Mes {
	String nombre;
	
	//No devuelve nada por que es "void", pero en caso de erro devuelve un objeto de tipo ExcepcionMes
	public void leerMes(String mes) throws ExcepcionMes{
		if(mes.equals("abril")){
			nombre=mes;
		}
		else throw new ExcepcionMes();//Como return
	}
	
	public String getMes(){
		return nombre;
	}
}
