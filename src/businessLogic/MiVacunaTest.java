/**POO: Desarrollo taller 3
 * 
 */
package businessLogic;


import java.time.LocalDate;
import java.util.ArrayList;

import creatorOfListsOfPatients.PatientsCreator;
import data.Patient;
import data.PersonalId;
import data.Vaccinator;
import data.Vaccine;
import userInterface.Ui;

/**
 * @author Juan Nicolas Romero Ortiz
 *
 */
public class MiVacunaTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		ArrayList<Patient> list = new ArrayList<Patient>();
		Ui ui = new Ui();
		int c = 500;
		PatientsCreator pCreator = new PatientsCreator(c);
		list = pCreator.generateListOfPatients(list);
		AdministratorPatientUsers admin = new AdministratorPatientUsers();
		HistogramCreator hc = new HistogramCreator();
		//admin.showUsers(list);
		int option = 0;
		while(option != 8) {
			ui.showMenuPrincipal();
			option = Integer.parseInt(ui.readFromKeyboard());
			switch(option) {
			case 1://1. Consultar N�mero de personas vacunadas en un lapso de tiempo dado.
				ui.showMenuOpcion1();
				System.out.print("Ingrese el a�o (Formato AAAA): ");
				int year = Integer.parseInt(ui.readFromKeyboard());
				System.out.print("Ingrese el mes (Formato MM): ");
				int month = Integer.parseInt(ui.readFromKeyboard());
				ArrayList<Patient> listSortedByVaccinationDate = new ArrayList<Patient>();
				listSortedByVaccinationDate = admin.setByVaccinationDate(year, month, list);
				System.out.println();
				System.out.println("El n�mero de personas vacunadas para el a�o " + year + " y el mes " + month + " fueron: " + admin.numberOfElements(listSortedByVaccinationDate));
				admin.showUsers(listSortedByVaccinationDate);
				System.out.println();
				break;
			case 2://2. Diagramar n�mero de personas vacunadas en cada mes.
				ui.showMenuOpcion2();
				hc.createHistogramByMonths(list);
				break;
			
			case 3://3. Consultar n�mero de personas vacunadas en un rango de edad dado. 
				ui.showMenuOpcion3();
				System.out.print("Ingrese la edad inicial del rango: ");
				int a = Integer.parseInt(ui.readFromKeyboard());
				System.out.print("Ingrese la edad final del rango: ");
				int b = Integer.parseInt(ui.readFromKeyboard());
				ArrayList<Patient> listSortedByAge = new ArrayList<Patient>();
				listSortedByAge = admin.setByAge(a, b, list);
				System.out.println();
				System.out.println("El n�mero de personas vacunadas entre los " + a +" y los "+ b + " a�os son: " + admin.numberOfElements(listSortedByAge));
				admin.showUsers(listSortedByAge);
				System.out.println();
				break;
			case 4://4. Diagramar n�mero de personas vacunadas por rangos de edades(d�cadas).
				ui.showMenuOpcion4();
				hc.createHistogramByAges(list);
				break;
			case 5://5. Consular n�mero de personas vacunadas discriminando por n�mero de dosis recibidas. 
				ui.showMenuOpcion5();
				System.out.print("Ingrese el indice de b�squeda,  recuerde que si quiere ver el n�mero de personas con dosis �nica, debe escribir 'DOSIS �NICA': ");
				String index = ui.readFromKeyboard();
				ArrayList<Patient> listSortedByNumberOfDosis = new ArrayList<Patient>();
				listSortedByNumberOfDosis = admin.setByNumberOfDosis(index, list);
				System.out.println();
				if(index.equals("DOSIS �NICA")) 
					System.out.println("El n�mero de personas vacunadas, para el esquema de vacunaci�n de DOSIS �NICA es : " + admin.numberOfElements(listSortedByNumberOfDosis));
				
				else
					System.out.println("El n�mero de personas vacunadas, para el esquema de vacunaci�n de " + index + " dosis es: " + admin.numberOfElements(listSortedByNumberOfDosis));
				admin.showUsers(listSortedByNumberOfDosis);
				System.out.println();
				break;
			case 6://6. Descargar Certificado de vacunaci�n. 
				ui.showMenuOpcion6();
				System.out.println("Por favor ingrese los siguientes datos: ");
				System.out.print("Nombre del paciente: ");
				String patientName = ui.readFromKeyboard();
				System.out.print("Apellidos del paciente: ");
				String patientSurname = ui.readFromKeyboard();
				System.out.print("Fecha de nacimiento del paciente (Formato AAAA-MM-DD): ");
				LocalDate patientDateOfBirth = LocalDate.parse(ui.readFromKeyboard());
				System.out.print("Tipo de identificaci�n del paciente: ");
				String patientIdType = ui.readFromKeyboard();
				System.out.print("N�mero de identificaci�n del paciente: ");
				String patientIdNumber = ui.readFromKeyboard();
				
				System.out.print("Nombre del vacunador: ");
				String vaccinatorName = ui.readFromKeyboard();
				System.out.print("Apellido del vacunador: ");
				String vaccinatorSurname = ui.readFromKeyboard();
				System.out.print("Tipo de documento del vacunador: ");
				String vaccinatorIdType = ui.readFromKeyboard();
				System.out.print("Numero de documento del vacunador: ");
				String vaccinatorIdNumber = ui.readFromKeyboard();
				System.out.print("Nombre del hospital donde fue aplicada la vacuna: ");
				String hospitalName = ui.readFromKeyboard();
				
				LocalDate vaccinationDate = LocalDate.now();
				System.out.print("Nombre de la vacuna aplicada: ");
				String vaccinationMaker = ui.readFromKeyboard();
				System.out.print("Dosis (1, 2 o DOSIS �NICA): ");
				String numberOfDosis = ui.readFromKeyboard();
				
				PersonalId patientId = new PersonalId(patientIdType, patientIdNumber);
				PersonalId vaccinatorId = new PersonalId(vaccinatorIdType, vaccinatorIdNumber);
				Vaccine vaccineAplicated = new Vaccine(vaccinationMaker, vaccinationDate, numberOfDosis);
				
				Patient patient = new Patient(patientName, patientSurname, patientDateOfBirth, patientId, vaccineAplicated);
				Vaccinator vaccinator = new Vaccinator(vaccinatorName, vaccinatorSurname, vaccinatorId, hospitalName);
				
				CreateVaccinationCard card1 = new CreateVaccinationCard(patient, vaccinator);
				System.out.println("A continuaci�n se presenta su certificado de vacunaci�n: ");
				card1.printVaccinationCard();
				break;
			case 7://7. Agregar personas a la base de datos. 
				ui.showMenuOpcion7();
				
				  System.out.print("Nombre: "); 
				  String name = ui.readFromKeyboard();
				  System.out.print("Apellido: "); 
				  String surname = ui.readFromKeyboard();
				  System.out.print("Fecha de nacimiento(AAAA-MM-DD): "); 
				  LocalDate dateOfBirth= LocalDate.parse(ui.readFromKeyboard());
				  System.out.print("Tipo de Id: ");
				  String typeOfId = ui.readFromKeyboard();
				  System.out.print("N�mero de Id: ");
				  String numberOfId = ui.readFromKeyboard();
				  System.out.print("Fabricante de la vacuna aplicada: ");
				  String vaccineMaker = ui.readFromKeyboard();
				  System.out.print("Fecha de vacunaci�n(AAAA-MM-DD): ");
				  LocalDate vaccinationDate1 = LocalDate.parse(ui.readFromKeyboard());
				  System.out.print("N�mero de dosis: "); 
				  String numberOfDosis1 = ui.readFromKeyboard();
				  
				  Vaccine vaccineAplicated1 = new Vaccine(vaccineMaker, vaccinationDate1,
				  numberOfDosis1);
				  PersonalId id = new PersonalId(typeOfId, numberOfId);
				  Patient patient1 = new Patient(name, surname, dateOfBirth, id, vaccineAplicated1);
				  list.add(patient1);
				  System.out.println("Se han ingresado los datos con �xito");
				  break;
			case 8:// Salir
				System.exit(0);
				break;	
			default:
				System.out.println("Has seleccionado una opci�n incorrecta");
			}
		}
		
//		admin.showUsers(list);
//		System.out.println("El n�mero de registros son: " + admin.numberOfElements(list));
//		
//		String searchId = "1657542776";
//		ArrayList<Patient> listSortedById = new ArrayList<Patient>();
//		listSortedById = admin.sortById(searchId, list);
//		admin.showUsers(listSortedById);
//		System.out.println("El n�mero de registros son: " + admin.numberOfElements(listSortedById));
		

		

		

		
	}

}
