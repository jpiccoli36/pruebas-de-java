package Controlador;

import java.util.ArrayList;
import java.util.Scanner;

import Persona.Persona;

public class Controlador {

	Scanner s = new Scanner(System.in);
	ArrayList<Persona> pe = new ArrayList<Persona>();

	public Controlador() {

		pe.add(new Persona("jose", "piccoli", "123123", true));
		pe.add(new Persona("analia", "salazar", "123321", true));
	}

	public void Alta(Persona p) {
		System.out.println("ingreso a la funcion");
		pe.add(p);
	}

	public void Baja(String dni) {
		for (Persona per : pe) {
			if (per.getDNI().equals(dni)) {
				pe.remove(per);
				break;
			}
		}
	}

	public void Modifica(Persona p) {
		for (Persona per : pe) {
			if (per.getDNI().equals(p.getDNI())) {
				pe.remove(per);
				break;
			}
		}

		Persona per;
		System.out.println("ingrese nuevo nombre");
		String n = s.nextLine();
		System.out.println("ingrese nuevo apellido");
		String a = s.nextLine();
		System.out.println("esta habilitado?Si(s)-No(n)");
		String h = s.nextLine();
		if (h.equals("s")) {
			boolean ha = true;
			per = new Persona(n, a, p.getDNI(), ha);
		} else {
			boolean ha = false;
			per = new Persona(n, a, p.getDNI(), ha);
		}

		this.pe.add(per);
	}

	public void consulta() {
		for (Persona p : pe) {
			System.out.println("Nombre: " + p.getNombre() + "\n" + "Apellido: " + p.getApellido() + "\n" + "DNI: "
					+ p.getDNI() + "\n" + "Habilitado :" + p.isHabilitado());

		}

	}

	public void PorDni(Persona p) {

			
			for (Persona per : pe) {
				if (per.getDNI().equals(p.getDNI())) {
					System.out.println("Nombre: " + per.getNombre() + "\nApellido: " + per.getApellido() + "\nDni: "
							+ per.getDNI() + "\nEsta Habilitado? " + per.isHabilitado());
					break;
				} 
			}

		}

	

	public void porNombre(String Nombre, String Apellido) {
		for (Persona per : pe) {
			if (per.getNombre().equals(Nombre)) {
				if (per.getApellido().equals(Apellido)) {

					System.out.println("Nombre: " + per.getNombre() + "\nApellido: " + per.getApellido() + "\nDni: "
							+ per.getDNI() + "\nEsta Habilitado? " + per.isHabilitado());
					break;
				}
			}

		}
	}

}
