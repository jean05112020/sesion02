package com.mitocode.ejercicio3.scope;

public class Programa2 {
	
	public void variablesLocales() {
		
		// Variable local por defecto se envia como final
		int z = 10;
		
		IOperacion op1 = new IOperacion() {

			@Override
			public int suma(int x, int y) {
//				z = 20;
				return x + y + z;
			}
		};
		System.out.println("Clase anonima : " + op1.suma(5, 3));
		
		IOperacion op2 = (x, y) -> {
//			z = 20;
			return x + y + z;
		};
		System.out.println("Lambda : " + op1.suma(5, 3));
	}

	public static void main(String[] args) {

		Programa2 p = new Programa2();
		p.variablesLocales();
	}

}
