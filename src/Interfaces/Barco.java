package Interfaces;

public class Barco implements F,M{

	
	@Override
	public int funcionM() {
		System.err.println("M");
		return 0;
	}

	@Override
	public int funcionF() {
		System.out.println("F");
		return 0;
	}

}
