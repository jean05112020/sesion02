package com.mitocode.ejercicio4.metodos.defecto;

public class Programa {

	public static void main(String[] args) {

		IOperacion op = (x, y) -> x + y;
		System.out.println("Suma: " + op.suma(5, 3));

		System.out.println("PI : " + op.valorPI());

		op.metodoDefectoConParametros("Suma");
		
		System.out.println("Resta: " + op.resta(5, 3));
	}

}
