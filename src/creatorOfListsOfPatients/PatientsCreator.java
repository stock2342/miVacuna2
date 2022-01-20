package creatorOfListsOfPatients;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.TreeSet;

import data.Patient;
import data.PersonalId;
import data.Vaccine;

public class PatientsCreator {
	private int numberOfPatients;
	private TreeSet<String> ids;
	
	public PatientsCreator(int numberOfPatients) {
		this.numberOfPatients = numberOfPatients;
		this.ids = new TreeSet<String>();
	}
	
	private static String setName() {
		String []names = {"Aarón", "Ander", "Joaquín",
				"Abel", "Andrés", "Joel",
				"Abelardo", "Ángel", "Jon",
				"Abraham", "Aníbal", "Jordi",
				"Adalberto", "Antonio", "Jorge",
				"Adam", "Arnau", "José",
				"Adán", "Arturo", "Jose Antonio",
				"Adiran", "Asier","Jose Luis",
				"Adolfo", "Augusto", "Jose Manuel",
				"Adrià", "Aurelio", "Jose Maria",
				"Adrián", "Baltasar", "Juan",
				"Agustín", "Bartolomé", "Blas",
				"Aimar", "Basilio", "Juan Antonio",
				"Aitor", "Benito", "Boris",
				"Alano", "Benjamín", "Juan Carlos",
				"Alberto", "Bernardo", "Borja",
				"Aldo", "Brahim",
				"Aleix", "Blas", "Brais",
				"Alejandro", "Boris", "Bruno",
				"Alejo", "Borja", "Calisto",
				"Alex", "Brahim", "Juan José",
				"Alfonso", "Brais", "Camilo",
				"Alfredo", "Bruno", "Juan Manuel",
				"Alonso", "Calisto", "Carlos",
				"Álvaro", "Camilo", "Julio",
				"Amadeo", "Carlos", "Cayetano",
				"Amado", "Cayetano", "César",
				"Amando", "Christian",
				"Ambrosio", "Claudio",
				"Amin", "Clemente",
				"Anastasio","Conrado",
				"Ander", "Constantino", "María", "Juliana", "Natalia",
				"Gabriela", "Aura", "Juanita", "Luciana", "Isabella",
				"Matilde", "Ana", "Nicolas", "Juan", "Sofia"};
		Random rand = new Random();
		return names[rand.nextInt(names.length)];	
	}
	
	private static String setSurname() {
		String []surname = {"Acosta", "Acuña", "Aguilar", "Aguirre", "Agustín", "Ahumada", "Alanis", "Alarcón", "Alayón", "Alcázar", "Alcocer", "Alfaro", "Almendárez", "Altamirano", "Álvarez", "Alzate", "Amador", "Anaya", "Argüelles", "Arjona", "Arriaga", "Arrollo", "Ayala", 
				"Caballero", "Cabeza", "Cabrera", "Cadenas", "Caldera", "Calleja", "Calles", "Camacho", "Camareno", "Camarillo", "Campos", "Cárdenas", "Cardoso", "Carranza", "Carrillo", "Carvajal", "Carvallo", "Casas", "Castellanos", "Castañeda", "Cepeda", "Cerda", "Cervantes", "Céspedes", "Cevallos", "Cevedo", "Chávez", "Chavira", 
				"Cisneros", "Collado", "Cordero", "Cornejo", "Correa", "Corro", "Cuéllar", "Cuervo", "Cuesta", "Cuevas"};
		Random rand = new Random();
		return surname[rand.nextInt(surname.length)] + " " + surname[rand.nextInt(surname.length)];
	}
	
	private static String setDateOfBirth() {
		String month = "", day = "";
		Random rand = new Random();
		GregorianCalendar gc = new GregorianCalendar();
		
		int year = 1930 + rand.nextInt(84);
		gc.set(Calendar.YEAR, year);
		
		int dayOfYear = 1 + rand.nextInt(gc.getActualMaximum(Calendar.DAY_OF_YEAR) + 1);
		gc.set(Calendar.DAY_OF_YEAR, dayOfYear);
		
		if(gc.get(Calendar.MONTH) + 1 < 10)
			month = "0";
		if(gc.get(Calendar.DAY_OF_MONTH) < 10)
			day = "0";
		
		return gc.get(Calendar.YEAR) + "-" + month + (gc.get(Calendar.MONTH) + 1) + "-" + day + gc.get(Calendar.DAY_OF_MONTH); 
	}
	
	private static String setTypeOfId() {
		String []types = {"C.C.", "PASAPORTE"};
		Random rand = new Random();
		return types[rand.nextInt(types.length)];
	}
	
	private String setNumberOfId() {
//		String id = "";
//		Random rand = new Random();
//		id = "1"+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
//		return id;
		
		String digits = "0123456789";
		Random rand = new Random();
		String id ="";
		do {
			id = "1";
			for(int i = 0; i<8; i++) {
				int index = rand.nextInt(10);
				id = id + digits.charAt(index);	
			}
		} while(!this.ids.add(id));
		return id;
	}
	
	private static String setVaccineMaker() {
		String []vaccineMakers = {"Pfizer", "Moderna", "Astrazeneca", "Sputnik"};
		Random rand = new Random();
		return vaccineMakers[rand.nextInt(vaccineMakers.length)];
	}
	
	private static String setVaccinationDate() {
		String month = "", day = "";
		Random rand = new Random();
		GregorianCalendar gc = new GregorianCalendar();
		
		int year = 2021;
		gc.set(Calendar.YEAR, year);
		
		int dayOfYear = 1 + rand.nextInt(gc.getActualMaximum(Calendar.DAY_OF_YEAR) + 1);
		gc.set(Calendar.DAY_OF_YEAR, dayOfYear);
		
		if(gc.get(Calendar.MONTH) + 1 < 10)
			month = "0";
		if(gc.get(Calendar.DAY_OF_MONTH) < 10)
			day = "0";
		
		return gc.get(Calendar.YEAR) + "-" + month + (gc.get(Calendar.MONTH) + 1) + "-" + day + gc.get(Calendar.DAY_OF_MONTH);
	}
	
	private static String setNumberOfDosis() {
		String []dosis = {"1", "2", "DOSIS ÚNICA"};
		Random rand = new Random();
		return dosis[rand.nextInt(dosis.length)];
	}
	
	private  Patient createPatients() {
		String name = setName();
		String surname = setSurname();
		LocalDate dateOfBirth = LocalDate.parse(setDateOfBirth());
		String typeOfId = setTypeOfId();
		String numberOfId = setNumberOfId();
		String numberOfDosis = setNumberOfDosis();
		String vaccineMaker;
		if(numberOfDosis.equals("DOSIS ÚNICA"))
			vaccineMaker = "Jannsen";
		else
			vaccineMaker = setVaccineMaker();
		LocalDate vaccinationDate = LocalDate.parse(setVaccinationDate());
		PersonalId id = new PersonalId(typeOfId, numberOfId);
		Vaccine vaccine = new Vaccine(vaccineMaker, vaccinationDate, numberOfDosis);
		return new Patient(name, surname, dateOfBirth, id, vaccine);
	}
	
	public ArrayList<Patient> generateListOfPatients(ArrayList<Patient> patients){
		int counter = this.numberOfPatients;
		for(int i = 0; i<counter; i++) {
			Patient patient = createPatients();
			patients.add(patient);
		}
		return patients;
	}
	
}
