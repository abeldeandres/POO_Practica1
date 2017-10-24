package Excepciones;

public class Main {
	
	public static void main(String args[]){
		
		Mes m=new Mes();
		
		try {
			m.leerMes("mayo");
			
		} catch (ExcepcionMes e) {
			e.printStackTrace();
		} catch(Exception e1){
			
		}
		
	}
}
