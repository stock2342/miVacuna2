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
		String []names = {"Aar�n", "Ander", "Joaqu�n",
				"Abel", "Andr�s", "Joel",
				"Abelardo", "�ngel", "Jon",
				"Abraham", "An�bal", "Jordi",
				"Adalberto", "Antonio", "Jorge",
				"Adam", "Arnau", "Jos�",
				"Ad�n", "Arturo", "Jose Antonio",
				"Adiran", "Asier","Jose Luis",
				"Adolfo", "Augusto", "Jose Manuel",
				"Adri�", "Aurelio", "Jose Maria",
				"Adri�n", "Baltasar", "Juan",
				"Agust�n", "Bartolom�", "Blas",
				"Aimar", "Basilio", "Juan Antonio",
				"Aitor", "Benito", "Boris",
				"Alano", "Benjam�n", "Juan Carlos",
				"Alberto", "Bernardo", "Borja",
				"Aldo", "Brahim",
				"Aleix", "Blas", "Brais",
				"Alejandro", "Boris", "Bruno",
				"Alejo", "Borja", "Calisto",
				"Alex", "Brahim", "Juan Jos�",
				"Alfonso", "Brais", "Camilo",
				"Alfredo", "Bruno", "Juan Manuel",
				"Alonso", "Calisto", "Carlos",
				"�lvaro", "Camilo", "Julio",
				"Amadeo", "Carlos", "Cayetano",
				"Amado", "Cayetano", "C�sar",
				"Amando", "Christian",
				"Ambrosio", "Claudio",
				"Amin", "Clemente",
				"Anastasio","Conrado",
				"Ander", "Constantino", "Mar�a", "Juliana", "Natalia",
				"Gabriela", "Aura", "Juanita", "Luciana", "Isabella",
				"Matilde", "Ana", "Nicolas", "Juan", "Sofia"};
		Random rand = new Random();
		return names[rand.nextInt(names.length)];	
	}
	
	private static String setSurname() {
		String []surname = {"Acosta", "Acu�a", "Aguilar", "Aguirre", "Agust�n", "Ahumada", "Alanis", "Alarc�n", "Alay�n", "Alc�zar", "Alcocer", "Alfaro", "Almend�rez", "Altamirano", "�lvarez", "Alzate", "Amador", "Anaya", "Arg�elles", "Arjona", "Arriaga", "Arrollo", "Ayala", 
				"Caballero", "Cabeza", "Cabrera", "Cadenas", "Caldera", "Calleja", "Calles", "Camacho", "Camareno", "Camarillo", "Campos", "C�rdenas", "Cardoso", "Carranza", "Carrillo", "Carvajal", "Carvallo", "Casas", "Castellanos", "Casta�eda", "Cepeda", "Cerda", "Cervantes", "C�spedes", "Cevallos", "Cevedo", "Ch�vez", "Chavira", 
				"Cisneros", "Collado", "Cordero", "Cornejo", "Correa", "Corro", "Cu�llar", "Cuervo", "Cuesta", "Cuevas"};
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
		String []dosis = {"1", "2", "DOSIS �NICA"};
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
		if(numberOfDosis.equals("DOSIS �NICA"))
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
