package com.poi.singlenton;

public class Main {

	public static void main(String[] args) {
		
		// 3 relojes usando el patrón singlenton	
		Reloj r = Reloj.getInstancia();
		Reloj r2 = Reloj.getInstancia();
		Reloj r3 = Reloj.getInstancia();
	}

}
