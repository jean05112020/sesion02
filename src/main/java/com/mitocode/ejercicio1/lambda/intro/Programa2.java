package com.mitocode.ejercicio1.lambda.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa2 {

	public static void main(String[] args) {

		List<Empleado> lista = new ArrayList<>();

		Empleado e1 = new Empleado("Dany", 2000, 29);
		Empleado e2 = new Empleado("Juan", 1500, 25);
		Empleado e3 = new Empleado("Pedro", 2300, 32);

		lista.add(e1);
		lista.add(e2);
		lista.add(e3);

		Comparator<Empleado> comparator = new Comparator<Empleado>() {

			@Override
			public int compare(Empleado o1, Empleado o2) {
				// TODO Auto-generated method stub
//				return -o1.getNombres().compareTo(o2.getNombres());
				if (o1.getEdad() < o2.getEdad()) {
					return -1;
				} else if (o1.getEdad() > o2.getEdad()) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		Collections.sort(lista, comparator);
		System.out.println("Lista de empleados:");
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}

	}

}
