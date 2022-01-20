package userInterface;

import java.util.Scanner;

public class Ui {
	
	public void showMenuPrincipal() {
		System.out.println("Bienvenido a esta versión de la app MiVacuna. tenga en cuenta que al elegir la opción de descargar certificado de vacuna, es necesario que llene los datos que allí se solicitan, \n las demas opciones son en base a una base de datos preestablecida.");
		System.out.println("Seleccione una opción: ");
		System.out.println("--------MENÚ OPCIONES---------");
		System.out.print(" 1. Consultar Número de personas vacunadas en un lapso de tiempo dado. \n 2. Diagramar número de personas vacunadas en cada mes.\n 3. Consultar número de personas vacunadas en un rango de edad dado. \n 4. Diagramar número de personas vacunadas por rangos de edades(décadas).\n 5. Consular número de personas vacunadas discriminando por número de dosis recibidas. \n 6. Descargar Certificado de vacunación. \n 7. Agregar personas a la base de datos. \n 8. Salir. \n");	
	}
	
	public void showMenuOpcion1() {
		System.out.println("Ha seleccionado la opción 1.");
		System.out.println("A continuación ingrese el año y mes de consulta (Formato: AAAA y MM): ");
	}
	public void showMenuOpcion2() {
		System.out.println("Ha seleccionado la opción 2.");
		System.out.println("A continuación se presenta un Histograma que muestra el número de personas vacunadas en el año 2021, discriminando por el mes de vacunación");
	}
	public void showMenuOpcion3() {
		System.out.println("Ha seleccionado la opción 3.");
		System.out.println("A continuación ingrese el rango de edad que desea consultar: ");

	}
	public void showMenuOpcion4() {
		System.out.println("Ha seleccionado la opción 4.");
		System.out.println("A continuación se presenta un Histograma que muestra el número de personas vacunadas discriminando por un rango de edades específico (Décadas)");
	}
	public void showMenuOpcion5() {
		System.out.println("Ha seleccionado la opción 5.");
		System.out.println("A continuación ingrese para que número de dosis quiere consultar, en el dado caso que quiera saber el número de personas con dosis única, ingrese 'DOSIS ÚNICA': ");
	}
	public void showMenuOpcion6() {
		System.out.println("Ha seleccionado la opción 6.");
		System.out.println("A continuación ingrese los datos del paciente y el vacunador, luego podrá tener su certificado de vacunación. ");
	}
	public void showMenuOpcion7() {
		System.out.println("Ha seleccionado la opción 7.");
		System.out.println("A continuación ingrese los datos del paciente. ");
	}
	
	public String readFromKeyboard() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextLine().trim();
	}
}
