package com.mitocode.ejercicio6.referencias.metodos;

public class Programa1 {
	
	static void referenciaMetodoStatic() {
		System.out.println("Metodo static");
	}
	

	public static void main(String[] args) {

		IOperacion op1 = () -> {
			int x = 5;
			int y = 3;
			System.out.println("# hojas impresas: "+ (x + y));
		};
		op1.imprimir();
		
		// Referenciar a un metodo static
		IOperacion op2 = () -> Programa1.referenciaMetodoStatic();
		op2.imprimir();
		
		// Simplificado
		IOperacion op3 = Programa1::referenciaMetodoStatic;
		op3.imprimir();
		
	}

}
