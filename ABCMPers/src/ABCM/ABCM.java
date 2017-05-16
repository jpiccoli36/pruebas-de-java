package ABCM;

import java.util.Scanner;

import Controlador.Controlador;
import Persona.Persona;

public class ABCM {

	Controlador ctr;
	
	
	public void Start(){
		ctr=new Controlador();
		String rta = "s";
		Scanner s = new Scanner(System.in);	
			
		while(rta.equals("s")){
		System.out.println("\n\n################\n\n");
		System.out.println("¿Que accion desea realizar?");
		System.out.println("A- Alta");
		System.out.println("B-Baja");
		System.out.println("M-Modificacion");
		System.out.println("C- Consulta");
		System.out.println("S- salir");
		rta = s.nextLine();
		Persona p = new Persona();
		switch (rta.toLowerCase()) {
		case "a":			
			alta(p);
			System.out.println("hacer otra accion Si(s)-No(n)?");
			rta=s.nextLine();
			break;
		case "b":
			System.out.println("ingrese el dni de la persona");
			String dni= s.nextLine();
			ctr.Baja(dni);
			System.out.println("hacer otra accion Si(s)-No(n)?");
			rta=s.nextLine();
			break;
		case "m":
			modifica(p);
			System.out.println("hacer otra accion Si(s)-No(n)?");
			rta=s.nextLine();
			break;
		case "c":
			consulta();
			System.out.println("hacer otra accion Si(s)-No(n)?");
			rta=s.nextLine();
			break;
			default:
				rta="n";
				break;
		}
		}
		System.out.println("Fin Del Programa");
		s.close();
	}
	
	private void modifica(Persona p){
		Scanner w= new Scanner(System.in);
		System.out.println("ingrese el dni de la persona a modificar");
		p.setDNI(w.nextLine());
		ctr.Modifica(p);
		w.close();
		
		
	}
private void alta(Persona p){
	Scanner w= new Scanner(System.in);
	System.out.println("ingrese el nombre");
	p.setNombre(w.nextLine());
	System.out.println("ingrese el apellido");
	p.setApellido(w.nextLine());
	System.out.println("ingrese el dni");
	p.setDNI(w.nextLine());
	System.out.println("esta habilitado?1-si 2-no");
	String rta=w.nextLine();
	if(rta.equalsIgnoreCase("1"))
	{
		p.setHabilitado(true);
	}else{
		p.setHabilitado(false);
	}
	ctr.Alta(p);
	w.close();
}
public void consulta(){
	Scanner w = new Scanner(System.in);	
	System.out.println("\n\n Consultar Personas");
	System.out.println("#################");
	System.out.println("Ingrese Opcion");
	System.out.println("1-Listar Todos");
	System.out.println("2-Buscar por DNI");
	System.out.println("3-Buscar por Nombre y Apellido");
	String rta = w.nextLine();
	switch (rta) {
	case "1":
		ctr.consulta();
		break;
	case "2":
		Persona p= new Persona();
		System.out.println("ingrese el DNi");
		p.setDNI(w.nextLine());
		ctr.PorDni(p);
		break;
	case "3":
		System.out.println("ingrese Nombre");
		String n=w.nextLine();
		System.out.println("ingrese apellido");
		String a=w.nextLine();
		ctr.porNombre(n,a);
		break;
	default:
		break;
	}	
	
}
	}


