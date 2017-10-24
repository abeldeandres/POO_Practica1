package SobrecargSobreasignacion;

public class Matematica {
	
	/*
	 * Hablamos de sobrecarga cuando usamos el Mismo nombre
	 * de una funcion para hacer mas funciones
	 * Puede tener el mismo numero de argumentos, pero distinos tipos.
	 * O distino numero de argumentos.
	 * NUNCA FIJARSE EN LA DEVOLUCION
	 * */
	
	/**
	 * Funcion principal, oslo acepta Numeros positivos, en los reales
	 * @param n entero
	 * @return entero
	 */
	public static int factorial(int n){
		System.out.println(Constantes.PHI);
		
		return 0;
	}

	
	/**
	 * Funcion que sobrecarga a la anterior
	 * @param n entero largo
	 * @return entero largo
	 */
	public static long factorial(long n){
		
		return 0;
	}
	
	/**
	 * Sobrecarga a lñas anteriores
	 * @param n
	 * @param lim
	 * @return
	 */
	public static long factorial(int n, int lim){
		
		return 0;
	}
	
}
