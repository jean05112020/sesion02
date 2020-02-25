package com.mitocode.ejercicio3.scope;

public class Programa1 {
	
	// Variable global
	int entero;
	float flotante;
	double decimal;
	String cadena;
	boolean estado;
	
	public void variablesGlobales() {
		System.out.println("int = " + entero);
		System.out.println("float = " + flotante);
		System.out.println("double = " + decimal);
		System.out.println("String = " + cadena);
		System.out.println("boolean = " + estado);
	}
	
	public void variablesLocales() {
//		Variables locales -> Necesitan ser inicializadas con un valor
		int entero2 = 10;
		double decimal2;
		System.out.println(entero2);
//		System.out.println(decimal2);
	}

	public static void main(String[] args) {
		
		Programa1 p = new Programa1();
		p.variablesGlobales();
	}
}
