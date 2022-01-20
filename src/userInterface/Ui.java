package userInterface;

import java.util.Scanner;

public class Ui {
	
	public void showMenuPrincipal() {
		System.out.println("Bienvenido a esta versi�n de la app MiVacuna. tenga en cuenta que al elegir la opci�n de descargar certificado de vacuna, es necesario que llene los datos que all� se solicitan, \n las demas opciones son en base a una base de datos preestablecida.");
		System.out.println("Seleccione una opci�n: ");
		System.out.println("--------MEN� OPCIONES---------");
		System.out.print(" 1. Consultar N�mero de personas vacunadas en un lapso de tiempo dado. \n 2. Diagramar n�mero de personas vacunadas en cada mes.\n 3. Consultar n�mero de personas vacunadas en un rango de edad dado. \n 4. Diagramar n�mero de personas vacunadas por rangos de edades(d�cadas).\n 5. Consular n�mero de personas vacunadas discriminando por n�mero de dosis recibidas. \n 6. Descargar Certificado de vacunaci�n. \n 7. Agregar personas a la base de datos. \n 8. Salir. \n");	
	}
	
	public void showMenuOpcion1() {
		System.out.println("Ha seleccionado la opci�n 1.");
		System.out.println("A continuaci�n ingrese el a�o y mes de consulta (Formato: AAAA y MM): ");
	}
	public void showMenuOpcion2() {
		System.out.println("Ha seleccionado la opci�n 2.");
		System.out.println("A continuaci�n se presenta un Histograma que muestra el n�mero de personas vacunadas en el a�o 2021, discriminando por el mes de vacunaci�n");
	}
	public void showMenuOpcion3() {
		System.out.println("Ha seleccionado la opci�n 3.");
		System.out.println("A continuaci�n ingrese el rango de edad que desea consultar: ");

	}
	public void showMenuOpcion4() {
		System.out.println("Ha seleccionado la opci�n 4.");
		System.out.println("A continuaci�n se presenta un Histograma que muestra el n�mero de personas vacunadas discriminando por un rango de edades espec�fico (D�cadas)");
	}
	public void showMenuOpcion5() {
		System.out.println("Ha seleccionado la opci�n 5.");
		System.out.println("A continuaci�n ingrese para que n�mero de dosis quiere consultar, en el dado caso que quiera saber el n�mero de personas con dosis �nica, ingrese 'DOSIS �NICA': ");
	}
	public void showMenuOpcion6() {
		System.out.println("Ha seleccionado la opci�n 6.");
		System.out.println("A continuaci�n ingrese los datos del paciente y el vacunador, luego podr� tener su certificado de vacunaci�n. ");
	}
	public void showMenuOpcion7() {
		System.out.println("Ha seleccionado la opci�n 7.");
		System.out.println("A continuaci�n ingrese los datos del paciente. ");
	}
	
	public String readFromKeyboard() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextLine().trim();
	}
}
